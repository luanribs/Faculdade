package com.mycompany.model.domain;

import java.time.LocalDateTime;

public class Usuario {
    private long id;
    private String nome;
    private String senha;
    private String usuario;
    private Perfil perfil;
    private boolean estado;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimoLogin;

    public Usuario(LocalDateTime dataHoraCriacao, boolean estado, long id, String nome, Perfil perfil, String senha, LocalDateTime ultimoLogin, String usuario) {
        this.dataHoraCriacao = dataHoraCriacao;
        this.estado = true;
        this.id = id;
        this.nome = nome;
        this.perfil = perfil;
        this.senha = senha;
        this.ultimoLogin = ultimoLogin;
        this.usuario = usuario;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public void reset() {
    this.estado = true;
    }
    public void mudarEstado() {
        this.estado = !this.estado;
    }

}
