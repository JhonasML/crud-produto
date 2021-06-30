package com.mercadolivre.crudproduto.models;

public class Produto {
    private Long id;
    private String nome;
    private String categoria;
    private Long codigoDeBarras;
    private String detalhes;

    public Produto() {
    }

    public Produto(String nome, String categoria, long codigoDeBarras, String detalhes) {
        this.nome = nome;
        this.categoria = categoria;
        this.codigoDeBarras = codigoDeBarras;
        this.detalhes = detalhes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(Long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
