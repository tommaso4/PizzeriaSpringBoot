package it.epicode.menuPizzaSpring.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Pizza extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean xl = false;
    @ManyToMany(fetch = FetchType.EAGER)//forza il caricamento di questa lista
    @JoinTable(name = "pizza_topping",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id"))
    private List<Topping> toppings = new ArrayList<Topping>();

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

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

    @Override
    public String
    toString() {
        return "Pizza{" + super.toString() +
                "id=" + id +
                ", xl=" + xl +
                ", toppings=" + toppings +
                '}';
    }
}
