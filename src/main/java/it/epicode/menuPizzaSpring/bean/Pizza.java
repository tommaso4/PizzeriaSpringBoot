package it.epicode.menuPizzaSpring.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Pizza extends Item {
    private boolean xl = false;
    private List<Topping> toppings = new ArrayList<Topping>();

    public double setTotalPrice() {
        this.totPrice = 3.50;
        if (!this.toppings.isEmpty()) {
            for (Topping top : toppings) {
                this.totPrice += top.getTotPrice();
            }
        }
        return this.totPrice;
    }

    public double setTotalCalories() {
        this.totColories = 900;
        if (!this.toppings.isEmpty()) {
            for (Topping top : toppings) {
                this.totColories += top.getTotColories();
            }
        }
        return this.totColories;
    }

    public void setXl(){
        this.xl = true;
        this.totColories = setTotalCalories() * 1.3;
        this.totPrice = setTotalPrice() +3;
    }

    public void addTopping (Topping top){
        this.toppings.add(top);
        setTotalPrice();
        setTotalCalories();
    }
    public void removeTopping (Topping top){
        this.toppings.remove(top);
        setTotalPrice();
        setTotalCalories();
    }
}
