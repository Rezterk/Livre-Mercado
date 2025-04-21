/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import model.autenticador.Autenticador_if;
import model.categoria.Categoria;
import model.categoria.Categoria_if;

/**
 *
 * @author rafael.cancian
 */
public class LivreMercado {

    public LivreMercado() {
        initOrLoad();
    }
    public Autenticador_if getAutenticador() {
        return autenticador;
    }

    private void initOrLoad() {
        // inicializa categorias
        Categoria g1, g2;
        categoriaRaiz.addCategoria(new Categoria("Veiculos"));
        g1 = new Categoria("Tecnologia");
        categoriaRaiz.addCategoria(g1);
        categoriaRaiz.addCategoria(new Categoria("Casa e Mooveis"));
        g1.addCategoria(new Categoria("Informatica"));
        g1.addCategoria(new Categoria("Games"));
        g2 = new Categoria("Celulares e Telefones");
        g1.addCategoria(g2);
        g2.addCategoria(new Categoria("Peccas para Celular"));
    }
    
    /**
     * @return the categoriaRai
     */
    Categoria_if getCategoriaRaiz() {
        return categoriaRaiz;
    }
    private final Autenticador_if autenticador;
    private final Categoria_if categoriaRaiz;
    {
        categoriaRaiz = new Categoria("Geral");
        autenticador = Fabrica.new_Autenticador();
    }


}
