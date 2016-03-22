package io.fourfinanceit.metrics.grafana.builders;


import io.fourfinanceit.metrics.grafana.api.Panel;
import io.fourfinanceit.metrics.grafana.api.Row;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RowBuilder {
    private boolean collapse;
    private boolean editable;
    private String height;
    private List<Panel> panels = new ArrayList<>();

    private final GrafanaDashboardBuilder.DashboardInCreation dashboardInCreation;
    private final AtomicInteger idIndexHolder;

    public RowBuilder(GrafanaDashboardBuilder.DashboardInCreation dashboardInCreation, AtomicInteger idIndexHolder) {
        this.dashboardInCreation = dashboardInCreation;
        this.idIndexHolder = idIndexHolder;
    }

    public RowBuilder withCollapse(boolean collapse) {
        this.collapse = collapse;
        return this;
    }

    public RowBuilder withEditable(boolean editable) {
        this.editable = editable;
        return this;
    }

    public RowBuilder withHeight(String height) {
        this.height = height;
        return this;
    }

    public PanelBuilder withPanel() {
        return new PanelBuilder(this, idIndexHolder);
    }

    public RowBuilder addPanel(Panel panel) {
        this.panels.add(panel);
        return this;
    }

    public GrafanaDashboardBuilder.DashboardInCreation endRow() {
        dashboardInCreation.addRow(buildRow());
        return dashboardInCreation;
    }

    private Row buildRow() {
        Row result = new Row();
        result.setCollapse(collapse);
        result.setEditable(editable);
        result.setHeight(height);
        result.setPanels(panels);
        return result;
    }
}