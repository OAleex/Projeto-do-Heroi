package Categorias;

import Interface.Ataques;
import Model.Inventario;
import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Inventario implements Ataques {

    public Guerreiro(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    public static ArrayList<String> addArma = new ArrayList<String>();

    static {
        addArma.add("Espada");
        addArma.add("Escudo");
    }

    public void ataqueDoPersonagem() {
        int espada = 35;
        int escudo = 50;
        System.out.println("\nSua " + getListaDeArmas().get(0) + " possui " + espada + " de ataque.");
        System.out.println("Seu " + getListaDeArmas().get(1) + " possui " + escudo + " de resistencia.");
    }

    }
