package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleSaleProvider implements SaleProvider{

    private Scanner keyboard = new Scanner(System.in);

    private Sale requestSale(){
        System.out.print("Please enter customer name: ");
        String name = keyboard.nextLine();
        System.out.print("Please enter country: ");
        String country = keyboard.nextLine();
        System.out.print("Please enter amount charged: ");
        double amount = Double.parseDouble(keyboard.nextLine());
        System.out.print("Please enter tax charged: ");
        double tax = Double.parseDouble(keyboard.nextLine());

        return new Sale(name, country, amount, tax);
    }

    private void printMenu(){
        System.out.print("Would you like to: \n1. Enter new sale\n2.Quit enter sale menu \nEnter option number: ");
    }

    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        boolean isFinished = false;
        do{
            printMenu();
            int option = Integer.parseInt(keyboard.nextLine());
            if(option == 1){
                sales.add(requestSale());
            }else if(option == 2){
                isFinished = true;
                System.out.println("Exiting sale menu");
            }else{
                System.out.println("Invalid response. Please try again");
                printMenu();
            }
        }while(!isFinished);

        return sales;
    }
}
