/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;

import model.categoria.Categoria;

/**
 *
 * @author rezterk
 */
public class Produto {
    
    public Produto(String nome, Double preco, Categoria categoria, Cliente vendedor) {
        if (vendedor == null)
            throw new IllegalArgumentException("Vendedor não pode ser nulo");
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

    public void setPreco(Double preco) throws IllegalArgumentException {
        if (preco <= 0)
            throw new IllegalArgumentException("Preço não pode ser <= 0");
        
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return (this.nome.equals(produto.nome) && this.preco == produto.preco
                && this.categoria.equals(produto.categoria)
                && this.vendedor.equals(produto.vendedor));
    }
    
    private String nome;
    private Double preco;
    private Categoria categoria;
    private Cliente vendedor;
}
