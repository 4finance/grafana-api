package io.fourfinanceit.metrics.grafana.api;

public class SeriesOverride {
    private final String alias;
    private final String color;

    private SeriesOverride(String alias, String color) {
        this.alias = alias;
        this.color = color;
    }

    public static SeriesOverride seriesOverride(String alias, String color) {
        return new SeriesOverride(alias, color);
    }

    public String getAlias() {
        return alias;
    }

    public String getColor() {
        return color;
    }
}