/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fabrica;

import java.util.List;
import view.gui.Cliente_View_Grafico;
import model.Fabrica;
import model.LivreMercado;
import model.autenticador.Autenticador_if;
import model.autenticador.Credencial_if;
import model.cliente.Cliente;
import model.cliente.Endereco;
import view.Autenticador_View;
import view.Cliente_Table_View;
import view.Cliente_View;
import view.Credencial_View;
import view.Endereco_View;
import view.LivreMercado_View;
import view.gui.Autenticador_View_Grafico;
import view.gui.Cliente_Table_View_Grafico;
import view.gui.CredencialLoginSenha_View_Grafico;
import view.gui.Endereco_View_Grafico;
import view.gui.LivreMercado_View_Grafico;

/**
 *
 * @author rafael.cancian
 */
public class Fabrica_Grafica extends Fabrica {
    @Override
    public Autenticador_View new_Autenticador_View(Autenticador_if model) {
        return new Autenticador_View_Grafico(model);
    }

    public Credencial_View new_Credencial_View(java.awt.Frame parent, boolean modal, Credencial_if model) {
        return new CredencialLoginSenha_View_Grafico(parent, modal, model);
    }

    @Override
    public Credencial_View new_Credencial_View(Credencial_if model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LivreMercado_View new_LivreMercado_View(LivreMercado model) {
        return new LivreMercado_View_Grafico(model);
    }

    public Cliente_View new_Cliente_View(java.awt.Frame parent, boolean modal, Cliente model) {
        return new Cliente_View_Grafico(parent, modal, model);
    }

    @Override
    public Cliente_View new_Cliente_View(Cliente model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Endereco_View new_Endereco_View(Endereco model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Endereco_View new_Endereco_View(java.awt.Frame parent, boolean modal, Endereco model) {
        return new Endereco_View_Grafico(parent, modal, model);
    }

    @Override
    public Cliente_Table_View new_Cliente_Table_View(List<Cliente> model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Cliente_Table_View new_Cliente_Table_View(java.awt.Frame parent, boolean modal, List<Cliente> model) {
        return new Cliente_Table_View_Grafico(parent, modal, model);
    }

}
