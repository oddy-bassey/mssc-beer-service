package com.revoltcode.msscbeerservice.bootstrap;

import com.revoltcode.msscbeerservice.domain.Beer;
import com.revoltcode.msscbeerservice.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    @Autowired
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {

        if(beerRepository.count() == 0){

            beerRepository.save(Beer.builder()
            .beerName("Stout")
            .beerStyle("IPA")
            .quantityToBrew(200)
            .upc(337010000001L)
            .price(new BigDecimal(12.95))
            .build());

            beerRepository.save(Beer.builder()
                .beerName("Galaxy cat")
                .beerStyle("PALE_ALE")
                .quantityToBrew(200)
                .upc(337020000001L)
                .price(new BigDecimal(11.95))
                .build());
        }

        System.out.println("Loaded Beers: "+beerRepository.count());
    }
}
