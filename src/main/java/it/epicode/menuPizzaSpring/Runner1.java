package it.epicode.menuPizzaSpring;

import it.epicode.menuPizzaSpring.bean.Ordine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Runner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Logger logger = Logger.getLogger("w5d2");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigMenu.class);

        Ordine ordine1 = ctx.getBean("ordine1", Ordine.class);
        logger.info(ordine1.toString());
    }
}
