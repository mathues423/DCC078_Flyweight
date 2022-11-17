package teste;

import main.Game;
import main.Item;
import main.ItemFabrica;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void deveRetornarAlunos() {
        Game jogo = new Game();
        jogo.criarGame("Thrall", "Doomhammer", 10, 25);
        jogo.criarGame("Lich King vermelho", "Frostmourne", 15, 20);
        jogo.criarGame("Lich King", "Frostmourne", 1, 35);

        List<String> saida = Arrays.asList(
                "Perconagem{nome='Thrall',Itens='{nome: Doomhammer(10,25)}'}",
                "Perconagem{nome='Lich King vermelho',Itens='{nome: Frostmourne(15,20)}'}",
                "Perconagem{nome='Lich King',Itens='{nome: Frostmourne(15,20)}'}"
                );

        assertEquals(saida, jogo.obterJogo());
    }

    @Test
    void deveRetornarTotalCidades() {
        Game jogo = new Game();
        jogo.criarGame("Thrall", "Doomhammer", 10, 25);
        jogo.criarGame("Lich King vermelho", "Frostmourne", 15, 20);
        jogo.criarGame("Lich King", "Frostmourne", 1, 35);
        jogo.criarGame("Lich KingII", "Frostmourne", 1, 35);
        //jogo.criarGame("ADMIN", "Frostmourne", 1, 35);
        //jogo.addItemPerconagem(new Item("Doomhammer", 10, 25), "ADMIN");
        assertEquals(2, ItemFabrica.getTotalItens());
    }
}