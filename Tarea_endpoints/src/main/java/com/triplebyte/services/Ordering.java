package com.triplebyte.services;

import com.triplebyte.models.Number;
import com.triplebyte.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ordering{

    @Autowired
    private NumbersService numbersService;

    public Ordering() {

    }

    public List<Number> ordenarDatos() {
        List<Number> Datos = numbersService.getAllNumbers();
        for (int i = 0; i < Datos.size(); i++) {
            for (int j = i+1; j < Datos.size(); j++) {
                double datotemp = 0;
                Long idtemp = 0L;
                if (Datos.get(i).getValue_number() > Datos.get(j).getValue_number()) {
                    datotemp = Datos.get(i).getValue_number();
                    idtemp = Datos.get(i).getId_number();
                    Datos.get(i).setValue_number(Datos.get(j).getValue_number());
                    Datos.get(i).setId_number(Datos.get(j).getId_number());
                    Datos.get(j).setValue_number(datotemp);
                    Datos.get(j).setId_number(idtemp);
                }
            }
        }
        return Datos;
    }
}