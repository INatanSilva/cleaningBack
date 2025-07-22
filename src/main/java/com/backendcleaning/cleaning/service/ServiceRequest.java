package com.backendcleaning.cleaning.service;

import jakarta.persistence.*;

@Entity
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String tipoLimpeza;
    private String numeroContato;

    public ServiceRequest() {}

    public ServiceRequest(String nome, String tipoLimpeza, String numeroContato) {
        this.nome = nome;
        this.tipoLimpeza = tipoLimpeza;
        this.numeroContato = numeroContato;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoLimpeza() {
        return tipoLimpeza;
    }

    public void setTipoLimpeza(String tipoLimpeza) {
        this.tipoLimpeza = tipoLimpeza;
    }

    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }
}
