package com.example.LojaJogos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ClienteModel {


    @Column
    private String nome;
    @Column
    private String email;
    @Id
    @Column
    private int codigo;



    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {this.codigo = codigo;
    }
}

