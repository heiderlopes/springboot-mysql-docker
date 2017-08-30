package br.com.heiderlopes.springbootmysql.controller;

import br.com.heiderlopes.springbootmysql.model.Carro;
import br.com.heiderlopes.springbootmysql.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/carro")
public class CarroController {


    @Autowired
    CarroRepository carroRepository;

    @GetMapping
    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Carro carro) {
        carroRepository.save(carro);
    }

}
