package it.epicode.menuPizzaSpring.service;

import it.epicode.menuPizzaSpring.bean.Topping;
import it.epicode.menuPizzaSpring.repository.ToppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {

    @Autowired
    private ToppingRepo toppingRepo;

    public void save(Topping t) {
        toppingRepo.save(t);
    }

    public Topping find(int id) {
        return toppingRepo.findById(id).get();
    }

    public void remove(Topping t) {
        toppingRepo.delete(t);
    }
}
