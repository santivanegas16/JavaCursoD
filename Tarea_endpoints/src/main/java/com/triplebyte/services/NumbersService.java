package com.triplebyte.services;

import com.triplebyte.models.Number;
import com.triplebyte.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumbersService {

    @Autowired
    private NumberRepository numberRepository;

    public Number createNumber(Number number){
        return numberRepository.save(number);
    }

    public List<Number> getAllNumbers(){
        return numberRepository.findAll();
    }

}
