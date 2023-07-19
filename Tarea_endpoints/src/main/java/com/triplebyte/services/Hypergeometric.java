package com.triplebyte.services;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class Hypergeometric {

    public double calculate(int tam_total_poblacion, int tam_muestra, int tam_subconjunto_poblacion, int elementos_subconjunto_interes){
        BigInteger coefficient1 = calculateCoefficient(tam_subconjunto_poblacion, elementos_subconjunto_interes);
        BigInteger coefficient2 = calculateCoefficient(tam_total_poblacion - tam_subconjunto_poblacion, tam_muestra - elementos_subconjunto_interes);
        BigInteger coefficient3 = calculateCoefficient(tam_total_poblacion, tam_muestra);
        return (double) coefficient1.multiply(coefficient2).doubleValue() / coefficient3.doubleValue();
    }

    private BigInteger calculateCoefficient(int n, int k){
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            result = result.multiply(BigInteger.valueOf(n - i)).divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }

}
