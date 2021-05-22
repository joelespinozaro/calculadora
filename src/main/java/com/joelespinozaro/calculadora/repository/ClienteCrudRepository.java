package com.joelespinozaro.calculadora.repository;

import com.joelespinozaro.calculadora.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClienteCrudRepository extends CrudRepository<Cliente,String> {
    Optional<Cliente> findByCorreoElectronicoAndContrasena(String correoElectronico, String contrasena);
}
