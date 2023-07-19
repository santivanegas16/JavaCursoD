package com.triplebyte.services;

import org.springframework.stereotype.Service;

@Service
public class Median {
    public float median(int[] Datos) {
        // median
        float median;

        if (Datos.length % 2 == 0) {
            int index1 = Datos.length / 2 - 1;
            int index2 = Datos.length / 2;
            median = (Datos[index1] + Datos[index2]) / 2.0f;
        } else {
            int index = Datos.length / 2;
            median = Datos[index];
        }
        return median;
    }
}
