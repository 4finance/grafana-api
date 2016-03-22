package io.fourfinanceit.metrics.grafana.builders;

import io.fourfinanceit.metrics.grafana.api.Legend;

public class LegendBuilder {
    private boolean avg;
    private boolean current;
    private boolean max;
    private boolean min;
    private boolean show;
    private boolean total;
    private boolean values;

    private final PanelBuilder panelBuilder;

    public LegendBuilder(PanelBuilder panelBuilder) {
        this.panelBuilder = panelBuilder;
    }

    public LegendBuilder withAvg(boolean avg) {
        this.avg = avg;
        return this;
    }

    public LegendBuilder withCurrent(boolean current) {
        this.current = current;
        return this;
    }

    public LegendBuilder withMax(boolean max) {
        this.max = max;
        return this;
    }

    public LegendBuilder withMin(boolean min) {
        this.min = min;
        return this;
    }

    public LegendBuilder withShow(boolean show) {
        this.show = show;
        return this;
    }

    public LegendBuilder withTotal(boolean total) {
        this.total = total;
        return this;
    }

    public LegendBuilder withValues(boolean values) {
        this.values = values;
        return this;
    }

    public PanelBuilder endLegend() {
        return panelBuilder.withLegend(buildLegend());
    }

    private Legend buildLegend() {
        Legend result = new Legend();
        result.setAvg(avg);
        result.setCurrent(current);
        result.setMax(max);
        result.setMin(min);
        result.setShow(show);
        result.setTotal(total);
        result.setValues(values);
        return result;
    }
}