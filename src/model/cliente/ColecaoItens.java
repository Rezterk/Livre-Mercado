/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;

import java.util.ArrayList;

/**
 *
 * @author rezterk
 */
public class ColecaoItens {
    
    public ArrayList<Item> getItens() {
        return itens;
    }
    
    public void addItem(Produto produto, int quantidade) throws IllegalArgumentException {
        for(Item item : itens) {
            if(item.getProduto().equals(produto)) {
                item.addQuantidade(quantidade);
                return;
            }
        }
        itens.add(new Item(produto, quantidade));
    }
    
    void removeItem(Produto produto) {
        for(Item item : itens) {
            if(item.getProduto().equals(produto)){
                itens.remove(item);
                return;
            }
        }
    }
    
    void reduzaQuantidadeItem(Produto produto, int quantidade) throws IllegalArgumentException{
        for(Item item : itens) {
            if(item.getProduto().equals(produto)) {
                item.removeQuantidade(quantidade);
                return;
            }
        }
    }
    
    private ArrayList<Item> itens;
    {
        itens = new ArrayList<>();
    }
}
