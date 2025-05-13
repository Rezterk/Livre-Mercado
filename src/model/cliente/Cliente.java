/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rezterk
 */
public class Cliente {
    
    public Cliente(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public ColecaoItens getEstoque() {
        return estoque;
    }

    public ColecaoItens getCarrinho() {
        return carrinho;
    }

    public List<ContaBancaria> getContasBancarias() {
        return Collections.unmodifiableList(contasBancarias);
    }
    
    public void addContaBancaria(String numeroConta) {
        contasBancarias.add(new ContaBancaria(numeroConta));
    }
    
    public void addEndereco(Endereco novoEndereco) {
        if(novoEndereco != null && !enderecos.contains(novoEndereco))
            enderecos.add(novoEndereco);
    }
    
    public void removeEndereco(Endereco remEndereco) {
        for(Endereco endereco : enderecos) {
            if(endereco.equals(remEndereco)) {
                enderecos.remove(endereco);
                return;
            }
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Cliente cliente = (Cliente) obj;
        return this.CPF.equals(cliente);
    }
    
    private final String CPF;
    private String nome;
    private ArrayList<Endereco> enderecos;
    private ColecaoItens estoque;
    private ColecaoItens carrinho;
    private ArrayList<ContaBancaria> contasBancarias;
    {
        enderecos = new ArrayList<>();
        contasBancarias = new ArrayList<>();
        estoque = new ColecaoItens();
        carrinho = new ColecaoItens();
    }
}
