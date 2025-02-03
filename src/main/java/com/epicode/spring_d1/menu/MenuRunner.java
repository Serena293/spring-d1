package com.epicode.spring_d1.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements CommandLineRunner {

    @Autowired
    private Pizze pizza;

    @Override
    public void run(String... args) throws Exception {
        pizza.printPizze();
    }
}
