package it.epicode.menuPizzaSpring.repository;

import it.epicode.menuPizzaSpring.bean.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepo extends JpaRepository<Pizza,Integer> {
}
