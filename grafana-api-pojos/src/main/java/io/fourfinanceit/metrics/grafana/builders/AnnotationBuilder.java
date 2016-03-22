package io.fourfinanceit.metrics.grafana.builders;

import io.fourfinanceit.metrics.grafana.api.Annotation;
import io.fourfinanceit.metrics.grafana.api.AnnotationDataSource;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class AnnotationBuilder {
    private final List<Integer> validSizes = asList(7, 8, 9, 10, 13, 15, 17, 20, 25, 30);
    private AnnotationDataSource dataSource;
    private Boolean enabled;
    private String name;
    private String target;
    private List<String> tags = new ArrayList<>();
    private Boolean showLine;
    private String lineColor;
    private Integer iconSize;
    private String iconColor;

    private final GrafanaDashboardBuilder.DashboardInCreation dashboardInCreation;

    public AnnotationBuilder(GrafanaDashboardBuilder.DashboardInCreation dashboardInCreation) {
        this.dashboardInCreation = dashboardInCreation;
    }

    public AnnotationBuilder isEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AnnotationBuilder forDataSource(AnnotationDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public AnnotationBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AnnotationBuilder withTags(String... tags) {
        this.tags.addAll(asList(tags));
        return this;
    }

    public AnnotationBuilder withTarget(String target) {
        this.target = target;
        return this;
    }

    public AnnotationBuilder showingVerticalLine(Boolean showLine) {
        this.showLine = showLine;
        return this;
    }

    public AnnotationBuilder withVerticalLineColour(String colourExperssion) {
        this.lineColor = colourExperssion;
        return this;
    }

    public AnnotationBuilder withIconSize(Integer iconSize) {
        this.iconSize = iconSize;
        return this;
    }

    public AnnotationBuilder withIconColour(String iconColour) {
        this.iconColor = iconColour;
        return this;
    }

    public GrafanaDashboardBuilder.DashboardInCreation endAnnotation() {
        this.dashboardInCreation.addAnnotation(this.build());
        return this.dashboardInCreation;
    }

    public Annotation build() {
        final Annotation annotation = new Annotation();

        annotation.setEnable(this.enabled);
        annotation.setDatasource(this.dataSource.asLabel());
        annotation.setName(this.name);
        annotation.setTags(String.join(" ", this.tags));
        annotation.setTarget(this.target);
        annotation.setIconSize(this.iconSize);
        annotation.setIconColor(this.iconColor);
        annotation.setShowLine(this.showLine);
        annotation.setLineColor(this.lineColor);

        return annotation;
    }
}
