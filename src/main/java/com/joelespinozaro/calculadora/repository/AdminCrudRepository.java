package com.joelespinozaro.calculadora.repository;

import com.joelespinozaro.calculadora.entity.Admin;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdminCrudRepository extends CrudRepository<Admin,Integer> {
    Optional<Admin> findByUsuarioAndContrasena(String usuario, String contrasena); //Query Methods
}
