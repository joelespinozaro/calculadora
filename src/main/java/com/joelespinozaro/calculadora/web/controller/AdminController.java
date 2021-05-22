package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.entity.Admin;
import com.joelespinozaro.calculadora.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    public List<Admin> getAll() {
        return adminService.getAll();
    }

    @GetMapping("/login")
    public Optional<Admin> getAdmin(@RequestParam("usuario") String usuario, @RequestParam ("contrasena") String contrasena) {
        return adminService.getAdmin(usuario,contrasena);
    }
}
