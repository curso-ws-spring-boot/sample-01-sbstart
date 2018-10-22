package com.welyab.tutorials.ws.sample01sbstart.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.welyab.tutorials.ws.sample01sbstart.data.model.MarketOrder;

@Repository
@SuppressWarnings("javadoc")
public interface MarketOrderRepository extends CrudRepository<MarketOrder, Long> {
}
