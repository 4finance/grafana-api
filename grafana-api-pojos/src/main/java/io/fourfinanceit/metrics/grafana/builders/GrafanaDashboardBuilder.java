package io.fourfinanceit.metrics.grafana.builders;


import io.fourfinanceit.metrics.grafana.api.Dashboard;
import io.fourfinanceit.metrics.grafana.api.Row;
import io.fourfinanceit.metrics.grafana.api.Time;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.asList;

public class GrafanaDashboardBuilder {

    public DashboardInCreation create() {
        return new DashboardInCreation();
    }

    public class DashboardInCreation {
        private Long id;
        private String title;
        private String originalTitle;
        private Set<String> tags = new HashSet<>();
        private String style;
        private String timezone;
        private boolean editable;
        private boolean hideControls;
        private boolean sharedCrosshair;
        private List<Row> rows = new ArrayList<>();
        private Time time;
        private String refresh;
        private String schemaVersion;
        private String version;
        private Set<String> links = new HashSet<>();

        public DashboardInCreation withId(Long id) {
            this.id = id;
            return this;
        }

        public DashboardInCreation withTitle(String title) {
            this.title = title;
            return this;
        }

        public DashboardInCreation withOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
            return this;
        }

        public DashboardInCreation withTags(String... tags) {
            this.tags.addAll(asList(tags));
            return this;
        }

        public DashboardInCreation withStyle(String style) {
            this.style = style;
            return this;
        }

        public DashboardInCreation withTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public DashboardInCreation withEditable(boolean editable) {
            this.editable = editable;
            return this;
        }

        public DashboardInCreation withHideControls(boolean hideControls) {
            this.hideControls = hideControls;
            return this;
        }

        public DashboardInCreation withSharedCrosshair(boolean sharedCrosshair) {
            this.sharedCrosshair = sharedCrosshair;
            return this;
        }

        public RowBuilder withRow(AtomicInteger idIndexHolder) {
            return new RowBuilder(this, idIndexHolder);
        }

        public DashboardInCreation addRow(Row row) {
            this.rows.add(row);
            return this;
        }

        public DashboardInCreation withTime(Time time) {
            this.time = time;
            return this;
        }

        public DashboardInCreation withRefresh(String refresh) {
            this.refresh = refresh;
            return this;
        }

        public DashboardInCreation withSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        public DashboardInCreation withVersion(String version) {
            this.version = version;
            return this;
        }

        public DashboardInCreation withLinks(String... links) {
            this.links.addAll(asList(links));
            return this;
        }

        public Dashboard build() {
            Dashboard result = new Dashboard();
            result.setId(id);
            result.setTitle(title);
            result.setOriginalTitle(originalTitle);
            result.setTags(tags);
            result.setStyle(style);
            result.setTimezone(timezone);
            result.setEditable(editable);
            result.setHideControls(hideControls);
            result.setSharedCrosshair(sharedCrosshair);
            result.setRows(rows);
            result.setTime(time);
            result.setRefresh(refresh);
            result.setSchemaVersion(schemaVersion);
            result.setVersion(version);
            result.setLinks(links);
            return result;
        }
    }
}