package it.epicode.menuPizzaSpring.service;

import it.epicode.menuPizzaSpring.bean.Pizza;
import it.epicode.menuPizzaSpring.repository.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzeService {
    @Autowired
    private PizzaRepo pizzaRepo;

    public void save(Pizza p) {
        pizzaRepo.save(p);
    }

    public Pizza find(int id) {
        return pizzaRepo.findById(id).get();
    }

    public void remove (Pizza p) {
        pizzaRepo.delete(p);
    }
}
