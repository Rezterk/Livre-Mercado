/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.categoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rafael.cancian
 */
public class Categoria implements Categoria_if{
    
    public Categoria(String nome) {
        this.nome = nome;
    }

    @Override
    public void addCategoria(Categoria categoria) {
        // TODO: deve verificar se a categoria jaa existe
        children.add(categoria);
    }
    
    @Override
    public List<Categoria_if> getChildren() {
        return Collections.unmodifiableList(children);
    }

    /**
     * @return the nome
     */
    @Override
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    private final ArrayList<Categoria_if> children;
    private String nome;
    {
        children = new ArrayList<>();
    }
}
