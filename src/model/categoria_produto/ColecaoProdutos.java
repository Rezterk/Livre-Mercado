package model.categoria_produto;

import java.util.ArrayList;
import java.util.List;
import model.memento.ColecaoProdutosCaretaker;
import model.memento.ColecaoProdutosMemento;

/**
 * Classe que representa uma coleção de itens de produtos.
 * Pode ser utilizada tanto para o estoque de venda quanto para o carrinho de compras.
 */
public class ColecaoProdutos {

    private ColecaoProdutosCaretaker caretaker;
    /** Lista de itens de produtos. */
    private List<ItemProduto> itens;

    /**
     * Construtor que inicializa a coleção vazia.
     */
    public ColecaoProdutos() {
        this.itens = new ArrayList<ItemProduto>();
        createMemento();
    }
    
    private void setItens(List<ItemProduto> itens) {
        this.itens.clear();
        this.itens.addAll(itens);
    }

    /**
     * Adiciona um item de produto à coleção.
     *
     * @param item Item do produto a ser adicionado.
     */
    public void adicionarItem(ItemProduto item) {
        this.itens.add(item);
    }

    /**
     * Remove um item de produto da coleção.
     *
     * @param item Item do produto a ser removido.
     * @return true se o item for removido com sucesso, false caso contrário.
     */
    public boolean removerItem(ItemProduto item) {
        return this.itens.remove(item);
    }

    /**
     * Retorna a lista de itens de produto.
     * TODO: Retornar uma lista costuma não ser uma prática. Deveria ser evitado
     * @return lista de itens.
     */
    public List<ItemProduto> getItens() {
        return itens;
    }

    /**
     * Calcula o valor total dos itens na coleção.
     *
     * @return valor total dos produtos na coleção.
     */
    public double calcularTotal() {
        double total = 0;
        for (ItemProduto item : itens) {
            total += item.getProduto().getPrecoBase() * item.getQuantidade();
        }
        return total;
    }
    
    public void createMemento() {
        caretaker.saveMemento(new ColecaoProdutosMemento(itens));
    }
    
    public void undo() {
        ColecaoProdutosMemento mem = caretaker.undo();
        setItens(mem.getState());
    } 
    
    public void redo() {
        ColecaoProdutosMemento mem = caretaker.redo();
        setItens(mem.getState());
    }

    @Override
    public String toString() {
        String result = "ColecaoProdutos:\n";
        if (itens != null && !itens.isEmpty()) {
            for (ItemProduto item : itens) {
                result += "  - " + item.toString() + "\n";
            }
        } else {
            result += "  [Nenhum item]";
        }
        return result;
    }
}
