package Categorias;

import Interface.Ataques;
import Model.Inventario;
import java.util.ArrayList;
import java.util.List;

public class Orc extends Inventario implements Ataques {
    public Orc(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    public static ArrayList<String> addArma = new ArrayList<String>();

    static {
        addArma.add("Clava");
        addArma.add("Escudo");
    }

    public void ataqueDoPersonagem() {
        int clava = 85;
        int escudo = 40;
        System.out.println("\nSua " + getListaDeArmas().get(0) + " possui " + clava + " de ataque.");
        System.out.println("Sua " + getListaDeArmas().get(1) + " possui " + escudo + " de resistencia.");
    }
}
