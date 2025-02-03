package com.epicode.spring_d1.pizzeria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizze {
    private  Long id;
    private String name;
    private int calorie;
    private  double prezzo;

}
