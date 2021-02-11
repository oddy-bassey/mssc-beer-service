package com.revoltcode.msscbeerservice.web.mappers;

import com.revoltcode.msscbeerservice.domain.Beer;
import com.revoltcode.msscbeerservice.domain.Beer.BeerBuilder;
import com.revoltcode.msscbeerservice.web.model.BeerDto;
import com.revoltcode.msscbeerservice.web.model.BeerDto.BeerDtoBuilder;
import com.revoltcode.msscbeerservice.web.model.BeerStyleEnum;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-11T22:07:11+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.7-ea (Debian)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

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
