package com.platzi.javatest.discount;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PriceCalculatorTest {
    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrices(10.2);
        priceCalculator.addPrices(15.5);
        assertThat(priceCalculator.getTotal(), is(25.7));
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.addPrices(100);
        priceCalculator.addPrices(50);
        priceCalculator.addPrices(50);

        priceCalculator.setDiscount(50);

        assertThat(priceCalculator.getTotal(), is(100.0));
    }
}