package com.Proj2.AlfaCafes.models;

import jakarta.persistence.*;
import java.util.Objects;
import com.Proj2.AlfaCafes.models.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    private String nome;

    private String referencia;

    private Double preco;

    private Double iva;

    @ManyToOne
    @JoinColumn(name = "id_lote")
    private Lote lote;

    public Produto() {}

    public Produto(Long idProduto, String nome, String referencia, Double preco, Double iva, Lote lote) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.referencia = referencia;
        this.preco = preco;
        this.iva = iva;
        this.lote = lote;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nome='" + nome + '\'' +
                ", referencia='" + referencia + '\'' +
                ", preco=" + preco +
                ", iva=" + iva +
                ", lote=" + (lote != null ? lote.getIdLote() : null) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(idProduto, produto.idProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto);
    }
}
