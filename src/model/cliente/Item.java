/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;

/**
 *
 * @author rezterk
 */
class Item {
    public Item(Produto produto, Integer quantidade) {
        if (quantidade < 0)
            throw new IllegalArgumentException("Quantidade não pode ser < 0");
        
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    private Produto produto;
    private Integer quantidade;
}
