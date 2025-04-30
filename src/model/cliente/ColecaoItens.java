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
class ColecaoItens {
    
    public ArrayList<Item> getItens() {
        return itens;
    }
    
    void addItem(Item item) throws IllegalArgumentException {
        if (item == null)
            throw new IllegalArgumentException("Item não pode ser nulo");
        
        itens.add(item);
    }
    
    void removeItem(Item item) throws IllegalArgumentException {
        if (item == null || !itens.contains(item))
            throw new IllegalArgumentException("Item não pode ser nulo");
        
        itens.remove(item);
    }
    
    private ArrayList<Item> itens;
    {
        itens = new ArrayList<>();
    }
}
