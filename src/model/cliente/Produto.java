/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;

/**
 *
 * @author rezterk
 */
class Produto {
    
    Produto(String nome, Double preco, Categoria categoria, Cliente vendedor) {
        if (preco <= 0)
            throw new IllegalArgumentException("Preço não pode ser <= 0");
        
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.vendedor = vendedor;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Cliente getVendedor() {
        return vendedor;
    }
    
    
    
    private String nome;
    private Double preco;
    private Categoria categoria;
    private Cliente vendedor;
}
