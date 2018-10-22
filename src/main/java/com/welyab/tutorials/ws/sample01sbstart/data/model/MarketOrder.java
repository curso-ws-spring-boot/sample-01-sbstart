package com.welyab.tutorials.ws.sample01sbstart.data.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * An order from customers.
 * 
 * @author Welyab Paula
 */
@Entity
@Table(name = "market_order")
public class MarketOrder implements Serializable {

    @SuppressWarnings("javadoc")
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @SuppressWarnings("javadoc")
    private Long id;

    @Column(name = "code", length = 9, nullable = false)
    @SuppressWarnings("javadoc")
    private String code;

    @Column(name = "total_price", precision = 12, scale = 2, nullable = false)
    @SuppressWarnings("javadoc")
    private BigDecimal totalPrice;

    @Column(name = "discount", precision = 12, scale = 2, nullable = false)
    @SuppressWarnings("javadoc")
    private BigDecimal discount;

    @Column(name = "dt_order")
    @SuppressWarnings("javadoc")
    private LocalDateTime orderDateTime;

    @Column(name = "description", length = 140)
    @SuppressWarnings("javadoc")
    private String description;

    @SuppressWarnings("javadoc")
    public Long getId() {
	return id;
    }

    @SuppressWarnings("javadoc")
    public void setId(Long id) {
	this.id = id;
    }

    @SuppressWarnings("javadoc")
    public String getCode() {
	return code;
    }

    @SuppressWarnings("javadoc")
    public void setCode(String code) {
	this.code = code;
    }

    @SuppressWarnings("javadoc")
    public BigDecimal getTotalPrice() {
	return totalPrice;
    }

    @SuppressWarnings("javadoc")
    public void setTotalPrice(BigDecimal totalPrice) {
	this.totalPrice = totalPrice;
    }

    @SuppressWarnings("javadoc")
    public BigDecimal getDiscount() {
	return discount;
    }

    @SuppressWarnings("javadoc")
    public void setDiscount(BigDecimal discount) {
	this.discount = discount;
    }

    @SuppressWarnings("javadoc")
    public LocalDateTime getOrderDateTime() {
	return orderDateTime;
    }

    @SuppressWarnings("javadoc")
    public void setOrderDateTime(LocalDateTime orderDateTime) {
	this.orderDateTime = orderDateTime;
    }

    @SuppressWarnings("javadoc")
    public String getDescription() {
	return description;
    }

    @SuppressWarnings("javadoc")
    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	MarketOrder other = (MarketOrder) obj;
	if (id == null) {
	    if (other.id != null) {
		return false;
	    }
	} else if (!id.equals(other.id))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "MarketOrder [code=" + code + "]";
    }
}
