package com.joelespinozaro.calculadora.web.controller;

import com.joelespinozaro.calculadora.entity.Cliente;
import com.joelespinozaro.calculadora.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public List<Cliente> getAll() {
        return clienteService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> getCliente(@PathVariable("id") String clienteId){
        return clienteService.getCliente(clienteId);
    }

    @GetMapping("/login")
    public Optional<Cliente> getClienteByLogin(@RequestParam("correo") String correo, @RequestParam("contrasena") String contrasena){
        return clienteService.getClienteByLogin(correo,contrasena);
    }

    @PostMapping("/")
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") String clienteId) {
        return clienteService.delete(clienteId);
    }


}
