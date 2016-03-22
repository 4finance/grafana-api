package io.fourfinanceit.metrics.grafana.api;

public class CreateDashboardRequest {
    private final Dashboard dashboard;
    private final boolean overwrite;

    public CreateDashboardRequest(Dashboard dashboard, boolean overwrite) {
        this.dashboard = dashboard;
        this.overwrite = overwrite;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public boolean isOverwrite() {
        return overwrite;
    }
}