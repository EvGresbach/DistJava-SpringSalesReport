package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class SummaryReportFormatter implements ReportFormatter {
    @Override
    public void format(List<Sale> sales) {
        String currentCountry = sales.get(0).getCountry();
        List<Sale> currentSales = new ArrayList<>();

        System.out.printf("%-25s %-10s %-10s %-10s \n", "Country", "Amount", "Tax", "Shipping");

        for (Sale sale : sales) {
            //Make sure very last value is being calculated - may not be getting caught
            //if sale is in current country, add to list otherwise total up and print out
            if(!sale.getCountry().equals(currentCountry) || sale == sales.get(sales.size()-1)){
                //Make sure very last value is being calculated
                if(sale == sales.get(sales.size()-1)) currentSales.add(sale);

                double totalAmount = currentSales.stream().mapToDouble(Sale::getAmount).sum();
                double totalTax = currentSales.stream().mapToDouble(Sale::getTax).sum();
                double totalShipping = currentSales.stream().mapToDouble(Sale::getShipping).sum();

                System.out.printf("%-25s %-10.2f %-10.2f %-10.2f \n",
                        currentCountry, totalAmount, totalTax, totalShipping);

                currentCountry = sale.getCountry();
                currentSales = new ArrayList<>();

            }

            currentSales.add(sale);
        }
    }
}
