package com.joelespinozaro.calculadora.entity;

import javax.persistence.*;

@Entity
@Table(name = "asesor")
public class Asesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asesor_id")
    private Integer asesorId;

    @Column(name = "nombres", nullable = false)
    private String nombres;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    public void setAsesorId(Integer asesorId) {
        this.asesorId = asesorId;
    }

    public Integer getAsesorId() {
        return asesorId;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

}
