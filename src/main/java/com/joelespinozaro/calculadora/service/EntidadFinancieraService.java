package com.joelespinozaro.calculadora.service;

import com.joelespinozaro.calculadora.entity.EntidadFinanciera;
import com.joelespinozaro.calculadora.repository.EntidadFinancieraCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class EntidadFinancieraService {

    @Autowired
    private EntidadFinancieraCrudRepository entidadFinancieraCrudRepository;

    public List<EntidadFinanciera> getAll() {
        return (List<EntidadFinanciera>) entidadFinancieraCrudRepository.findAll();
    }

    public Optional<EntidadFinanciera> getEntidadFinanciera(int entidadFinancieraId) {
        return entidadFinancieraCrudRepository.findById(entidadFinancieraId);
    }

    public EntidadFinanciera save(EntidadFinanciera entidadFinanciera) {
        return entidadFinancieraCrudRepository.save(entidadFinanciera);
    }

    public boolean delete(int entidadFinancieraId) {
        return getEntidadFinanciera(entidadFinancieraId).map(entidadFinanciera -> {
            entidadFinancieraCrudRepository.deleteById(entidadFinancieraId);
            return true;
        }).orElse(false);
    }

    public List<EntidadFinanciera> getEntidadFinancieraByTasaInteres(BigDecimal tasa1, BigDecimal tasa2) {
        return entidadFinancieraCrudRepository.findByTasaInteresBetween(tasa1,tasa2);
    }
}
