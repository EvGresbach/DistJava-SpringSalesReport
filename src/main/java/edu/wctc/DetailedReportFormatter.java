package edu.wctc;

import java.util.List;

public class DetailedReportFormatter implements ReportFormatter{

    @Override
    public void format(List<Sale> sales) {
        System.out.printf("%50s %50s %10s %10s %10s", "Customer", "Country", "Amount", "Tax", "Shipping");
        for (Sale sale: sales) {
            System.out.printf("%50s %50s %10.2f %10.2f %10.2f", sale.getCustomer(), sale.getCountry(),
                    sale.getAmount(), sale.getTax(), sale.getShipping());
        }
    }
}
