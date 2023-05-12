package com.shanwije.auditapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TraderController {

    @Autowired
    TraderService service;

    @PostMapping("/traders")
    public void createOrUpdateTrader(@RequestBody Trader trader) {
        service.createOrUpdateTrader(trader);
    }
}
