package com.welyab.tutorials.ws.sample01sbstart.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.welyab.tutorials.ws.sample01sbstart.data.model.MarketOrder;
import com.welyab.tutorials.ws.sample01sbstart.service.MarketOrderService;

/**
 * REST port for market orders.
 * 
 * @author Welyab Paula
 */
@RestController
@RequestMapping(path = "market-orders")
public class MarketOrderResource {

    @Autowired
    @SuppressWarnings("javadoc")
    private MarketOrderService marketOrderService;

    /**
     * Return all market orders.
     * 
     * @return The market orders list.
     */
    @GetMapping(
	    produces = {
		    MediaType.APPLICATION_JSON_VALUE,
		    MediaType.APPLICATION_XML_VALUE
	    }
    )
    public ResponseEntity<List<MarketOrder>> getMarketOrders() {
	List<MarketOrder> marketOrders = marketOrderService.findMarketOrders();
	return ResponseEntity.ok(marketOrders);
    }
}
