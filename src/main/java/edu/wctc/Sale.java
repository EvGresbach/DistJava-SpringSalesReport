package edu.wctc;

public class Sale {
    private String customer;
    private String country;
    private double amount;
    private double tax;
    private double shipping;

    public Sale(String customer, String country, double amount, double tax) {
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }

    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }
}
