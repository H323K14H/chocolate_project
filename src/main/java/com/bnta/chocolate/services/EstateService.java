package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstateService {

    @Autowired
    private ChocolateRepository chocolateRepository;

    public void save(Chocolate chocolate){
        chocolateRepository.save(chocolate);
    }



}
