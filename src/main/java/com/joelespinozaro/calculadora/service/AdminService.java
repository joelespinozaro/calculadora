package com.joelespinozaro.calculadora.service;

import com.joelespinozaro.calculadora.entity.Admin;
import com.joelespinozaro.calculadora.repository.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public List<Admin> getAll() {
        return (List<Admin>) adminCrudRepository.findAll();
    }

    public Optional<Admin> getAdmin(String usuario, String contrasena) {
        return adminCrudRepository.findByUsuarioAndContrasena(usuario,contrasena);
    }
}
