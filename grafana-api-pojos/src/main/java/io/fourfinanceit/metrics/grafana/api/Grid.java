package io.fourfinanceit.metrics.grafana.api;

public class Grid {
    private Integer leftLogBase;
    private Integer leftMax;
    private Integer leftMin;
    private Integer rightLogBase;
    private Integer rightMax;
    private Integer rightMin;
    private Integer threshold1;
    private String threshold1Color;
    private Integer threshold2;
    private String threshold2Color;

    public Integer getLeftLogBase() {
        return leftLogBase;
    }

    public void setLeftLogBase(Integer leftLogBase) {
        this.leftLogBase = leftLogBase;
    }

    public Integer getLeftMax() {
        return leftMax;
    }

    public void setLeftMax(Integer leftMax) {
        this.leftMax = leftMax;
    }

    public Integer getLeftMin() {
        return leftMin;
    }

    public void setLeftMin(Integer leftMin) {
        this.leftMin = leftMin;
    }

    public Integer getRightLogBase() {
        return rightLogBase;
    }

    public void setRightLogBase(Integer rightLogBase) {
        this.rightLogBase = rightLogBase;
    }

    public Integer getRightMax() {
        return rightMax;
    }

    public void setRightMax(Integer rightMax) {
        this.rightMax = rightMax;
    }

    public Integer getRightMin() {
        return rightMin;
    }

    public void setRightMin(Integer rightMin) {
        this.rightMin = rightMin;
    }

    public Integer getThreshold1() {
        return threshold1;
    }

    public void setThreshold1(Integer threshold1) {
        this.threshold1 = threshold1;
    }

    public String getThreshold1Color() {
        return threshold1Color;
    }

    public void setThreshold1Color(String threshold1Color) {
        this.threshold1Color = threshold1Color;
    }

    public Integer getThreshold2() {
        return threshold2;
    }

    public void setThreshold2(Integer threshold2) {
        this.threshold2 = threshold2;
    }

    public String getThreshold2Color() {
        return threshold2Color;
    }

    public void setThreshold2Color(String threshold2Color) {
        this.threshold2Color = threshold2Color;
    }
}