package io.fourfinanceit.metrics.grafana.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

public class Panel {
    private Set<String> aliasColors;
    private boolean bars;
    private String datasource;
    private boolean editable;
    private boolean error;
    private Integer fill;
    private Integer id;
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
    private Set<SeriesOverride> seriesOverrides;
    private Integer span;
    private boolean stack;
    private boolean steppedLine;
    private List<Target> targets;
    private String timeFrom;
    private String timeShift;
    private String title;
    private Tooltip tooltip;
    private String type;
    private boolean xAxis;
    private boolean yAxis;
    private List<String> yFormats;
    private String leftYAxisLabel;

    public Set<String> getAliasColors() {
        return aliasColors;
    }

    public void setAliasColors(Set<String> aliasColors) {
        this.aliasColors = aliasColors;
    }

    public boolean isBars() {
        return bars;
    }

    public void setBars(boolean bars) {
        this.bars = bars;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public Integer getFill() {
        return fill;
    }

    public void setFill(Integer fill) {
        this.fill = fill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public boolean isLines() {
        return lines;
    }

    public void setLines(boolean lines) {
        this.lines = lines;
    }

    public Integer getLinewidth() {
        return linewidth;
    }

    public void setLinewidth(Integer linewidth) {
        this.linewidth = linewidth;
    }

    public Set<String> getLinks() {
        return links;
    }

    public void setLinks(Set<String> links) {
        this.links = links;
    }

    public String getNullPointMode() {
        return nullPointMode;
    }

    public void setNullPointMode(String nullPointMode) {
        this.nullPointMode = nullPointMode;
    }

    public boolean isPercentage() {
        return percentage;
    }

    public void setPercentage(boolean percentage) {
        this.percentage = percentage;
    }

    public Integer getPointradius() {
        return pointradius;
    }

    public void setPointradius(Integer pointradius) {
        this.pointradius = pointradius;
    }

    public boolean isPoints() {
        return points;
    }

    public void setPoints(boolean points) {
        this.points = points;
    }

    public String getRenderer() {
        return renderer;
    }

    public void setRenderer(String renderer) {
        this.renderer = renderer;
    }

    public Set<SeriesOverride> getSeriesOverrides() {
        return seriesOverrides;
    }

    public void setSeriesOverrides(Set<SeriesOverride> seriesOverrides) {
        this.seriesOverrides = seriesOverrides;
    }

    public Integer getSpan() {
        return span;
    }

    public void setSpan(Integer span) {
        this.span = span;
    }

    public boolean isStack() {
        return stack;
    }

    public void setStack(boolean stack) {
        this.stack = stack;
    }

    public boolean isSteppedLine() {
        return steppedLine;
    }

    public void setSteppedLine(boolean steppedLine) {
        this.steppedLine = steppedLine;
    }

    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeShift() {
        return timeShift;
    }

    public void setTimeShift(String timeShift) {
        this.timeShift = timeShift;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("x-axis")
    public boolean isxAxis() {
        return xAxis;
    }

    public void setxAxis(boolean xAxis) {
        this.xAxis = xAxis;
    }

    @JsonProperty("y-axis")
    public boolean isyAxis() {
        return yAxis;
    }

    public void setyAxis(boolean yAxis) {
        this.yAxis = yAxis;
    }

    @JsonProperty("y_formats")
    public List<String> getyFormats() {
        return yFormats;
    }

    public void setyFormats(List<String> yFormats) {
        this.yFormats = yFormats;
    }

    public String getLeftYAxisLabel() {
        return leftYAxisLabel;
    }

    public void setLeftYAxisLabel(String leftYAxisLabel) {
        this.leftYAxisLabel = leftYAxisLabel;
    }
}