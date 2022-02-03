package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportHelper {
    @Autowired
    private SaleProvider saleProvider;
    @Autowired
    private ReportFormatter reportFormatter;
    @Autowired
    private ShippingPolicy shippingPolicy;


    public void processReport(){
        List<Sale> sales = saleProvider.getSales();
        if(sales.size() >0){
            for (Sale sale: sales) {
                shippingPolicy.applyShipping(sale);
            }
            reportFormatter.format(sales);
        }else System.out.println("No sales to report");
    }
}
