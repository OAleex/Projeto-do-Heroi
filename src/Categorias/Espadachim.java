package Categorias;

import Interface.Ataques;
import Model.Inventario;
import java.util.ArrayList;
import java.util.List;

public class Espadachim extends Inventario implements Ataques {


    public Espadachim(List<String> listaDeArmas) {
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


}





