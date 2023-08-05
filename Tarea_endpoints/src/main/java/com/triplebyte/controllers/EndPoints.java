package com.triplebyte.controllers;
import com.triplebyte.models.Distribution;
import com.triplebyte.models.Number;
import com.triplebyte.models.Response;
import com.triplebyte.models.Stats;
import com.triplebyte.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EndPoints {

    @Autowired
    private NumbersService numbersService;

    @Autowired
    private Ordering order;

    @Autowired
    private CalcStats calcStats;

    @Autowired
    private Hypergeometric hypergeometric;

    @GetMapping("/order")
    public List<Number> order(){ return order.ordenarDatos(); }

    @GetMapping("/stats")
    public ResponseEntity<Response> stats() {
        Response response = new Response();
        try {
            response.setResponse(new Stats(order(), calcStats.mean(), calcStats.median(), calcStats.mode()));
            response.setSuccess(true);
            response.setMessage("Stats calculated");
            return ResponseEntity.status(200).body(response);
        } catch (Exception e) {
            response.setResponse(null);
            response.setSuccess(false);
            response.setMessage("Not calculated");
            return ResponseEntity.status(400).body(response);
        }
    }

    @PostMapping("/distribution")
    public ResponseEntity<Response> distribution(@RequestBody Distribution distribution){

        Response response = new Response();
        try {
            int tam_total_poblacion = distribution.getTam_total_poblacion();
            int tam_muestra = distribution.getTam_muestra();
            int tam_subconjunto_poblacion = distribution.getTam_subconjunto_poblacion();
            int elementos_subconjunto_interes = distribution.getElementos_subconjunto_interes();
            response.setResponse(hypergeometric.calculate(tam_total_poblacion, tam_muestra, tam_subconjunto_poblacion, elementos_subconjunto_interes));
            response.setSuccess(true);
            response.setMessage("Distribution calculated");
            return ResponseEntity.status(200).body(response);
        } catch (Exception e) {
            response.setResponse(null);
            response.setSuccess(false);
            response.setMessage("Not calculated");
            return ResponseEntity.status(400).body(response);
        }
    }

    @GetMapping("/allNumbers")
    public ResponseEntity<Response> getAllNumbers() {
        Response response = new Response();
        try {
            response.setResponse(numbersService.getAllNumbers());
            response.setSuccess(true);
            response.setMessage("Found");
            return ResponseEntity.status(200).body(response);
        } catch (Exception e) {
            response.setResponse(null);
            response.setSuccess(false);
            response.setMessage("Not Found");
            return ResponseEntity.status(400).body(response);
        }
    }

    @PostMapping("/insertNumbers")
    public ResponseEntity<Response> createNumber(@RequestBody Number number) {
        Response response = new Response();
        try {
            response.setResponse(numbersService.create(number));
            response.setSuccess(true);
            response.setMessage("Number Inserted");
            return ResponseEntity.status(200).body(response);
        } catch (Exception e) {
            response.setResponse(null);
            response.setSuccess(false);
            response.setMessage("Not inserted");
            return ResponseEntity.status(400).body(response);
        }
    }
}
