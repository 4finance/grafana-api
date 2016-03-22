package io.fourfinanceit.metrics.grafana.api;

public class Target {
    private String refId;
    private String target;

    public Target() {
    }

    public Target(char refId, String target) {
        this.refId = String.valueOf(refId);
        this.target = target;
    }
    
    public Target(String refId, String target) {
        this.refId = refId;
        this.target = target;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}