package com.example.LojaJogosPN.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Jogo {
    @Column
    private String descricao;
    @Id
    @Column
    private int codigo;
    @Column
    private int preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
