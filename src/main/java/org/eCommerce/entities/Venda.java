package org.eCommerce.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda extends _BaseEntity{
    private Cliente cliente;
    private List<ItemVenda> itemVenda = new ArrayList<>();
    private Date data;
    private double valorTotal;

    public Venda(int id, Cliente cliente, List<ItemVenda> itemVenda, Date data, double valorTotal) {
        super(id);
        this.cliente = cliente;
        this.itemVenda = itemVenda;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Venda(){}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(List<ItemVenda> itemVenda) {
        this.itemVenda = itemVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double calcularTotal(List<ItemVenda> itemVenda){
        for (ItemVenda item : itemVenda ){
            valorTotal += item.getProduto().getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itemVenda=" + itemVenda +
                ", data=" + data +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
