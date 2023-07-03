package com.triplebyte.tarea_endpoints;

public class Estadisticas {
    int[] order;
    float media;
    float median;

    public Estadisticas(int[] order, float media, float median) {
        this.order = order;
        this.media = media;
        this.median = median;
    }
    public int[] getOrder() {
        return order;
    }
    public float getMedia() {
        return media;
    }

    public float getMedian() {
        return median;
    }
}
