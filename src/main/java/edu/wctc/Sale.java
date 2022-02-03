package edu.wctc;

import lombok.Data;
import lombok.NoArgsConstructor;
//lombok allows us to avoid boilerplate code like getters, setters, and constructors

@Data
@NoArgsConstructor
public class Sale {
    private String customer;
    private String country;
    private double amount;
    private double tax;
    private double shipping;

}
