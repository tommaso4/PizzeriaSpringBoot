package it.epicode.menuPizzaSpring;

import it.epicode.menuPizzaSpring.bean.Drink;
import it.epicode.menuPizzaSpring.bean.Menu;
import it.epicode.menuPizzaSpring.bean.Pizza;
import it.epicode.menuPizzaSpring.bean.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MenuPizzaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuPizzaSpringApplication.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigMenu.class);

        Menu menu = ctx.getBean("menu", Menu.class);

        System.out.println("Pizze: ");
        for (Pizza pi : menu.getPizze()) {
            System.out.println("tipo: " + pi.getName() + " price: " + pi.getTotPrice() + " calories: " + pi.getTotColories());
        }
        System.out.println("Toppings:");
        for (Topping top : menu.getToppings()) {
            System.out.println(top);
        }
        System.out.println("Drinks:");
        for (Drink ice : menu.getDrinks()) {
            System.out.println(ice);
        }
    }
}
