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
public class Cliente {
    
    public Cliente(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }
    
    private final String CPF;
    private String nome;
    private ArrayList<Endereco> enderecos;
    private ColecaoItens estoque;
    private ColecaoItens carrinho;
    private ArrayList<ContaBancaria> contaBancaria;
    {
        enderecos = new ArrayList<>();
        contaBancaria = new ArrayList<>();
    }
}
