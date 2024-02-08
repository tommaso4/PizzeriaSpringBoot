package it.epicode.menuPizzaSpring.repository;

import it.epicode.menuPizzaSpring.bean.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository<Menu,Integer> {
}
