/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livremercado;

/**
 *
 * @author kretz
 */
class Endereco {
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    
    public Boolean isEqual(Endereco endereco) {
        if (logradouro.equalsIgnoreCase(endereco.getLogradouro()) &&
            numero == endereco.getNumero() && 
            complemento.equalsIgnoreCase(endereco.getComplemento()) &&
            bairro.equalsIgnoreCase(endereco.getBairro())) {
            return true;
        }
        return false;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
