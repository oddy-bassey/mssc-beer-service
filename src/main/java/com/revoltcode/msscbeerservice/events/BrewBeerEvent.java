package com.revoltcode.msscbeerservice.events;

import com.revoltcode.msscbeerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent{

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
