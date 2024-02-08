package it.epicode.menuPizzaSpring;

import it.epicode.menuPizzaSpring.bean.Drink;
import it.epicode.menuPizzaSpring.bean.Menu;
import it.epicode.menuPizzaSpring.bean.Pizza;
import it.epicode.menuPizzaSpring.bean.Topping;
import it.epicode.menuPizzaSpring.service.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class MenuPizzaSpringApplication {
    public static void main(String[] args) {

        SpringApplication.run(MenuPizzaSpringApplication.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigMenu.class);

//        Logger logger = Logger.getLogger("w5d2");
//
//        Menu menu = ctx.getBean("menu", Menu.class);
//
//        System.out.println("Pizze: ");
//        for (Pizza pi : menu.getPizze()) {
//            logger.info("tipo: " + pi.getName() + " price: " + pi.getTotPrice() + " calories: " + pi.getTotColories());
//        }
//        logger.info("Toppings:");
//        for (Topping top : menu.getToppings()) {
//          logger.info(top.toString());
//        }
//        logger.info("Drinks:");
//        for (Drink ice : menu.getDrinks()) {
//            logger.info(ice.toString());
//        }
    }
}
