package com.example.LojaJogos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class JogoModel {

    @Column
    private String descricao;

    @Column
    private String empresa;
    @Id
    @Column
    private int codigo;

    @Column
    private double preco;

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}