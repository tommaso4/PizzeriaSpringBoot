package it.epicode.menuPizzaSpring.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Drink extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", totColories=" + totColories +
                ", totPrice=" + totPrice +
                '}';
    }
}
