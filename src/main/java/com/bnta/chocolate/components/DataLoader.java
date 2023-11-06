package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChocolateService chocolateService;

    @Autowired
    EstateService estateService;

    @Autowired
    ChocolateRepository chocolateRepository;

    public void run(ApplicationArguments args) {
        Estate estate1 = new Estate("farm", "Nigeria");
        Estate estate2 = new Estate("Germa", "Ohio");

        estateService.save(estate1);
        estateService.save(estate2);

        Chocolate chocolate = new Chocolate("Bueno", 98, estate2);

        chocolateRepository.save(chocolate);


    }


}
