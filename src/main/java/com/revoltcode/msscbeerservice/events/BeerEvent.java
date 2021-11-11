package com.revoltcode.msscbeerservice.events;

import com.revoltcode.msscbeerservice.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -7803480894602503205L;

    private BeerDto beerDto;
}
