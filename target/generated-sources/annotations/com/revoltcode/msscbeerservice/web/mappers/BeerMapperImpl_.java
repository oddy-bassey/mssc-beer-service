package com.revoltcode.msscbeerservice.web.mappers;

import com.revoltcode.msscbeerservice.domain.Beer;
import com.revoltcode.msscbeerservice.web.model.BeerDto;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-28T20:20:00+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.7-ea (Debian)"
)
@Component
@Qualifier("delegate")
public class BeerMapperImpl_ implements BeerMapper {

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        return beerDto;
    }

    @Override
    public BeerDto beerToBeerDtoWithInventory(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        return beerDto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beer) {
        if ( beer == null ) {
            return null;
        }

        Beer beer1 = new Beer();

        return beer1;
    }
}
