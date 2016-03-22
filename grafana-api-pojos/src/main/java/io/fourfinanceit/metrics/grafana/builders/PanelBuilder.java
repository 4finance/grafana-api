package io.fourfinanceit.metrics.grafana.builders;


import io.fourfinanceit.metrics.grafana.api.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.asList;

public class PanelBuilder {
    private Set<String> aliasColors = new HashSet<>();
    private boolean bars;
    private String datasource;
    private boolean editable;
    private boolean error;
    private Integer fill;
    private Grid grid;
    private Legend legend;
    private boolean lines;
    private Integer linewidth;
    private Set<String> links;
    private String nullPointMode;
    private boolean percentage;
    private Integer pointradius;
    private boolean points;
    private String renderer;
    private Set<SeriesOverride> seriesOverrides = new HashSet<>();
    private Integer span;
    private boolean stack;
    private boolean steppedLine;
    private List<Target> targets = new ArrayList<>();
    private String timeFrom;
    private String timeShift;
    private String title;
    private Tooltip tooltip;
    private String type;
    private boolean xAxis;
    private boolean yAxis;
    private List<String> yFormats = new ArrayList<>();
    private String leftYAxisLabel;

    private final RowBuilder rowBuilder;
    private final AtomicInteger idIndexHolder;

    public PanelBuilder(RowBuilder rowBuilder, AtomicInteger idIndexHolder) {
        this.rowBuilder = rowBuilder;
        this.idIndexHolder = idIndexHolder;
    }

    public PanelBuilder withAliasColors(String... aliasColors) {
        this.aliasColors.addAll(asList(aliasColors));
        return this;
    }

    public PanelBuilder withBars(boolean bars) {
        this.bars = bars;
        return this;
    }

    public PanelBuilder withDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }

    public PanelBuilder withEditable(boolean editable) {
        this.editable = editable;
        return this;
    }

    public PanelBuilder withError(boolean error) {
        this.error = error;
        return this;
    }

    public PanelBuilder withFill(Integer fill) {
        this.fill = fill;
        return this;
    }

    public GridBuilder withGrid() {
        return new GridBuilder(this);
    }

    public PanelBuilder withGrid(Grid grid) {
        this.grid = grid;
        return this;
    }

    public LegendBuilder withLegend() {
        return new LegendBuilder(this);
    }

    public PanelBuilder withLegend(Legend legend) {
        this.legend = legend;
        return this;
    }

    public PanelBuilder withLines(boolean lines) {
        this.lines = lines;
        return this;
    }

    public PanelBuilder withLinewidth(Integer linewidth) {
        this.linewidth = linewidth;
        return this;
    }

    public PanelBuilder withLinks(String... links) {
        this.links.addAll(asList(links));
        return this;
    }

    public PanelBuilder withNullpointMode(String nullPointMode) {
        this.nullPointMode = nullPointMode;
        return this;
    }

    public PanelBuilder withPercentage(boolean percentage) {
        this.percentage = percentage;
        return this;
    }

    public PanelBuilder withPointradius(Integer pointradius) {
        this.pointradius = pointradius;
        return this;
    }

    public PanelBuilder withPoints(boolean points) {
        this.points = points;
        return this;
    }

    public PanelBuilder withRenderer(String renderer) {
        this.renderer = renderer;
        return this;
    }

    public PanelBuilder withSeriesOverrides(SeriesOverride... seriesOverrides) {
        this.seriesOverrides.addAll(asList(seriesOverrides));
        return this;
    }

    public PanelBuilder withSpan(Integer span) {
        this.span = span;
        return this;
    }

    public PanelBuilder withStack(boolean stack) {
        this.stack = stack;
        return this;
    }

    public PanelBuilder withSteppedLine(boolean steppedLine) {
        this.steppedLine = steppedLine;
        return this;
    }

    public PanelBuilder withTargets(Target... targets) {
        this.targets.addAll(asList(targets));
        return this;
    }

    public PanelBuilder withTargets(Collection<Target> targets) {
        this.targets.addAll(targets);
        return this;
    }

    public PanelBuilder withTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
        return this;
    }

    public PanelBuilder withTimeShift(String timeShift) {
        this.timeShift = timeShift;
        return this;
    }

    public PanelBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public PanelBuilder withTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public PanelBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public PanelBuilder withXAxis(boolean xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public PanelBuilder withYAxis(boolean yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public PanelBuilder withYFormats(String... yFormats) {
        this.yFormats.addAll(asList(yFormats));
        return this;
    }

    public PanelBuilder withLeftYAxisLabel(String leftYAxisLabel) {
        this.leftYAxisLabel = leftYAxisLabel;
        return this;
    }

    public RowBuilder endPanel() {
        rowBuilder.addPanel(buildPanel());
        return rowBuilder;
    }

    private Panel buildPanel() {
        Panel result = new Panel();
        result.setAliasColors(aliasColors);
        result.setBars(bars);
        result.setDatasource(datasource);
        result.setEditable(editable);
        result.setError(error);
        result.setFill(fill);
        result.setId(idIndexHolder.incrementAndGet());
        result.setGrid(grid);
        result.setLegend(legend);
        result.setLines(lines);
        result.setLinewidth(linewidth);
        result.setLinks(links);
        result.setNullPointMode(nullPointMode);
        result.setPercentage(percentage);
        result.setPointradius(pointradius);
        result.setPoints(points);
        result.setRenderer(renderer);
        result.setSeriesOverrides(seriesOverrides);
        result.setSpan(span);
        result.setStack(stack);
        result.setSteppedLine(steppedLine);
        result.setTargets(targets);
        result.setTimeFrom(timeFrom);
        result.setTimeShift(timeShift);
        result.setTitle(title);
        result.setTooltip(tooltip);
        result.setType(type);
        result.setxAxis(xAxis);
        result.setyAxis(yAxis);
        result.setyFormats(yFormats);
        result.setLeftYAxisLabel(leftYAxisLabel);
        return result;
    }
}