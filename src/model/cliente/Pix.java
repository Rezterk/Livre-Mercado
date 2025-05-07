/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;

/**
 *
 * @author kretz
 */
public class Pix extends MetodoPagamento {
    public Pix(ContaBancaria contaVinculada) {
        super(contaVinculada);
    }
    
    @Override
    public void pague() {
        
    }
}
