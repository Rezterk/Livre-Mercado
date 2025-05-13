/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;

import java.util.ArrayList;

/**
 *
 * @author rezterk
 */
class ContaBancaria {
    
    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getCredito() {
        return credito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) throws IllegalArgumentException{
        if (limiteCredito <= 0)
            throw new IllegalArgumentException("Limite precisa ser > 0");
        this.limiteCredito = limiteCredito;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public ArrayList<MetodoPagamento> getMetodosPagamento() {
        return metodosPagamento;
    }
    
    public void depositar(double quantidade) throws IllegalArgumentException{
        if (quantidade <= 0)
            throw new IllegalArgumentException("Depósito precisa ser > 0");
        saldo += quantidade;
    }
    
    public void sacar(double quantidade) throws IllegalArgumentException{
        if (quantidade <= 0)
            throw new IllegalArgumentException("Saque precisa ser > 0");
        saldo -= quantidade;
    }
    
    public void compraCredito(double quantidade) throws IllegalArgumentException{
        if (quantidade <= 0)
            throw new IllegalArgumentException("Compra precisa ser > 0");
        if (this.credito + quantidade > limiteCredito)
            throw new IllegalArgumentException("Compra excede o limite de crédito");
        
        credito += quantidade;
    }
    
    public void quitarCredito() {
        if (credito > saldo)
            throw new IllegalStateException("Saldo insuficiente para o pagamento");
        saldo -= credito;
        credito = 0.0;
    }
    
    private double saldo;
    private double credito;
    private double limiteCredito;
    private String numeroConta;
    private ArrayList<MetodoPagamento> metodosPagamento;
    {
        metodosPagamento = new ArrayList<>();
    }
}
