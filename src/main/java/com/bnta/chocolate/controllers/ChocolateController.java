package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/chocolates")
public class ChocolateController {

    @Autowired
    ChocolateService chocolateService;

    //    INDEX
    @GetMapping
    public ResponseEntity<List<Chocolate>> getAllChocolate() {
        List<Chocolate> chocolates = chocolateService.getAllChocolate();
        return new ResponseEntity<>(chocolates, HttpStatus.OK);
    }

    //    CREATE
    @PostMapping
    public ResponseEntity<Chocolate> addNewChocolate(@RequestBody Chocolate chocolate) {
        Chocolate savedChocolate = chocolateService.saveChocolate(chocolate);
        return new ResponseEntity<>(savedChocolate, HttpStatus.CREATED);
    }
}
