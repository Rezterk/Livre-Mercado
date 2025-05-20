/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenstxt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.cliente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.categoria_produto.ColecaoProdutos;
import model.contaBancaria.ContaBancaria;

/**
 *
 * @author rezterk
 */
public class Cliente {
    
    public Cliente(String CPF, String nome, ContaBancaria contaBancaria) {
        this.CPF = CPF;
        this.nome = nome;
        this.contaBancaria = contaBancaria;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public ColecaoProdutos getEstoque() {
        return estoque;
    }

    public ColecaoProdutos getCarrinho() {
        return carrinho;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public List<ContaBancaria> getContasBancarias() {
        return Collections.unmodifiableList(contasBancarias);
    }
    
    public void addContaBancaria(ContaBancaria novaConta) {
        contasBancarias.add(novaConta);
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
    private ColecaoProdutos estoque;
    private ColecaoProdutos carrinho;
    private ContaBancaria contaBancaria;
    private ArrayList<ContaBancaria> contasBancarias;
    {
        enderecos = new ArrayList<>();
        contasBancarias = new ArrayList<>();
        estoque = new ColecaoProdutos();
        carrinho = new ColecaoProdutos();
    }
}
