package io.fourfinanceit.metrics.grafana.api;

public class Tooltip {
    private boolean shared;
    private String valueType;

    public Tooltip() {
    }

    public Tooltip(boolean shared, String valueType) {
        this.shared = shared;
        this.valueType = valueType;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }
}