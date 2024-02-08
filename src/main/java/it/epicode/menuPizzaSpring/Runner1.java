package it.epicode.menuPizzaSpring;

import it.epicode.menuPizzaSpring.bean.*;
import it.epicode.menuPizzaSpring.service.DrinkService;
import it.epicode.menuPizzaSpring.service.MenuService;
import it.epicode.menuPizzaSpring.service.PizzeService;
import it.epicode.menuPizzaSpring.service.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
public class Runner1 implements CommandLineRunner {

    @Autowired
    private ToppingService toppingService;
    @Autowired
    private PizzeService pizzeService;
    @Autowired
    private DrinkService drinkService;
    @Autowired
    private MenuService menuService;

    @Override
    public void run(String... args) throws Exception {

        Logger logger = Logger.getLogger("w5d2");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigMenu.class);
//        Topping tomato = ctx.getBean("onions", Topping.class);
//        Topping cheese = ctx.getBean("ham", Topping.class);
//        toppingService.save(tomato);
//        toppingService.save(cheese);

//        Pizza pizza = new Pizza();
//        pizza.setName("Awaiiana");
//        List<Topping> toppings = List.of(tomato,cheese,pineaple,ham);
//        pizza.setToppings(toppings);
//        pizza.setTotalCalories();
//        pizza.setTotalPrice();
//        pizzeService.save(pizza);

//        Drink water = ctx.getBean("water",Drink.class);
//        Drink lemonade = ctx.getBean("lemonade",Drink.class);
//        Drink wine = ctx.getBean("wine",Drink.class);
//        drinkService.save(water);
//        drinkService.save(wine);
//        drinkService.save(lemonade);

//        Menu menu = new Menu();
//        List<Pizza> pizze = List.of(margherita,awaii , salam,awaiXl,marghXl);
//        menu.setPizze(pizze);
//        List<Topping> toppings = List.of(tomato,cheese,ham,salami,pineaple);
//        menu.setToppings(toppings);
//        List<Drink> drinks = List.of(water,wine,lemonade);
//        menu.setDrinks(drinks);
//        menuService.save(menu);

        Topping tomato = toppingService.find(1);
        Topping cheese = toppingService.find(2);
        Topping salami = toppingService.find(52);
        Topping pineaple = toppingService.find(53);
        Topping onions = toppingService.find(102);
        Topping ham = toppingService.find(103);

        Pizza margherita = pizzeService.find(152);
        Pizza awaii = pizzeService.find(202);
        Pizza salam = pizzeService.find(203);
        Pizza awaiXl = pizzeService.find(204);
        Pizza marghXl = pizzeService.find(205);


        Drink water = drinkService.find(252);
        Drink wine = drinkService.find(253);
        Drink lemonade = drinkService.find(254);


        Menu menu = menuService.find(1);
        menu.getDrinks().forEach(System.out::println);



//        Ordine ordine1 = ctx.getBean("ordine1", Ordine.class);
//        logger.info(ordine1.toString());
    }
}
