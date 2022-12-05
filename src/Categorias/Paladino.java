package Categorias;

import Model.Inventario;
import java.util.ArrayList;
import java.util.List;

public class Paladino extends Inventario {

    public Paladino(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    public static ArrayList<String> addArma = new ArrayList<String>();

    static {
        addArma.add("Adaga");
        addArma.add("Arco");
        addArma.add("Flecha");
    }

    public void ataqueDoPersonagem() {
        int adaga = 45;
        int arco = 75;
        int flecha = 55;
        System.out.println("\nSua " + getListaDeArmas().get(0) + " possui " + adaga + " de ataque.");
        System.out.println("Seu " + getListaDeArmas().get(1) + " possui " + arco + " de resistencia\n" +
                "e sua " + getListaDeArmas().get(2) + " possui " + flecha + " de dano.");
    }
}
