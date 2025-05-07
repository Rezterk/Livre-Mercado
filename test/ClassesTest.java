
import model.categoria.Categoria;
import model.cliente.*;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kretz
 */
public class ClassesTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("10369874935", "Enzo");
        Categoria cat1 = new Categoria("Comida");
        Produto p1 = new Produto("Sorvete", 5.50, cat1, c1);
        Endereco e1 = new Endereco("Souza dutra", "353", "88888");
        c1.addEndereco(e1);
        for (Endereco endereco : c1.getEnderecos()) {
            System.out.println(endereco.getLogradouro() + " " + endereco.getNumero() + " " + endereco.getCep());
        }
        c1.getEstoque().addItem(p1, 5);
        for (Item item : c1.getEstoque().getItens()) {
            System.out.println(item.getProduto() + " " + item.getQuantidade());
        }
    }
}
