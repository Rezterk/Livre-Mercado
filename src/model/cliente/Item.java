/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;

/**
 *
 * @author rezterk
 */
public class Item {
    public Item(Produto produto, Integer quantidade) {
        if (produto == null)
            throw new IllegalArgumentException("Produto não pode ser nulo");
        if (quantidade < 0)
            throw new IllegalArgumentException("Quantidade não pode ser < 0");
        
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    
    void addQuantidade(int quantidade) throws IllegalArgumentException {
        if (quantidade < 0)
            throw new IllegalArgumentException("Não é possível adicionar uma quantidade negativa");
        
        this.quantidade += quantidade;
    }
    
    void removeQuantidade(int quantidade) throws IllegalArgumentException {
        if (quantidade < 0)
            throw new IllegalArgumentException("Não é possível subtrair uma quantidade negativa");
        if (quantidade > this.quantidade)
            throw new IllegalArgumentException("Quantidade indisponível para subtrair");
        
        this.quantidade -= quantidade;
    }
    
    private Produto produto;
    private int quantidade;
}
