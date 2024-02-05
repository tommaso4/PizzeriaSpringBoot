package it.epicode.menuPizzaSpring;

import it.epicode.menuPizzaSpring.bean.Drink;
import it.epicode.menuPizzaSpring.bean.Menu;
import it.epicode.menuPizzaSpring.bean.Pizza;
import it.epicode.menuPizzaSpring.bean.Topping;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class AppConfigMenu {

    //topping
    @Bean("cheese")
    public Topping getTopCheese() {
        Topping top = new Topping();
        top.setName("cheese");
        top.setCalories(92);
        top.setPrice(0.69);
        return top;
    }

    @Bean("ham")
    public Topping getTopHam() {
        Topping top = new Topping();
        top.setName("Ham");
        top.setCalories(35);
        top.setPrice(0.99);
        return top;
    }

    @Bean("onions")
    public Topping getTopOnions() {
        Topping top = new Topping();
        top.setName("Onions");
        top.setCalories(22);
        top.setPrice(0.69);
        return top;
    }

    @Bean("pineaple")
    public Topping getTopPineaple() {
        Topping top = new Topping();
        top.setName("Pineaple");
        top.setCalories(24);
        top.setPrice(0.69);
        return top;
    }

    @Bean("salumi")
    public Topping getTopSalami() {
        Topping top = new Topping();
        top.setName("Salami");
        top.setCalories(86);
        top.setPrice(0.99);
        return top;
    }

    //Pizze
    @Bean("margherita")
    public Pizza getMargherita() {
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.setTotalCalories();
        pizza.setTotalPrice();
        return pizza;
    }
    @Bean("margheritaXl")
    public Pizza getMargheritaXl() {
        Pizza pizza = new Pizza();
        pizza.setName("MargheritaXl");
        pizza.setTotalCalories();
        pizza.setTotalPrice();
        pizza.setXl();
        return pizza;
    }

    @Bean("hawaiianXl")
    public Pizza getHawaiianXl() {
        Pizza pizza = new Pizza();
        pizza.setName("HawaiianXl");
        List<Topping> toppings = List.of(getTopPineaple(), getTopHam());
        pizza.setToppings(toppings);
        pizza.setTotalCalories();
        pizza.setTotalPrice();
        pizza.setXl();
        return pizza;
    }

    @Bean("hawaiian")
    public Pizza getHawaiian() {
        Pizza pizza = new Pizza();
        pizza.setName("Hawaiian");
        List<Topping> toppings = List.of(getTopPineaple(), getTopHam());
        pizza.setToppings(toppings);
        pizza.setTotalCalories();
        pizza.setTotalPrice();
        return pizza;
    }
    @Bean("salami")
    public Pizza getSalami() {
        Pizza pizza = new Pizza();
        pizza.setName("Salami");
        List<Topping> toppings = List.of(getTopSalami());
        pizza.setToppings(toppings);
        pizza.setTotalCalories();
        pizza.setTotalPrice();
        return pizza;
    }

    //Drinks
    @Bean("lemonade")
    public Drink getLemonade() {
        Drink drink = new Drink();
        drink.setName("Lemonade");
        drink.setCalories(128);
        drink.setPrice(1.29);
        return drink;
    }

    @Bean("water")
    public Drink getWater() {
        Drink drink = new Drink();
        drink.setName("Water");
        drink.setCalories(0);
        drink.setPrice(1.29);
        return drink;
    }

    @Bean("wine")
    public Drink getWine() {
        Drink drink = new Drink();
        drink.setName("Wine");
        drink.setCalories(607);
        drink.setPrice(7.49);
        return drink;
    }

    //menu
    @Bean("menu")
    public Menu getMenu() {
        Menu menu = new Menu();
        List<Pizza> pizze = List.of(getMargherita(), getHawaiian(), getSalami());
        menu.setPizze(pizze);
        List<Topping> toppings = List.of(getTopSalami(), getTopHam(), getTopCheese(), getTopPineaple(), getTopOnions());
        menu.setToppings(toppings);
        List<Drink> drinks = List.of(getLemonade(), getWater(), getWine());
        menu.setDrinks(drinks);
        return menu;
    }


}
