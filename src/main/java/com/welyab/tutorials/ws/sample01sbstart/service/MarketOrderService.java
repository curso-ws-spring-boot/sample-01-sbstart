package com.welyab.tutorials.ws.sample01sbstart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import com.welyab.tutorials.ws.sample01sbstart.data.model.MarketOrder;
import com.welyab.tutorials.ws.sample01sbstart.data.repository.MarketOrderRepository;

/**
 * Business logic for market orders.
 * 
 * @author Welyab Paula
 */
@Service
public class MarketOrderService {

    @Autowired
    @SuppressWarnings("javadoc")
    private MarketOrderRepository orderRepository;

    /**
     * Returns all registered orders.
     * 
     * @return The market orders list.
     */
    public List<MarketOrder> findMarketOrders() {
	return Lists.newArrayList(orderRepository.findAll());
    }
}
