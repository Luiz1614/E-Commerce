package org.eCommerce.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends _BaseEntity {
    private String nome;
    private String endereco;
    private List<Venda> historicoCompras = new ArrayList<>();

    public Cliente(int id, String nome, String endereco, List<Venda> historicoCompras) {
        super(id);
        this.nome = nome;
        this.endereco = endereco;
        this.historicoCompras = historicoCompras;
    }

    public Cliente(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Venda> getHistoricoCompras() {
        return historicoCompras;
    }

    public void setHistoricoCompras(List<Venda> historicoCompras) {
        this.historicoCompras = historicoCompras;
    }

    public void adicionarCompra(Venda venda){
        historicoCompras.add(venda);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", historicoCompras='" + historicoCompras + '\'' +
                '}';
    }
}
