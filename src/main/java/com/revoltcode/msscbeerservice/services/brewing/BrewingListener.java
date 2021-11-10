package com.revoltcode.msscbeerservice.services.brewing;

import com.revoltcode.msscbeerservice.config.JmsConfig;
import com.revoltcode.msscbeerservice.domain.Beer;
import com.revoltcode.msscbeerservice.events.BrewBeerEvent;
import com.revoltcode.msscbeerservice.events.NewInventoryEvent;
import com.revoltcode.msscbeerservice.repositories.BeerRepository;
import com.revoltcode.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BrewingListener {

    private final BeerRepository beerRepository;
    private final JmsTemplate jmsTemplate;
    
    @JmsListener(destination = JmsConfig.BREWING_REQUEST_QUEUE)
    public void listen(BrewBeerEvent brewBeerEvent){

        BeerDto beerDto = brewBeerEvent.getBeerDto();

        Beer beer = beerRepository.getOne(beerDto.getId());

        beerDto.setQuantityOnHand(beer.getQuantityToBrew());

        NewInventoryEvent newInventoryEvent = new NewInventoryEvent(beerDto);

        jmsTemplate.convertAndSend(JmsConfig.NEW_INVENTORY_QUEUE, newInventoryEvent);
    }
}
