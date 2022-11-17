package main;

public class Item {
    private String nome;
    private int dano_min;
    private int dano_max;

    public Item(String nome, int dano_min, int dano_max) {
        this.nome = nome;
        this.dano_min = dano_min;
        this.dano_max = dano_max;
    }

    public String getNome() {
        return nome;
    }

    public int getDano_min() {
        return dano_min;
    }

    public int getDano_max() {
        return dano_max;
    }
}
