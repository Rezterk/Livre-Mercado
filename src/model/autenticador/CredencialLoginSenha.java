/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.autenticador;

/**
 *
 * @author rafaelcancian
 */
public class CredencialLoginSenha implements Credencial_if {
    public CredencialLoginSenha(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    public String getUsuario() {
        return usuario;
    }
    private final String senha;
    private final String usuario;
}
