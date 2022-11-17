package main;

import java.util.HashMap;
import java.util.Map;

public class ItemFabrica {
    private static Map<String, Item> itens = new HashMap<>();

    public static Item getItem(String nome, int dano_min, int dano_max) {
        Item item = itens.get(nome);
        if (item == null) {
            item = new Item(nome, dano_min, dano_max);
            itens.put(nome, item);
        }
        return item;
    }

    public static int getTotalItens() {
        return itens.size();
    }
}
