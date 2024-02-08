package it.epicode.menuPizzaSpring.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(mappedBy = "menu",fetch = FetchType.EAGER)
    private List<Pizza> pizze;

    @OneToMany(mappedBy = "menu",fetch = FetchType.EAGER)
    private List<Topping> toppings;

    @OneToMany(mappedBy = "menu",fetch = FetchType.EAGER)
    private List<Drink> drinks;

}
