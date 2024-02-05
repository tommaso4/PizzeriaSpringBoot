package it.epicode.menuPizzaSpring.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Pizza {
    private String name;
    private boolean xl = false;
    private final String ingredient1 = "Tomato";
    private final String ingredient2 = "Cheese";
    private double totColories;
    private double totPrice;
    private List<Topping> toppings = new ArrayList<Topping>();

    public double setTotalPrice() {
        if (!this.toppings.isEmpty()) {
            for (Topping top : toppings) {
                this.totPrice = 4.99;
                return this.totPrice += top.getPrice();
            }
        }
        return this.totPrice = 4.99;
    }

    public double setTotalCalories() {
        if (!this.toppings.isEmpty()) {
            for (Topping top : toppings) {
                this.totColories = 1104;
                return this.totColories += top.getCalories();
            }
        }
        return this.totColories = 1104;
    }

    public void setXl (){
        this.xl = true;
        this.totColories = setTotalCalories() * 1.3;
        this.totPrice = setTotalPrice() +3;
    }
}
