package it.epicode.menuPizzaSpring.bean;

import lombok.Data;

@Data
public class Topping {
    private String name;
    private double calories;
    private double price;
}
