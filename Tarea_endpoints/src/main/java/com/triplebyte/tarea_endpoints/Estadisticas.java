package com.triplebyte.tarea_endpoints;

public class Estadisticas {
    int[] order;
    float mean;
    float median;
    int mode;

    public Estadisticas(int[] order, float mean, float median, int mode) {
        this.order = order;
        this.mean = mean;
        this.median = median;
        this.mode = mode;

    }
    public int[] getOrder() {
        return order;
    }
    public float getMean() {
        return mean;
    }
    public float getMedian() {
        return median;
    }

    public int getMode() {
        return mode;
    }
}
