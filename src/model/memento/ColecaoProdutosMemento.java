/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.memento;

import java.util.ArrayList;
import java.util.List;
import model.categoria_produto.ItemProduto;

/**
 *
 * @author kretz
 */
public class ColecaoProdutosMemento {
    
    public ColecaoProdutosMemento(List<ItemProduto> itens) {
        this.itens.addAll(itens);
    }
    
    public List<ItemProduto> getState() {
        return itens;
    }
    
    private List<ItemProduto> itens;
    {
        itens = new ArrayList<>();
    }
}
