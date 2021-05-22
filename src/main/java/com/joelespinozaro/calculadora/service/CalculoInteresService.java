package com.joelespinozaro.calculadora.service;

import com.joelespinozaro.calculadora.entity.Asesor;
import com.joelespinozaro.calculadora.entity.CalculoInteres;
import com.joelespinozaro.calculadora.repository.AsesorCrudRepository;
import com.joelespinozaro.calculadora.repository.CalculoInteresCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalculoInteresService {

    @Autowired
    private CalculoInteresCrudRepository calculoInteresCrudRepository;

    public List<CalculoInteres> getAll() {
        return (List<CalculoInteres>) calculoInteresCrudRepository.findAll();
    }

    public Optional<CalculoInteres> getCalculoInteres(int calculoId) {
        return calculoInteresCrudRepository.findById(calculoId);
    }

    public CalculoInteres save(CalculoInteres calculoInteres) {
        return calculoInteresCrudRepository.save(calculoInteres);
    }

    public boolean delete(int calculoId) {
        return getCalculoInteres(calculoId).map(calculoInteres -> {
            calculoInteresCrudRepository.deleteById(calculoId);
            return true;
        }).orElse(false);
    }
}
