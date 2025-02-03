package com.epicode.spring_d1.menu;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toppings {
    private  Long id;
    private  String name;
    private int calorie;
    private double price;
}
