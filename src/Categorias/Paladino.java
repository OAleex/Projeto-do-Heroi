package Categorias;

import Interface.Vitalidade;
import Model.Cenario;
import Interface.Ataques;
import Model.Inventario;
import Vilao.Model.Lord;
import Vilao.Poderes.Fogo;
import Vilao.Poderes.Hipnose;

import java.util.ArrayList;
import java.util.List;

public class Paladino extends Inventario implements Ataques, Cenario, Vitalidade {

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
        System.out.println("Seu " + getListaDeArmas().get(1) + " possui " + arco + " de resistencia" +
                "e sua " + getListaDeArmas().get(2) + " possui " + flecha + " de dano.");
    }

    Hipnose hipnose = new Hipnose();
    Fogo fogo = new Fogo();
    Lord lord = new Lord(fogo);
    @Override
    public String toString() {
        return "-----"
                + lord;
    }
    @Override
    public void nomeDoCenario() {
        System.out.println("Cenario de Combate: Grecia\n");
    }
    @Override
    public void barraDeVida() {
        System.out.println("Barra de vida: 500/500\n");
    }
}
