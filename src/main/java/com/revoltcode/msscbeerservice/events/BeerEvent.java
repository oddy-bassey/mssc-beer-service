package com.revoltcode.msscbeerservice.events;

import com.revoltcode.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -7803480894602503205L;

    private final BeerDto beerDto;
}
