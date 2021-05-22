package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.entity.Asesor;
import com.joelespinozaro.calculadora.service.AsesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/asesor")
public class AsesorController {

    @Autowired
    private AsesorService asesorService;

    @GetMapping("/")
    public List<Asesor> getAll() {
        return asesorService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Asesor> getAsesor(@PathVariable("id") int asesorId){
        return asesorService.getAsesor(asesorId);
    }

    @PostMapping("/")
    public Asesor save(@RequestBody Asesor asesor) {
        return asesorService.save(asesor);
    }

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") int asesorId) {
        return asesorService.delete(asesorId);
    }
}
