package com.joelespinozaro.calculadora.entity;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "calculo_interes")
public class CalculoInteres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitud_id", nullable = false)
    private Integer solicitudId;

    @Column(name = "tasa_interes", nullable = false)
    private BigDecimal tasaInteres;

    @Column(name = "capital", nullable = false)
    private BigDecimal capital;

    @Column(name = "periodo_meses", nullable = false)
    private Integer periodoMeses;

    @Column(name = "tipo_interes", nullable = false)
    private String tipoInteres;

    @Column(name = "cliente_id", nullable = false)
    private Integer clienteId;

    @Column(name = "asesor_id", nullable = false)
    private Integer asesorId;

    @Column(name = "entidad_financiera_id", nullable = false)
    private Integer entidadFinancieraId;

    @Formula(value = "CASE WHEN tipo_interes='SIMPLE' THEN capital+(capital*tasa_interes*periodo_meses/12) WHEN tipo_interes='COMPUESTO' THEN capital*power((1 + tasa_interes), periodo_meses/12) END")
    private Double capitalFinal;

    @ManyToOne
    @JoinColumn(name = "asesor_id", insertable = false, updatable = false)
    private Asesor asesor;

    @ManyToOne
    @JoinColumn(name = "cliente_id", insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "entidad_financiera_id", insertable = false, updatable = false)
    private EntidadFinanciera entidadFinanciera;

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public void setSolicitudId(Integer solicitudId) {
        this.solicitudId = solicitudId;
    }

    public Integer getSolicitudId() {
        return solicitudId;
    }

    public void setTasaInteres(BigDecimal tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setPeriodoMeses(Integer periodoMeses) {
        this.periodoMeses = periodoMeses;
    }

    public Integer getPeriodoMeses() {
        return periodoMeses;
    }

    public void setTipoInteres(String tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public String getTipoInteres() {
        return tipoInteres;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setAsesorId(Integer asesorId) {
        this.asesorId = asesorId;
    }

    public Integer getAsesorId() {
        return asesorId;
    }

    public void setEntidadFinancieraId(Integer entidadFinancieraId) {
        this.entidadFinancieraId = entidadFinancieraId;
    }

    public Integer getEntidadFinancieraId() {
        return entidadFinancieraId;
    }

    public Double getCapitalFinal() {
        return capitalFinal;
    }

    public void setCapitalFinal(Double capitalFinal) {
        this.capitalFinal = capitalFinal;
    }
}
