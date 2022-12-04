package Model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {


    private List<String> listaDeArmas = new ArrayList<>();

    public Inventario(List<String> listaDeArmas) {
        this.listaDeArmas = listaDeArmas;
    }

    public List<String> getListaDeArmas() {
        return listaDeArmas;
    }

    public void setListaDeArmas(List<String> listaDeArmas) {
        this.listaDeArmas = listaDeArmas;
    }


    public String toString() {
        return "Suas armas:\n" + listaDeArmas;
    }
}


