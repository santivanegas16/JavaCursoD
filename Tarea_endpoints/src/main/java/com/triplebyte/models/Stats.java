package com.triplebyte.models;

import java.util.List;

public class Stats {
    List<Number> order;
    float mean;
    double median;
    double mode;

    public Stats(List<Number> order, float mean, double median, double mode) {
        this.order = order;
        this.mean = mean;
        this.median = median;
        this.mode = mode;

    }
    public List getOrder() {
        return order;
    }
    public float getMean() {
        return mean;
    }
    public double getMedian() {
        return median;
    }
    public double getMode() {
        return mode;
    }
}
