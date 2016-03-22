package io.fourfinanceit.metrics.grafana.api;

public enum AnnotationDataSource {
    GRAPHITE;

    public String asLabel() {
        return this.name().toLowerCase();
    }
}