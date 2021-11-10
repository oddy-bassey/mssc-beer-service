package com.revoltcode.msscbeerservice.events;

import com.revoltcode.msscbeerservice.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent{
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
