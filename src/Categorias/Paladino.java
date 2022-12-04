package Categorias;

import Model.Inventario;

import java.util.Collections;
import java.util.List;

public class Paladino extends Inventario {



    public Paladino(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    Inventario addArma = new Inventario(Collections.singletonList("Adaga, " + "Arco"));

}
