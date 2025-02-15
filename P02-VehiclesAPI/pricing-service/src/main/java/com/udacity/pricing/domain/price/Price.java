package com.udacity.pricing.domain.price;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Represents the price of a given vehicle, including currency.
 */
@Entity
public class Price {

    @Id
    @GeneratedValue
    Long id;

    private String currency;
    private BigDecimal price;

    public Price(Long id, String currency, BigDecimal price) {
        this.currency = currency;
        this.price = price;
        this.id=id;
    }


    public Price() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long vehicleId) {
        this.id = vehicleId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
