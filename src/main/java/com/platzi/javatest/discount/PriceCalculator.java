package com.platzi.javatest.discount;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount;

    public double getTotal() {
        return prices.stream().mapToDouble(p -> p).sum() * ((100-discount)/100);
    }

    public void addPrices(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
