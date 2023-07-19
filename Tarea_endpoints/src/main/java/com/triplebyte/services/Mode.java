package com.triplebyte.services;

import org.springframework.stereotype.Service;

@Service
public class Mode {
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
