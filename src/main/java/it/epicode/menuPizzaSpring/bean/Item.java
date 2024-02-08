package it.epicode.menuPizzaSpring.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Item {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    protected String name;
    protected double totColories;
    protected double totPrice;
}
