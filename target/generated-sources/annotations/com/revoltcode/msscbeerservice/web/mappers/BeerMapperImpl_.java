package com.revoltcode.msscbeerservice.web.mappers;

import com.revoltcode.msscbeerservice.domain.Beer;
import com.revoltcode.msscbeerservice.domain.Beer.BeerBuilder;
import com.revoltcode.msscbeerservice.web.model.BeerDto;
import com.revoltcode.msscbeerservice.web.model.BeerDto.BeerDtoBuilder;
import com.revoltcode.msscbeerservice.web.model.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-01T19:36:05+0100",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.7-ea (Debian)"
)
@Component
@Qualifier("delegate")
public class BeerMapperImpl_ implements BeerMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        beerDto.version( (int) beer.getVersion() );
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( Enum.valueOf( BeerStyleEnum.class, beer.getBeerStyle() ) );
        }
        beerDto.upc( beer.getUpc() );
        beerDto.price( beer.getPrice() );

        return beerDto.build();
    }

    @Override
    public BeerDto beerToBeerDtoWithInventory(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        beerDto.version( (int) beer.getVersion() );
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beerDto.beerStyle( Enum.valueOf( BeerStyleEnum.class, beer.getBeerStyle() ) );
        }
        beerDto.upc( beer.getUpc() );
        beerDto.price( beer.getPrice() );

        return beerDto.build();
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beer) {
        if ( beer == null ) {
            return null;
        }

        BeerBuilder beer1 = Beer.builder();

        beer1.id( beer.getId() );
        if ( beer.getVersion() != null ) {
            beer1.version( beer.getVersion() );
        }
        beer1.createdDate( dateMapper.asTimestamp( beer.getCreatedDate() ) );
        beer1.beerName( beer.getBeerName() );
        if ( beer.getBeerStyle() != null ) {
            beer1.beerStyle( beer.getBeerStyle().name() );
        }
        beer1.upc( beer.getUpc() );
        beer1.price( beer.getPrice() );

        return beer1.build();
    }
}
