package com.terceiraAPI.terceiraAPI.Model;

public class Produto {
    
    // atributos
    private Long id;
    private String nome;
    private double preco;

    // getter setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    // Construtor vazio (necessário para o Spring Boot)
    public Produto() {
    }

    // construtor
    public Produto(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}
