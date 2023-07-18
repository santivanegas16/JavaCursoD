package com.triplebyte.services;

import org.springframework.stereotype.Service;

@Service
public class Ordering{

    public int[] ordenarDatos(int[] Datos) {
        for (int i = 0; i < Datos.length; i++) {
            for (int j = i+1; j < Datos.length; j++) {
                int datotemp = 0;
                if (Datos[i] > Datos[j]) {
                    datotemp = Datos [i];
                    Datos[i] = Datos [j];
                    Datos [j] = datotemp;
                }
            }
        }
        return Datos;
    }
}


/*    private int[] datos; //Primero se define el atributo

    //Luego definimos el constructor de la clase

    public Ordering(int[] datos){
        //la variable en morado es la variable privada de la clase
        //por eso usamos el this, con este se apunta a algo de la clase
        this.datos = datos;
    }

    //Los metodos son la logica que se tiene que hacer
    //El get se obtienen los atributos privados de la clase y retorna el valor que tiene el atributo
    public int[] getDatos() {
        return datos;
    }
    //El set lo que hace es cambiar lo que esta en el atributo privado pero no retorna nada
    public void setDatos(int[] datos) {
        this.datos = datos;
    }*/

/*    public int[] order(){
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
    }*/



