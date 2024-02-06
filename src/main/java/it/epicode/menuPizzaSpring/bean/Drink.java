package it.epicode.menuPizzaSpring.bean;

import lombok.Data;

@Data
public class Drink extends Item {
    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", totColories=" + totColories +
                ", totPrice=" + totPrice +
                '}';
    }
}
