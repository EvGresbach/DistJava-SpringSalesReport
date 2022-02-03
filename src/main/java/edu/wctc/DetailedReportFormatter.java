package edu.wctc;

import java.util.List;

public class DetailedReportFormatter implements ReportFormatter{

    @Override
    public void format(List<Sale> sales) {
        System.out.printf("%-25s %-25s %-10s %-10s %-10s \n", "Customer", "Country", "Amount", "Tax", "Shipping");
        for (Sale sale: sales) {
            System.out.printf("%-25s %-25s %-10.2f %-10.2f %-10.2f \n", sale.getCustomer(), sale.getCountry(),
                    sale.getAmount(), sale.getTax(), sale.getShipping());
        }
    }
}
