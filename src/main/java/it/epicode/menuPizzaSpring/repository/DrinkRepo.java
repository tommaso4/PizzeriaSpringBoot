package it.epicode.menuPizzaSpring.repository;

import it.epicode.menuPizzaSpring.bean.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepo extends JpaRepository<Drink,Integer> {
}
