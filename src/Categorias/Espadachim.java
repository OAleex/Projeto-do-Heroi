package Categorias;

import Model.Inventario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Espadachim extends Inventario {

    public Espadachim(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    Inventario addArma = new Inventario(Collections.singletonList("Espada Grande, " + "Espada Pequena"));

}





