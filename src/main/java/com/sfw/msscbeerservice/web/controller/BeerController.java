package com.sfw.msscbeerservice.web.controller;

import com.sfw.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody BeerDto beerDto){
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable(name = "beerId")UUID beerId){
        //todo impl
    return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<String> updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity deleteBeer(@PathVariable("beerId") UUID beerId){
        //todo impl
        return new ResponseEntity(HttpStatus.OK);
    }
//    @GetMapping("/{upc}")
//    public ResponseEntity<BeerDto> getBeerByUpc(@PathVariable("upc") String upc){
//
//    }
}
