package it.epicode.menuPizzaSpring.service;

import it.epicode.menuPizzaSpring.bean.Drink;
import it.epicode.menuPizzaSpring.repository.DrinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {

    @Autowired
    private DrinkRepo drinkRepo;

    public void save(Drink t) {
        drinkRepo.save(t);
    }

    public Drink find(int id) {
        return drinkRepo.findById(id).get();
    }

    public void remove(Drink t) {
        drinkRepo.delete(t);
    }
}
