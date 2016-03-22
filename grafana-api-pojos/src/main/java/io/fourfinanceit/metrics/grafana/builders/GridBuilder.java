package io.fourfinanceit.metrics.grafana.builders;


import io.fourfinanceit.metrics.grafana.api.Grid;

public class GridBuilder {
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

    private final PanelBuilder panelBuilder;

    public GridBuilder(PanelBuilder panelBuilder) {
        this.panelBuilder = panelBuilder;
    }

    public GridBuilder withLeftLogBase(Integer leftLogBase) {
        this.leftLogBase = leftLogBase;
        return this;
    }

    public GridBuilder withLeftMax(Integer leftMax) {
        this.leftMax = leftMax;
        return this;
    }

    public GridBuilder withLeftMin(Integer leftMin) {
        this.leftMin = leftMin;
        return this;
    }

    public GridBuilder withRightLogBase(Integer rightLogBase) {
        this.rightLogBase = rightLogBase;
        return this;
    }

    public GridBuilder withRightMax(Integer rightMax) {
        this.rightMax = rightMax;
        return this;
    }

    public GridBuilder withRightMin(Integer rightMin) {
        this.rightMin = rightMin;
        return this;
    }

    public GridBuilder withThreshold1(Integer threshold1) {
        this.threshold1 = threshold1;
        return this;
    }

    public GridBuilder withThreshold1Color(String threshold1Color) {
        this.threshold1Color = threshold1Color;
        return this;
    }

    public GridBuilder withThreshold2(Integer threshold2) {
        this.threshold2 = threshold2;
        return this;
    }

    public GridBuilder withThreshold2Color(String threshold2Color) {
        this.threshold2Color = threshold2Color;
        return this;
    }

    public PanelBuilder endGrid() {
        return panelBuilder.withGrid(buildGrid());
    }

    private Grid buildGrid() {
        Grid result = new Grid();
        result.setLeftLogBase(leftLogBase);
        result.setLeftMax(leftMax);
        result.setLeftMin(leftMin);
        result.setRightLogBase(rightLogBase);
        result.setRightMax(rightMax);
        result.setRightMin(rightMin);
        result.setThreshold1(threshold1);
        result.setThreshold1Color(threshold1Color);
        result.setThreshold2(threshold2);
        result.setThreshold2Color(threshold2Color);
        return result;
    }
}