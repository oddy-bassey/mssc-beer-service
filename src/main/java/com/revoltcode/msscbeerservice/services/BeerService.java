package com.revoltcode.msscbeerservice.services;

import com.revoltcode.msscbeerservice.web.model.BeerDto;
import com.revoltcode.msscbeerservice.web.model.BeerPagedList;
import com.revoltcode.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnhand);

    BeerDto getById(UUID beerID, Boolean showInventoryOnhand);

    BeerDto saveNewBeer(BeerDto beer);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
