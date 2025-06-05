/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.memento;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kretz
 */
public class ColecaoProdutosCaretaker {
    
    public void saveMemento(ColecaoProdutosMemento memento) {
        savepointStorage.put(indexAtual, memento);
        for (int i = indexAtual + 1; i >= savepointStorage.size(); i++) {
            savepointStorage.remove(i);
        }
        indexAtual++;
    }
    
    public ColecaoProdutosMemento undo() {
        if (indexAtual > 0) indexAtual--;
        return savepointStorage.get(indexAtual);
    }
    
    public ColecaoProdutosMemento redo() {
        if (savepointStorage.containsKey(indexAtual + 1)) indexAtual++;
        return savepointStorage.get(indexAtual);
    }
    
    private Map<Integer, ColecaoProdutosMemento> savepointStorage;
    private int indexAtual;
    {
        savepointStorage = new HashMap<>();
        indexAtual = 0;
    }
}
