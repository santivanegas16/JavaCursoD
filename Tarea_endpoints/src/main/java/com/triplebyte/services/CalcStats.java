package com.triplebyte.services;

import com.triplebyte.models.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalcStats {

    @Autowired
    private NumbersService numbersService;

    @Autowired
    private Ordering ordering;

    public float mean() {
        List<Number> Datos = numbersService.getAllNumbers();
        // mean
        double suma = 0;
        for (Number data : Datos) {
            suma += data.getValue_number();
        }
        float mean;
        mean = (float) suma / (Datos.size());
        return mean;
    }

    public double median() {

        List<Number> Datos = ordering.ordenarDatos();

        // median
        double median;

        if (Datos.size() % 2 == 0) {
            int index1 = Datos.size() / 2 - 1;
            int index2 = Datos.size() / 2;
            median = (Datos.get(index1).getValue_number() + Datos.get(index2).getValue_number()) / 2.0f;
        } else {
            int index = Datos.size() / 2;
            median = Datos.get(index).getValue_number();
        }
        return median;
    }

    public double mode() {
        List<Number> Datos = numbersService.getAllNumbers();
        // mode
        double mode = 0;
        int maxCount = 0;
        for (int i = 0; i < Datos.size(); i++) {
            double value = Datos.get(i).getValue_number();
            int count = 0;
            for (int j = i+1; j < Datos.size(); j++) {
                if (Datos.get(j).getValue_number() == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }
}
