package Model;

import java.util.ArrayList;
import java.util.Objects;

public class Inventario {

    public void armasParaGuerreiro(){
        ArrayList<String> armas_guerreiro = new ArrayList<String>();
        armas_guerreiro.add("Espada");
        armas_guerreiro.add("Escudo");

    }

    public void armasParaMago(){
        ArrayList<String> armas_mago = new ArrayList<String>();
        armas_mago.add("Cajado");
        armas_mago.add("Livro de Encantamentos");

        // HashMap vai ser para o Mago traduzir coisas pelo livro de encantamento
    }

    public void armasParaPaladino(){
        ArrayList<String> armas_paladino = new ArrayList<String>();
        armas_paladino.add("Adaga");
        armas_paladino.add("Arco");
    }

    public void armasParaOrc(){
        ArrayList<String> armas_orc = new ArrayList<String>();
        armas_orc.add("Clava");
        armas_orc.add("Escudo");
    }

    public void armasParaEspadachim(){
        ArrayList<String> armas_espadachim = new ArrayList<String>();
        armas_espadachim.add("Espada Grande");
        armas_espadachim.add("Espada Pequena");
    }
}
