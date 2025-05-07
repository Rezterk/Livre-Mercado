/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;

/**
 *
 * @author kretz
 */
abstract class MetodoPagamento {
    
    public MetodoPagamento(ContaBancaria contavinculada) {
        this.contaVinculada = contaVinculada;
    }
    
    private ContaBancaria contaVinculada;
    public abstract void pague();
}
