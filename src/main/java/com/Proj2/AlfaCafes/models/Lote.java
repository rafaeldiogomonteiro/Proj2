package com.Proj2.AlfaCafes.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLote;

    @Column(length = 50, nullable = false)
    private String codigo;

    private LocalDate dataCriacao;

    public Lote() {}

    public Lote(Long idLote, String codigo, LocalDate dataCriacao) {
        this.idLote = idLote;
        this.codigo = codigo;
        this.dataCriacao = dataCriacao;
    }

    public Long getIdLote() {
        return idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lote)) return false;
        Lote lote = (Lote) o;
        return Objects.equals(idLote, lote.idLote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLote);
    }

    @Override
    public String toString() {
        return "Lote{" +
                "idLote=" + idLote +
                ", codigo='" + codigo + '\'' +
                ", dataCriacao=" + dataCriacao +
                '}';
    }
}
