package it.epicode.menuPizzaSpring.bean;

import lombok.Data;

@Data
public class Topping extends Item{
    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", totColories=" + totColories +
                ", totPrice=" + totPrice +
                '}';
    }
}
