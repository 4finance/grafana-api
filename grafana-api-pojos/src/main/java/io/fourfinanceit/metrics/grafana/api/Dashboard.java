package io.fourfinanceit.metrics.grafana.api;

import java.util.List;
import java.util.Set;

public class Dashboard {
    private Long id;
    private String title;
    private String originalTitle;
    private Set<String> tags;
    private String style;
    private String timezone;
    private boolean editable;
    private boolean hideControls;
    private boolean sharedCrosshair;
    private List<Row> rows;
    private Time time;
    private String refresh;
    private String schemaVersion;
    private String version;
    private Set<String> links;
    private Annotations annotations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isHideControls() {
        return hideControls;
    }

    public void setHideControls(boolean hideControls) {
        this.hideControls = hideControls;
    }

    public boolean isSharedCrosshair() {
        return sharedCrosshair;
    }

    public void setSharedCrosshair(boolean sharedCrosshair) {
        this.sharedCrosshair = sharedCrosshair;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Set<String> getLinks() {
        return links;
    }

    public void setLinks(Set<String> links) {
        this.links = links;
    }

    public Annotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }
}