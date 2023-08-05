package com.triplebyte.models;

import javax.persistence.*;

@Entity
@Table(name = "numbers")
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_number;
    private double value_number;


    public Number() {
        // Constructor predeterminado sin argumentos
    }

    public Number(Long id_number, double value_number) {
        this.id_number = id_number;
        this.value_number = value_number;
    }

    public Long getId_number() {
        return id_number;
    }

    public void setId_number(Long id_number) {
        this.id_number = id_number;
    }

    public double getValue_number() {
        return value_number;
    }

    public void setValue_number(double value_number) {
        this.value_number = value_number;
    }
}
