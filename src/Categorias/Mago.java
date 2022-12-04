package Categorias;

import Model.Inventario;
import java.util.Collections;
import java.util.List;

public class Mago extends Inventario {
    public Mago(List<String> listaDeArmas) {
        super(listaDeArmas);
    }

    public static Inventario addArma = new Inventario(Collections.singletonList("Cajado, " + "Livro de Encantamentos"));

    // HashMap vai ser para o Mago traduzir coisas pelo livro de encantamento

}
