package com.triplebyte.services;

import org.springframework.stereotype.Service;

@Service
public class Mean {
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
}
