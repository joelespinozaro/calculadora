package com.joelespinozaro.calculadora.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "entidad_financiera")
public class EntidadFinanciera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entidad_financiera_id", nullable = false)
    private Integer entidadFinancieraId;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "tasa_interes", nullable = false)
    private BigDecimal tasaInteres;

    @Column(name = "tipo_id", nullable = false)
    private Integer tipoId;

    @ManyToOne
    @JoinColumn(name = "tipo_id", insertable = false, updatable = false)
    private TipoEntidadFinanciera tipoEntidadFinanciera;

    public TipoEntidadFinanciera getTipoEntidadFinanciera() {
        return tipoEntidadFinanciera;
    }

    public void setTipoEntidadFinanciera(TipoEntidadFinanciera tipoEntidadFinanciera) {
        this.tipoEntidadFinanciera = tipoEntidadFinanciera;
    }

    public void setEntidadFinancieraId(Integer entidadFinancieraId) {
        this.entidadFinancieraId = entidadFinancieraId;
    }

    public Integer getEntidadFinancieraId() {
        return entidadFinancieraId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTasaInteres(BigDecimal tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    public void setTipoId(Integer tipoId) {
        this.tipoId = tipoId;
    }

    public Integer getTipoId() {
        return tipoId;
    }
}
