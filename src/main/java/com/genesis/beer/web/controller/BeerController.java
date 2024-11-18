package com.genesis.beer.web.controller;

import com.genesis.beer.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId") UUID beerId) {
        //todo: impl
        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDTO> saveNewBeer(@RequestBody BeerDTO beerDTO) {
        //todo: impl
        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity<BeerDTO> updateBeerById(@RequestBody BeerDTO beerDTO, @PathVariable("beerId") UUID beerId) {
        //todo: Impl
        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.NO_CONTENT);
    }
}
