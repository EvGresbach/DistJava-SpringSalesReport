package edu.wctc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
@ComponentScan(basePackages = "edu.wctc")
public class ReportApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ReportApp.class);
        context.refresh();

        ((ReportHelper)context.getBean("reportHelper")).processReport();
    }

    @Bean
    public ReportFormatter reportFormatter(){
        //return new SummaryReportFormatter();
        return new DetailedReportFormatter();
    }
    @Bean
    public SaleProvider saleProvider(){
        //return new ConsoleSaleProvider();
        return new FileSaleProvider();
    }
    @Bean
    public ShippingPolicy shippingPolicy(){
        //return new FivePercentShippingPolicy();
        return new FlatShippingPolicy();
    }
}
