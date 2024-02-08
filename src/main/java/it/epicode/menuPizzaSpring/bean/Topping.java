package it.epicode.menuPizzaSpring.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Topping extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizze = new ArrayList<Pizza>();
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", totColories=" + totColories +
                ", totPrice=" + totPrice +
                '}';
    }
}
