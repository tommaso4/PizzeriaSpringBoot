package it.epicode.menuPizzaSpring.repository;

import it.epicode.menuPizzaSpring.bean.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepo extends JpaRepository<Topping,Integer> {
}
