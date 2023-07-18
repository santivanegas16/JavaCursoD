package com.triplebyte.tarea_endpoints;

import com.triplebyte.services.Ordering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TareaEndPoint {

    int[] datos = {9,5,4,3,2,1,6,7,7,9,9};

    @Autowired
    private Ordering order;

    @GetMapping("/order")
    public int[] order(){
        return order.ordenarDatos(datos);
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
    public int mode() {
        // mode
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < datos.length; i++) {
            int value = datos[i];
            int count = 0;
            for (int j = i+1; j < datos.length; j++) {
                if (datos[j] == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }

    @GetMapping("/stats")
    public Estadisticas stats() {
        int[] order = order();
        float mean = mean();
        float median = median();
        int mode = mode();

        return new Estadisticas(order, mean, median, mode);
    }

}
