package com.mycompany.model.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Produto {
    private long id;
    private String nome;
    private String descricao;
    private BigDecimal preço;
    private Integer quantidade;
    private Categoria categoria;
    private Usuario usuario;
    private LocalDateTime dataHoraCriacao;
    
    public Produto(long id, String nome, String descricao, BigDecimal preço, Integer quantidade, Categoria categoria,
            Usuario usuario, LocalDateTime dataHoraCriacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preço = preço;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.usuario = usuario;
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public Produto() {
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
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getPreço() {
        return preço;
    }
    public void setPreço(BigDecimal preço) {
        this.preço = preço;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }
    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    
}
