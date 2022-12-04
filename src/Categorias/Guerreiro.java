package Categorias;

import Model.Inventario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Guerreiro extends Inventario {

    public Guerreiro(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    Inventario addArma = new Inventario(Collections.singletonList("Espada, " + "Escudo"));

    }
