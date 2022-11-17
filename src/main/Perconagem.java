package main;

import java.util.ArrayList;
import java.util.List;

public class Perconagem {
    private String nome;
    private List<Item> bolsa = new ArrayList<>();

    public Perconagem(String nome, Item inicial) {
        this.nome = nome;
        this.bolsa.add(inicial);
    }

    public void addItem(Item item){
        this.bolsa.add(item);
    }
    public String obterPerconagem() {
        String itens = "";
        for (Item saida : this.bolsa){
            itens += "{nome: " + saida.getNome() + "("+saida.getDano_min()+","+saida.getDano_max()+")}";
        }
        return "Perconagem{" +
                "nome='" + this.nome + '\'' +
                ",Itens='"+itens+'\''+
                '}';
    }

    public String getNome(){
        return this.nome;
    }
}
