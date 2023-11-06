package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/estates")
public class EstateController {


    @Autowired
    EstateService estateService;

    //    INDEX
    @GetMapping
    public ResponseEntity<List<Estate>> getAllEstate() {
        List<Estate> estates = estateService.getAllEstate();
        return new ResponseEntity<>(estates, HttpStatus.OK);
    }

    //    CREATE
    @PostMapping
    public ResponseEntity<Estate> addNewEstate(@RequestBody Estate estate) {
        Estate savedEstate = estateService.save(estate);
        return new ResponseEntity<>(savedEstate, HttpStatus.CREATED);
    }
}
