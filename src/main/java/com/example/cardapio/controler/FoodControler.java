package com.example.cardapio.controler;

import com.example.cardapio.entity.FoodEntity;
import com.example.cardapio.entity.FoodRepository;
import com.example.cardapio.entity.FoodRequestDTO;
import com.example.cardapio.entity.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodControler {


    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        FoodEntity foodData = new FoodEntity(data);
        repository.save(foodData);
        return;

    }
    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;

    }
}
