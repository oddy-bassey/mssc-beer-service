package com.revoltcode.msscbeerservice.services;

import java.util.UUID;

public interface BeerInventoryService {

    Integer getOnhandInventory(UUID beerId);
}
