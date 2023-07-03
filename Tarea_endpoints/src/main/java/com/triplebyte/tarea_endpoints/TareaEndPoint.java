package com.triplebyte.tarea_endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class TareaEndPoint {
    int[] datos = {5,4,3,2,1,6,7,8,9,10,20};

    @GetMapping("/order")
    public int[] order(){
        for (int i = 0; i < datos.length; i++) {
            for (int j = i+1; j < datos.length; j++) {
                int datotemp = 0;
                if (datos[i] > datos[j]) {
                    datotemp = datos [i];
                    datos[i] = datos [j];
                    datos [j] = datotemp;
                }
            }
        }
        return datos;
    }

    @GetMapping("/mean")
    public float mean() {
        // mean
        int suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        float mean;
        mean = (float) suma / (datos.length);
        return mean;
    }

    @GetMapping("/median")
    public float median() {
        // median
        float median;

        if (datos.length % 2 == 0) {
            int index1 = datos.length / 2 - 1;
            int index2 = datos.length / 2;
            median = (datos[index1] + datos[index2]) / 2.0f;
        } else {
            int index = datos.length / 2;
            median = datos[index];
        }
        return median;
    }

    @GetMapping("/mode")
    public float mode() {
        // mode
        float mode;
        mode=1+2;
        return mode;
    }

    @GetMapping("/stats")
    public Estadisticas stats() {
        int[] order = order();
        float mean = mean();
        float median = median();
        float mode = mode();

        return new Estadisticas(order, mean, median, mode);
    }

}
