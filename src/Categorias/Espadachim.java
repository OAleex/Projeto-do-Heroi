package Categorias;

import Interface.Ataques;
import Model.Inventario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Espadachim extends Inventario implements Ataques {


    public Espadachim(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    public static Inventario addArma = new Inventario(Collections.singletonList("Espada Grande, " + "Espada Pequena"));

    @Override
    public void ataqueDoPersonagem() {
        int espadaGrande = 30;
        System.out.println("Possui:" + getListaDeArmas().indexOf(0) + "de ataque");
    }
}





