package io.fourfinanceit.metrics.grafana.api;

public class Time {
    private String from;
    private String to;

    public Time() {
    }

    public Time(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}