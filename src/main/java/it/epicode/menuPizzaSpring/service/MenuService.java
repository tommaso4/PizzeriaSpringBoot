package it.epicode.menuPizzaSpring.service;

import it.epicode.menuPizzaSpring.bean.Drink;
import it.epicode.menuPizzaSpring.bean.Menu;
import it.epicode.menuPizzaSpring.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    private MenuRepo menuRepo;

    public void save(Menu t) {
        menuRepo.save(t);
    }

    public Menu find(int id) {
        return menuRepo.findById(id).get();
    }

    public void remove(Menu t) {
        menuRepo.delete(t);
    }
}
