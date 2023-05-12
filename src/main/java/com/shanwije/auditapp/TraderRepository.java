package com.shanwije.auditapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraderRepository extends CrudRepository<Trader, Long> {
}
