
import model.categoria.Categoria;
import model.cliente.Cliente;
import model.cliente.Endereco;
import model.cliente.Item;
import model.cliente.Produto;

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
        Produto p1 = null;
        Endereco e1 = null;
        c1.addEndereco(e1);
        for (Endereco endereco : c1.getEnderecos()) {
            System.out.println(endereco.getLogradouro() + " " + endereco.getNumero() + " " + endereco.getCep());
        }
        try{
            c1.getEstoque().addItem(p1, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Item item : c1.getEstoque().getItens()) {
            System.out.println(item.getProduto().getNome() + " " + item.getProduto().getPreco() + " " + item.getQuantidade());
        }
    }
}
