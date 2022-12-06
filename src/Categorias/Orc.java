package Categorias;

import Interface.Ataques;
import Interface.Vitalidade;
import Model.Cenario;
import Model.Inventario;
import Vilao.Model.Lord;
import Vilao.Poderes.Fogo;
import Vilao.Poderes.Hipnose;

import java.util.ArrayList;
import java.util.List;

public class Orc extends Inventario implements Ataques, Cenario, Vitalidade {
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

    Hipnose hipnose = new Hipnose();
    Fogo fogo = new Fogo();
    Lord lord = new Lord(hipnose);
    @Override
    public String toString() {
        return "-----"
                + lord;
    }
    @Override
    public void nomeDoCenario() {
        System.out.println("Cenario de Combate: Floresta\n");
    }
    @Override
    public void barraDeVida() {
        System.out.println("Barra de vida: 600/600\n");
    }
}
