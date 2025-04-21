/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livremercado;

import java.util.ArrayList;

/**
 *
 * @author kretz
 */
public class Cliente {
    private String name;
    private final ArrayList<Endereco> enderecos;
    private final ArrayList<ContaBancaria> contasBancarias;
    
    {
        enderecos = new ArrayList<>();
        contasBancarias = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addEndereco(Endereco novoEndereco) {
        Boolean achouEndereco = false;
        for (Endereco endereco : enderecos) {
            if (endereco.isEqual(novoEndereco))
                achouEndereco = true;
        }
        if (!achouEndereco)
            enderecos.add(novoEndereco);
    }
    
    public Endereco getEndereco(Integer indice) {
        return enderecos.get(indice);
    }

}
