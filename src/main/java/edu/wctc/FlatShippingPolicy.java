package edu.wctc;

public class FlatShippingPolicy implements ShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(5);
    }
}
