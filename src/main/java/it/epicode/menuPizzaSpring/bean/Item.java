package it.epicode.menuPizzaSpring.bean;

import lombok.Data;

@Data
public abstract class Item {
    protected String name;
    protected double totColories;
    protected double totPrice;
}
