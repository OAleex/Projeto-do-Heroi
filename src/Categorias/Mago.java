package Categorias;

import Interface.Ataques;
import Model.Inventario;
import Vilao.Model.Lord;
import Vilao.Poderes.Fogo;
import Vilao.Poderes.Hipnose;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Inventario implements Ataques {
    public Mago(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    public static ArrayList<String> addArma = new ArrayList<String>();

    static {
        addArma.add("Cajado");
        addArma.add("Livro de Encantamentos");
    }

    public void ataqueDoPersonagem() {
        int cajado = 60;

        System.out.println("\nSeu " + getListaDeArmas().get(0) + " possui " + cajado + " de ataque a distancia.");
        System.out.println("Seu " + getListaDeArmas().get(1) + " possui a capacidade de traduzir idiomas.\n");
    }

    Hipnose hipnose = new Hipnose();
    Fogo fogo = new Fogo();
    Lord lord = new Lord(hipnose);
    @Override
    public String toString() {
        return "-----"
                + lord;
    }

}

// HashMap vai ser para o Mago traduzir coisas pelo livro de encantamento