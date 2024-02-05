package it.epicode.menuPizzaSpring.bean;

import lombok.Data;

import java.util.List;
@Data
public class Menu {
    private List<Pizza> pizze;
    private List<Topping> toppings;
    private List<Drink> drinks;
}
