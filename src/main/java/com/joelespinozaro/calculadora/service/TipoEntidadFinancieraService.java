package com.joelespinozaro.calculadora.service;

import com.joelespinozaro.calculadora.entity.TipoEntidadFinanciera;
import com.joelespinozaro.calculadora.repository.TipoEntidadFinancieraCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoEntidadFinancieraService {
    @Autowired
    private TipoEntidadFinancieraCrudRepository tipoEntidadFinancieraCrudRepository;

    public List<TipoEntidadFinanciera> getAll() {
        return (List<TipoEntidadFinanciera>) tipoEntidadFinancieraCrudRepository.findAll();
    }

    public Optional<TipoEntidadFinanciera> getTipoEntidadFinanciera(int tipoId) {
        return tipoEntidadFinancieraCrudRepository.findById(tipoId);
    }

    public TipoEntidadFinanciera save(TipoEntidadFinanciera tipoEntidadFinanciera) {
        return tipoEntidadFinancieraCrudRepository.save(tipoEntidadFinanciera);
    }

    public boolean delete(int tipoId) {
        return getTipoEntidadFinanciera(tipoId).map(tipoEntidadFinanciera -> {
            tipoEntidadFinancieraCrudRepository.deleteById(tipoId);
            return true;
        }).orElse(false);
    }
}
