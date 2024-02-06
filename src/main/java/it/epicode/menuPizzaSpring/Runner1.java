package it.epicode.menuPizzaSpring;

import it.epicode.menuPizzaSpring.bean.Ordine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigMenu.class);


        System.out.println("Hello World!");
        Ordine ordine1 = ctx.getBean("ordine1", Ordine.class);
        System.out.println(ordine1);



    }
}
