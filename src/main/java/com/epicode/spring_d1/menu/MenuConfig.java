package com.epicode.spring_d1.menu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {

    @Bean
public  Pizze pizza() {    Pizze pizza = new Pizze();
        pizza.setId(1L);
        pizza.setName("Margherita");
        pizza.setCalorie(400);
        pizza.setPrezzo(8.99);
        return pizza;
}

        @Bean
        public Toppings toppings() {
                Toppings toppings = new Toppings();
                toppings.setId(1L);
                toppings.setName("Pomodoro");
                toppings.setCalorie(100);
                toppings.setPrice(1.99);
                return new Toppings(); }

}


