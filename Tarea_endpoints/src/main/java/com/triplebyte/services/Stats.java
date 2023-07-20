package com.triplebyte.services;

import org.springframework.stereotype.Service;

@Service
public class Stats {
    public float mean(int[] Datos) {
        // mean
        int suma = 0;
        for (int i = 0; i < Datos.length; i++) {
            suma += Datos[i];
        }
        float mean;
        mean = (float) suma / (Datos.length);
        return mean;
    }

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

    public int mode(int[] Datos) {
        // mode
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < Datos.length; i++) {
            int value = Datos[i];
            int count = 0;
            for (int j = i+1; j < Datos.length; j++) {
                if (Datos[j] == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }
}
