package edu.wctc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileSaleProvider implements SaleProvider{
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        try{
            File file = new File("sales.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(",");

                Sale sale = new Sale(data[0], data[1], Double.parseDouble(data[2]), Double.parseDouble(data[3]), Double.parseDouble(data[4]));
                sales.add(sale);
            }
            return sales;
        }catch(FileNotFoundException e){
            System.out.println("Error occurred with file");
            return null;
        }
    }
}
