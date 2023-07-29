package com.triplebyte.models;

import javax.persistence.*;

@Entity
@Table(name = "numbers")
public class Number {

    @Id // Representa a un primary key de la tabla numbers
    @GeneratedValue(strategy = GenerationType.IDENTITY) // representa a un campo autogenerado (secuencial), equivalente a un campo identity de una sentencia SQL.
    private Long id_number;
    private double value_number;

    public Number() {

    }

    public Number(Long id, double value) {
        this.id_number = id;
        this.value_number = value;
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
