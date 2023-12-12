package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Selecao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer numerocopas;
    private String corcamisaprincipal;
    private String corcamisasecundaria;
    private boolean favorita;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getnumerocopas() {
        return numerocopas;
    }
    public void setNumero_copas(Integer numerocopas) {
        this.numerocopas = numerocopas;
    }
    public String getCorcamisaprincipal() {
        return corcamisaprincipal;
    }
    public void corcamisaprincipal(String corcamisaprincipal) {
        this.corcamisaprincipal = corcamisaprincipal;
    }
    public String getCorcamisasecundaria() {
        return corcamisasecundaria;
    }
    public void setCorcamisasecundaria(String Corcamisasecundaria) {
        this.corcamisasecundaria = Corcamisasecundaria;
    }
    public boolean isFavorita() {
        return favorita;
    }
    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }   

    


    
}
