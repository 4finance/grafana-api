package io.fourfinanceit.metrics.grafana.publishing;

import io.fourfinanceit.metrics.grafana.DashboardDescriptor;
import io.fourfinanceit.metrics.grafana.api.CreateDashboardRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static java.lang.invoke.MethodHandles.lookup;
import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
@ConditionalOnBean(DashboardDescriptor.class)
class DashboardPublisher implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(lookup().lookupClass());

    private final DashboardDescriptor dashboardDescriptor;
    private final GrafanaProperties grafanaProperties;
    private final GrafanaPublishingProperties grafanaPublishingProperties;

    @Autowired
    DashboardPublisher(DashboardDescriptor dashboardDescriptor, GrafanaProperties grafanaProperties, GrafanaPublishingProperties grafanaPublishingProperties) {
        this.dashboardDescriptor = dashboardDescriptor;
        this.grafanaProperties = grafanaProperties;
        this.grafanaPublishingProperties = grafanaPublishingProperties;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            requireNonNull(grafanaProperties.getHost(), "Grafana host cannot be null");
            requireNonNull(grafanaPublishingProperties.getApiToken(), "Grafana api token cannot be null");

            HttpHeaders headers = new HttpHeaders();
            headers.set(AUTHORIZATION, "Bearer " + grafanaPublishingProperties.getApiToken());
            headers.setAccept(singletonList(APPLICATION_JSON));
            headers.setContentType(APPLICATION_JSON);

            new RestTemplate().exchange(grafanaProperties.getHost() + "/api/dashboards/db", POST,
                    new HttpEntity<>(new CreateDashboardRequest(dashboardDescriptor.dashboard(), true), headers), Void.class);

            logger.info("Dashboard was published");
        } catch (Exception e) {
            logger.error("Exception caught: ", e);
        }
    }
}