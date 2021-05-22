package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.entity.CalculoInteres;
import com.joelespinozaro.calculadora.service.CalculoInteresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/calculo")
public class CalculoInteresController {

    @Autowired
    private CalculoInteresService calculoInteresService;

    @GetMapping("/")
    public List<CalculoInteres> getAll() {
        return calculoInteresService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<CalculoInteres> getCalculoInteres(@PathVariable("id") int calculoId){
        return calculoInteresService.getCalculoInteres(calculoId);
    }

    @PostMapping("/")
    public CalculoInteres save(@RequestBody CalculoInteres calculoInteres) {
        return calculoInteresService.save(calculoInteres);
    }

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") int calculoId) {
        return calculoInteresService.delete(calculoId);
    }
}
