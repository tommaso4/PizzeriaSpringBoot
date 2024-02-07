package it.epicode.menuPizzaSpring;

import it.epicode.menuPizzaSpring.bean.*;
import it.epicode.menuPizzaSpring.enumPack.StatoOrdine;
import it.epicode.menuPizzaSpring.enumPack.StatoTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class AppConfigMenu {

    //topping
    @Bean("cheese")
    public Topping getTopCheese() {
        Topping top = new Topping();
        top.setName("Cheese");
        top.setTotColories(92);
        top.setTotPrice(0.69);
        return top;
    }

    @Bean("ham")
    public Topping getTopHam() {
        Topping top = new Topping();
        top.setName("Ham");
        top.setTotColories(35);
        top.setTotPrice(0.99);
        return top;
    }

    @Bean("onions")
    public Topping getTopOnions() {
        Topping top = new Topping();
        top.setName("Onions");
        top.setTotColories(22);
        top.setTotPrice(0.69);
        return top;
    }

    @Bean("pineaple")
    public Topping getTopPineaple() {
        Topping top = new Topping();
        top.setName("Pineaple");
        top.setTotColories(24);
        top.setTotPrice(0.69);
        return top;
    }

    @Bean("salumi")
    public Topping getTopSalami() {
        Topping top = new Topping();
        top.setName("Salami");
        top.setTotColories(86);
        top.setTotPrice(0.99);
        return top;
    }
    @Bean("tomato")
    public Topping getTopTomato() {
        Topping top = new Topping();
        top.setName("Tomato");
        top.setTotColories(86);
        top.setTotPrice(0.99);
        return top;
    }

    //Pizze
    @Bean("margherita")
    public Pizza getMargherita() {
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        List<Topping> toppings = List.of(getTopTomato(),getTopCheese());
        pizza.setToppings(toppings);
        pizza.setTotalCalories();
        pizza.setTotalPrice();
        return pizza;
    }
    @Bean("margheritaXl")
    public Pizza getMargheritaXl() {
        Pizza pizza = new Pizza();
        pizza.setName("MargheritaXl");
        pizza.setXl();
        return pizza;
    }

    @Bean("hawaiianXl")
    public Pizza getHawaiianXl() {
        Pizza pizza = new Pizza();
        pizza.setName("HawaiianXl");
        List<Topping> toppings = List.of(getTopPineaple(), getTopHam(),getTopTomato(),getTopCheese());
        pizza.setToppings(toppings);
        pizza.setXl();
        return pizza;
    }

    @Bean("hawaiian")
    public Pizza getHawaiian() {
        Pizza pizza = new Pizza();
        pizza.setName("Hawaiian");
        List<Topping> toppings = List.of(getTopPineaple(), getTopHam(),getTopTomato(),getTopCheese());
        pizza.setToppings(toppings);
        pizza.setTotalCalories();
        pizza.setTotalPrice();
        return pizza;
    }
    @Bean("salami")
    public Pizza getSalami() {
        Pizza pizza = new Pizza();
        pizza.setName("Salami");
        List<Topping> toppings = List.of(getTopSalami(),getTopTomato(),getTopCheese());
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
        drink.setTotColories(128);
        drink.setTotPrice(1.29);
        return drink;
    }

    @Bean("water")
    public Drink getWater() {
        Drink drink = new Drink();
        drink.setName("Water");
        drink.setTotColories(0);
        drink.setTotPrice(1.29);
        return drink;
    }

    @Bean("wine")
    public Drink getWine() {
        Drink drink = new Drink();
        drink.setName("Wine");
        drink.setTotColories(607);
        drink.setTotPrice(7.49);
        return drink;
    }

    //menu
    @Bean("menu")
    public Menu getMenu() {
        Menu menu = new Menu();
        List<Pizza> pizze = List.of(getMargherita(), getHawaiian(), getSalami(),getHawaiianXl(),getMargheritaXl());
        menu.setPizze(pizze);
        List<Topping> toppings = List.of(getTopOnions(),getTopTomato(), getTopCheese(),getTopSalami(), getTopHam(), getTopPineaple());
        menu.setToppings(toppings);
        List<Drink> drinks = List.of(getLemonade(), getWater(), getWine());
        menu.setDrinks(drinks);
        return menu;
    }

    //tavoli

    @Bean("tavolo1")
    public Tavolo getTavolo1() {
        Tavolo tavolo = new Tavolo();
        tavolo.setNrTavolo(1);
        tavolo.setNrCoperti(2);
        tavolo.setMaxCoperti();
        tavolo.setStatoTavolo(StatoTavolo.LIBERO);
        return tavolo;
    }
    @Bean("tavolo2")
    public Tavolo getTavolo2() {
        Tavolo tavolo = new Tavolo();
        tavolo.setNrTavolo(2);
        tavolo.setNrCoperti(4);
        tavolo.setMaxCoperti();
        tavolo.setStatoTavolo(StatoTavolo.LIBERO);
        return tavolo;
    }
    @Bean("tavolo3")
    public Tavolo getTavolo3() {
        Tavolo tavolo = new Tavolo();
        tavolo.setNrTavolo(3);
        tavolo.setNrCoperti(8);
        tavolo.setMaxCoperti();
        tavolo.setStatoTavolo(StatoTavolo.LIBERO);
        return tavolo;
    }

    //ordine
    @Bean("ordine1")
    public Ordine getOrdine1(@Value("${app.coperto}") String coperto) throws Exception {
        Ordine ordine = new Ordine();
        List<Item> comanda = List.of(getMargherita(),getMargheritaXl(), getSalami(),getHawaiian(),
                getWine(),getWine(),getWine(),getWater());
        ordine.setListaOrdine(comanda);
        ordine.setTavolo(getTavolo2());
        ordine.setNrOrdine(1);
        ordine.setStatoOrdine(StatoOrdine.INCORSO);
        ordine.setOraOrdine(LocalDateTime.now());
        ordine.checkCopertiPerTavolo(5);
        ordine.setCoperto(coperto);
        ordine.totalCount();
        return ordine;
    }
    @Bean("ordine2")
    public Ordine getOrdine2(@Value("${app.coperto}") String coperto) throws Exception {
        Ordine ordine = new Ordine();
        List<Item> comanda = List.of(getMargherita(),getMargheritaXl(), getSalami(),getHawaiian(),
                getWine(),getWine(),getWater(),getLemonade());
        ordine.setListaOrdine(comanda);
        ordine.setTavolo(getTavolo1());
        ordine.setNrOrdine(1);
        ordine.setStatoOrdine(StatoOrdine.INCORSO);
        ordine.setOraOrdine(LocalDateTime.now());
        ordine.checkCopertiPerTavolo(2);
        ordine.setCoperto(coperto);
        ordine.totalCount();
        return ordine;
    }


}
