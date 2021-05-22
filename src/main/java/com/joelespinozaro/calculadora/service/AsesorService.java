package com.joelespinozaro.calculadora.service;

import com.joelespinozaro.calculadora.entity.Asesor;
import com.joelespinozaro.calculadora.repository.AsesorCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsesorService {

    @Autowired
    private AsesorCrudRepository asesorCrudRepository;

    public List<Asesor> getAll() {
        return (List<Asesor>) asesorCrudRepository.findAll();
    }

    public Optional<Asesor> getAsesor(int asesorId) {
        return asesorCrudRepository.findById(asesorId);
    }

    public Asesor save(Asesor asesor) {
        return asesorCrudRepository.save(asesor);
    }

    public boolean delete(int asesorId) {
        return getAsesor(asesorId).map(asesor -> {
            asesorCrudRepository.deleteById(asesorId);
            return true;
        }).orElse(false);
    }
}
