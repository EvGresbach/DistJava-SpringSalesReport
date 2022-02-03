package edu.wctc;

public class FivePercentShippingPolicy implements ShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(sale.getAmount()*.05);
    }
}
