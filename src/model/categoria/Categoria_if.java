/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.categoria;

import java.util.List;

/**
 *
 * @author rafael.cancian
 */
public interface Categoria_if {
    public void addCategoria(Categoria categoria);
    List<Categoria_if> getChildren();
    String getNome();
    void setNome(String nome);
}
