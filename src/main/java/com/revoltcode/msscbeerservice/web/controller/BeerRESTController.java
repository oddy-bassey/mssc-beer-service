package com.revoltcode.msscbeerservice.web.controller;

import com.revoltcode.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerRESTController {

    @GetMapping("/beerId")
    public ResponseEntity<BeerDto> getBeerById(UUID beerID){
        //todo implementation
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody BeerDto beer){
        //todo implementation
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        //todo implementation
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
