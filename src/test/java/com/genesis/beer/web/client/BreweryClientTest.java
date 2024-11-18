package com.genesis.beer.web.client;

import com.genesis.beer.web.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient breweryClient;

    @Test
    public void getBeerById(){
        BeerDTO dto = breweryClient.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }

}