package nl.ferenc.harvest.controllers;

import nl.ferenc.harvest.models.Income;
import nl.ferenc.harvest.repositories.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class IncomeController {

    @Autowired
    private IncomeRepository repository;

    @RequestMapping("/income")
    public ArrayList<Income> income() {
        return (ArrayList<Income>) repository.findAll();
    }
}
