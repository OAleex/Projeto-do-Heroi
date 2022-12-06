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

public class Guerreiro extends Inventario implements Ataques, Cenario, Vitalidade {

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
        System.out.println("Cenario de Combate: Mesopotamia\n");
    }
    @Override
    public void barraDeVida() {
        System.out.println("Barra de vida: 350/350\n");
    }
}
