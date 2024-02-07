package it.epicode.menuPizzaSpring;

import it.epicode.menuPizzaSpring.bean.Item;
import it.epicode.menuPizzaSpring.bean.Menu;
import it.epicode.menuPizzaSpring.bean.Ordine;
import it.epicode.menuPizzaSpring.bean.Topping;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.logging.Logger;

@SpringBootTest
class MenuPizzaSpringApplicationTests {

    static AnnotationConfigApplicationContext ctx;
    static int contatore = 0;
    Logger logger = Logger.getLogger("w5d2");

    @BeforeAll
    static void startContext() {
        ctx = new AnnotationConfigApplicationContext(MenuPizzaSpringApplication.class);
    }


    @Test
    void controlloNrCoperti() {//assertEquals
        Ordine ordine = ctx.getBean("ordine1", Ordine.class);
        Assertions.assertEquals(5,ordine.getNrCoperti() );
    }

    @Test
    void controlloListaVuota() {//assertnotEquals
        Ordine ordine = ctx.getBean("ordine1", Ordine.class);
        Assertions.assertNotEquals(0,ordine.getListaOrdine().size());
    }

    @Test
    void controlloIsEmpy(){
        Ordine ordine = ctx.getBean("ordine1", Ordine.class);
        Assertions.assertFalse(ordine.getListaOrdine().isEmpty());
    }

    @Test
    void verificaDueArray(){ //controlla le grandezze degl'array
        Ordine ordine = ctx.getBean("ordine1", Ordine.class);
        Ordine ordine2 = ctx.getBean("ordine2", Ordine.class);
        Assertions.assertArrayEquals(ordine2.getListaOrdine().toArray(),ordine.getListaOrdine().toArray());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Onions", "Tomato","Cheese"})
    void controlloNomeTopStampoCal(String nome){
        Menu menu = ctx.getBean("menu", Menu.class);
        Assertions.assertEquals(nome, menu.getToppings().get(contatore++).getName());
    }

//    @ParameterizedTest
//    @CsvSource({"Onions,22", "Tomato,86","Cheese,92"})
//    void  controlloCaloriePerNomeTop(String nome, int cal){
//        Menu menu = ctx.getBean("menu", Menu.class);
//        Topping topping = menu.getToppings().stream().filter(top-> top.getName().equals(nome)).findAny().get();
//        Assertions.assertEquals(cal,topping.getTotColories());
//    }


}
