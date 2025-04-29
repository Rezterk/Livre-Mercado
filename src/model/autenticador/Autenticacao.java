/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.autenticador;

/**
 *
 * @author rafaelcancian
 */
public class Autenticacao {
    Autenticacao(Credencial_if credencialUsada) {
        this.credencialUsada = credencialUsada;
    }

    Credencial_if getCredencialUsada() {
        return credencialUsada;
    }

    private final Credencial_if credencialUsada;
}
