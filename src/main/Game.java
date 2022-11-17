package main;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Perconagem> perconagens = new ArrayList<>();

    public void criarGame(String nomePerconagem, String nomeItem, int dano_min, int dano_max) {
        Item item = ItemFabrica.getItem(nomeItem, dano_min, dano_max);
        Perconagem perconagem = new Perconagem(nomePerconagem, item);
        perconagens.add(perconagem);
    }

    public List<String> obterJogo() {
        List<String> saida = new ArrayList<String>();
        for (Perconagem perconagem : this.perconagens) {
            saida.add(perconagem.obterPerconagem());
        }
        return saida;
    }
}
