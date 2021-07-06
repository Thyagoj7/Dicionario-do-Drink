package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Drink;
import com.example.demo.repository.DrinkRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class DrinkController {

    @Autowired
    private DrinkRepository drinkRepository;

    @GetMapping("/drinks")
    public List<Drink> getAllDrink() {
        return drinkRepository.findAll();
    }

    @GetMapping("/drinks/{id}")
    public ResponseEntity<Drink> getDrinkById(@PathVariable(value = "id") long drinkId)
            throws ResourceNotFoundException {
       Drink drink = drinkRepository.findById(drinkId)
                .orElseThrow(() -> new ResourceNotFoundException("Drink not found:: " + drinkId));
        return ResponseEntity.ok().body(drink);
    }

    @PostMapping("/drinks")
    public Drink createRoom (@Valid @RequestBody Drink drink) {
        return drinkRepository.save(drink);
    }

    @PutMapping("/drinks/{id}")
    public ResponseEntity<Drink> updateDrink(@PathVariable(value = "id") Long drinkId,
                                           @Valid @RequestBody Drink drinkDetails) throws ResourceNotFoundException {
        Drink drink = drinkRepository.findById(drinkId)
                .orElseThrow(() -> new ResourceNotFoundException("Drink not found for this id::" + drinkId));
        drink.setName(drinkDetails.getName());
        drink.setIngrediente1(drinkDetails.getIngrediente1());
        drink.setIngrediente2(drinkDetails.getIngrediente2());
        drink.setIngrediente3(drinkDetails.getIngrediente3());
        drink.setIngrediente4(drinkDetails.getIngrediente4());
        drink.setIngrediente5(drinkDetails.getIngrediente5());
        drink.setOrigem(drinkDetails.getOrigem());
        drink.setAlcool(drinkDetails.getAlcool());
        drink.setDoce(drinkDetails.getDoce());
        drink.setCitrico(drinkDetails.getCitrico());
        drink.setRefrescante(drinkDetails.getRefrescante());
        final Drink updateDrink = drinkRepository.save(drink);
        return ResponseEntity.ok(updateDrink);

    }

    @DeleteMapping("/drinks/{id}")
    public Map<String, Boolean> deleteRoom(@PathVariable(value = "id") Long drinkId)
            throws ResourceNotFoundException {
        Drink drink = drinkRepository.findById(drinkId)
                .orElseThrow(() -> new ResourceNotFoundException("Drink not found for this id:" + drinkId));

        drinkRepository.delete(drink);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;

    }


}
