package com.epicode.spring_d1.menu;

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

    public void printPizze() {
        System.out.println("Codice Pizza: " + id + " Name: " + name + " Calorie: " + calorie + " Prezzo: " + prezzo);

}}
