package Categorias;

import Model.Inventario;

import java.util.Collections;
import java.util.List;

public class Orc extends Inventario {
    public Orc(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    public static Inventario addArma = new Inventario(Collections.singletonList("Clava, " + "Escudo"));


}
