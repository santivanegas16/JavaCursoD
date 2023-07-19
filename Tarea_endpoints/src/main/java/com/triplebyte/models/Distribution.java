package com.triplebyte.models;

public class Distribution {

    private int tam_total_poblacion;
    private int tam_muestra;
    private int tam_subconjunto_poblacion;
    private int elementos_subconjunto_interes;

    public Distribution(int tam_total_poblacion, int tam_muestra, int tam_subconjunto_poblacion, int elementos_subconjunto_interes){
        this.tam_total_poblacion = tam_total_poblacion;
        this.tam_muestra = tam_muestra;
        this.tam_subconjunto_poblacion = tam_subconjunto_poblacion;
        this.elementos_subconjunto_interes = elementos_subconjunto_interes;
    }

    public int getTam_total_poblacion() {
        return tam_total_poblacion;
    }

    public int getTam_muestra() {
        return tam_muestra;
    }

    public int getTam_subconjunto_poblacion() {
        return tam_subconjunto_poblacion;
    }

    public int getElementos_subconjunto_interes() {
        return elementos_subconjunto_interes;
    }
}
