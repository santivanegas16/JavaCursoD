package com.triplebyte.controllers;
import com.triplebyte.models.Stats;
import com.triplebyte.services.Mode;
import com.triplebyte.services.Ordering;
import com.triplebyte.services.Mean;
import com.triplebyte.services.Median;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EndPoints {

    int[] datos = {9,5,4,3,2,1,1000,6,7,7,9,99};

    @Autowired
    private Ordering order;

    @Autowired
    private Mean mean;

    @Autowired
    private Median median;

    @Autowired
    private Mode mode;

    @GetMapping("/order")
    public int[] order(){ return order.ordenarDatos(datos); }

    @GetMapping("/mean")
    public float mean(){ return mean.mean(datos); }

    @GetMapping("/median")
    public float median(){ return median.median(datos); }

    @GetMapping("/mode")
    public int mode(){ return mode.mode(datos); }

    @GetMapping("/stats")
    public Stats stats() {
        return new Stats(order(), mean(), median(), mode());
    }

}
