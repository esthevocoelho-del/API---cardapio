package com.example.cardapio.controler;

import com.example.cardapio.entity.FoodEntity;
import com.example.cardapio.entity.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")
public class FoodControler {


    @Autowired
    private FoodRepository repository
    @GetMapping
    public void getAll(){

        Lista<FoodEntity> foodList = repository.findAll();
        return foodList

    }
}
