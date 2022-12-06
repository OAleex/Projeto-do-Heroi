package Categorias;

import Interface.Ataques;
import Interface.Vitalidade;
import Model.Cenario;
import Model.Inventario;
import Vilao.Poderes.Fogo;
import Vilao.Model.Lord;
import Vilao.Poderes.Hipnose;

import java.util.ArrayList;
import java.util.List;

public class Espadachim extends Inventario implements Ataques, Cenario, Vitalidade {




    public Espadachim(List<String> listaDeArmas ) {
        super(listaDeArmas);
    }



    public static ArrayList<String> addArma = new ArrayList<String>();

    static {
        addArma.add("Espada Grande");
        addArma.add("Espada Pequena");
    }

    public void ataqueDoPersonagem() {
        int espadaGrande = 30;
        int espadaPequena = 15;
        System.out.println("\nSua " + getListaDeArmas().get(0) + " possui " + espadaGrande + " de ataque.");
        System.out.println("Sua " + getListaDeArmas().get(1) + " possui " + espadaPequena + " de ataque.");
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
        System.out.println("Cenario de Combate: Lago\n");
    }

    @Override
    public void barraDeVida() {
        System.out.println("Barra de vida: 300/300\n");
    }
}
