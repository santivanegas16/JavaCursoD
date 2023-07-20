package com.triplebyte.controllers;
import com.triplebyte.models.Distribution;
import com.triplebyte.models.Stats;
import com.triplebyte.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EndPoints {

    int[] datos = {9,5,4,3,2,1,1000,6,7,7,9,999};

    @Autowired
    private Ordering order;

    @Autowired
    private CalcStats calcStats;

    @Autowired
    private Hypergeometric hypergeometric;

    @GetMapping("/order")
    public int[] order(){ return order.ordenarDatos(datos); }

    @GetMapping("/stats")
    public Stats stats() {
        return new Stats(order(), stats.mean(), stats.median(), stats.mode());
    }

    @PostMapping("/distribution")
    public double distribution(@RequestBody Distribution distribution){
        int tam_total_poblacion = distribution.getTam_total_poblacion();
        int tam_muestra = distribution.getTam_muestra();
        int tam_subconjunto_poblacion = distribution.getTam_subconjunto_poblacion();
        int elementos_subconjunto_interes = distribution.getElementos_subconjunto_interes();
        return hypergeometric.calculate(tam_total_poblacion, tam_muestra, tam_subconjunto_poblacion, elementos_subconjunto_interes);
    }

}
