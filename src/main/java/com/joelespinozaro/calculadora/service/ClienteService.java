package com.joelespinozaro.calculadora.service;

import com.joelespinozaro.calculadora.entity.Cliente;
import com.joelespinozaro.calculadora.repository.ClienteCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAll() {
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public Optional<Cliente> getCliente(String clienteId) {
        return clienteCrudRepository.findById(clienteId);
    }

    public Cliente save(Cliente cliente) {
        return clienteCrudRepository.save(cliente);
    }

    public boolean delete(String clienteId) {
        return getCliente(clienteId).map(cliente -> {
            clienteCrudRepository.deleteById(clienteId);
            return true;
        }).orElse(false);
    }

    public Optional<Cliente> getClienteByLogin(String correoElectronico, String contrasena) {
        return clienteCrudRepository.findByCorreoElectronicoAndContrasena(correoElectronico,contrasena);
    }
}
