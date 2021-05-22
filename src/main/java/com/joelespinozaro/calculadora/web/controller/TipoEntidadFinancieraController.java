package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.entity.TipoEntidadFinanciera;
import com.joelespinozaro.calculadora.service.TipoEntidadFinancieraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tipo-financiera")
public class TipoEntidadFinancieraController {

    @Autowired
    private TipoEntidadFinancieraService tipoEntidadFinancieraService;

    @GetMapping("/")
    public List<TipoEntidadFinanciera> getAll() {
        return tipoEntidadFinancieraService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoEntidadFinanciera> getTipoEntidadFinanciera(@PathVariable("id") int tipoId){
        return tipoEntidadFinancieraService.getTipoEntidadFinanciera(tipoId);
    }

    @PostMapping("/")
    public TipoEntidadFinanciera save(@RequestBody TipoEntidadFinanciera tipoEntidadFinanciera) {
        return tipoEntidadFinancieraService.save(tipoEntidadFinanciera);
    }

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") int tipoId) {
        return tipoEntidadFinancieraService.delete(tipoId);
    }
}
