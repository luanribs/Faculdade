package com.mycompany.model.domain;

public class Cliente {
    private long id;
    private String nome;
    private String telefone;
    private String endereço;
    public Cliente(long id, String nome, String telefone, String endereço) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
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
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    



    

}
