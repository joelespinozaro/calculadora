package com.joelespinozaro.calculadora.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipo_entidad_financiera")
public class TipoEntidadFinanciera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_id")
    private Integer tipoId;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public void setTipoId(Integer tipoId) {
        this.tipoId = tipoId;
    }

    public Integer getTipoId() {
        return tipoId;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
