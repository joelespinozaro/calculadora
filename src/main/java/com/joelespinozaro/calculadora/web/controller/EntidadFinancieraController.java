package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.entity.EntidadFinanciera;
import com.joelespinozaro.calculadora.service.EntidadFinancieraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/entidad-financiera")
public class EntidadFinancieraController {

    @Autowired
    private EntidadFinancieraService entidadFinancieraService;

    @GetMapping("/")
    public List<EntidadFinanciera> getAll() {
        return entidadFinancieraService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<EntidadFinanciera> getEntidadFinanciera(@PathVariable("id") int entidadFinancieraId){
        return entidadFinancieraService.getEntidadFinanciera(entidadFinancieraId);
    }

    @PostMapping("/")
    public EntidadFinanciera save(@RequestBody EntidadFinanciera entidadFinanciera) {
        return entidadFinancieraService.save(entidadFinanciera);
    }

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") int entidadFinancieraId) {
        return entidadFinancieraService.delete(entidadFinancieraId);
    }

    @GetMapping("/calculo-tasa/")
    public List<EntidadFinanciera> getEntidadFinancieraByTasaInteres(@RequestParam("tasa1") BigDecimal tasa1, @RequestParam("tasa2") BigDecimal tasa2){
        return entidadFinancieraService.getEntidadFinancieraByTasaInteres(tasa1,tasa2);
    }
}
