package com.triplebyte.services;

import org.springframework.stereotype.Service;

@Service
public class Ordering{
    public int[] ordenarDatos(int[] Datos) {
        for (int i = 0; i < Datos.length; i++) {
            for (int j = i+1; j < Datos.length; j++) {
                int datotemp = 0;
                if (Datos[i] > Datos[j]) {
                    datotemp = Datos [i];
                    Datos[i] = Datos [j];
                    Datos [j] = datotemp;
                }
            }
        }
        return Datos;
    }
}