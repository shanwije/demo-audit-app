package com.shanwije.auditapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraderService {

    final TraderRepository repository;

    public TraderService(TraderRepository repository) {
        this.repository = repository;
    }

    public void createOrUpdateTrader(Trader trader) {
        repository.save(trader);
    }
}
