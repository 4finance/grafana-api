package io.fourfinanceit.metrics.grafana.api;

import java.util.Set;

public class Timepicker {
    private boolean collapse;
    private boolean enable;
    private boolean notice;
    private boolean now;
    private Set<String> refreshIntervals;
    private String status;
    private Set<String> timeOptions;
    private String type;

    public boolean isCollapse() {
        return collapse;
    }

    public void setCollapse(boolean collapse) {
        this.collapse = collapse;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isNotice() {
        return notice;
    }

    public void setNotice(boolean notice) {
        this.notice = notice;
    }

    public boolean isNow() {
        return now;
    }

    public void setNow(boolean now) {
        this.now = now;
    }

    public Set<String> getRefreshIntervals() {
        return refreshIntervals;
    }

    public void setRefreshIntervals(Set<String> refreshIntervals) {
        this.refreshIntervals = refreshIntervals;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<String> getTimeOptions() {
        return timeOptions;
    }

    public void setTimeOptions(Set<String> timeOptions) {
        this.timeOptions = timeOptions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}