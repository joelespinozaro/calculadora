package com.joelespinozaro.calculadora.repository;

import com.joelespinozaro.calculadora.entity.EntidadFinanciera;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface EntidadFinancieraCrudRepository extends CrudRepository<EntidadFinanciera, Integer> {
    List<EntidadFinanciera> findByTasaInteresBetween(BigDecimal tasaInicial, BigDecimal tasaFinal);
}
