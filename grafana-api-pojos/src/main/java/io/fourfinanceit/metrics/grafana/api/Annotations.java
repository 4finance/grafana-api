package io.fourfinanceit.metrics.grafana.api;

import java.util.List;

public class Annotations {
    private final List<Annotation> list;

    public Annotations(List<Annotation> list) {
        this.list = list;
    }

    public List<Annotation> getList() {
        return list;
    }
}