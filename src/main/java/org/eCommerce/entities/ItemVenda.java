package org.eCommerce.entities;

public class ItemVenda extends _BaseEntity{
    private Produto produto;
    private int quantidade;

    public ItemVenda(int id, Produto produto, int quantidade) {
        super(id);
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemVenda(){}

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
