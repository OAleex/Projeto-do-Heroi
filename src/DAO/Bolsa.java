package Dao;

import Interfaces.IBolsa;

import java.util.ArrayList;

public class Bolsa implements IBolsa {

    ArrayList<Object> armazemItem;

    public Bolsa(){
        armazemItem = new ArrayList<>();
    }

    @Override
    public void adicionarItem(Object item) {
        listarItensDaBolsa.add(item);
    }

    @Override
    public void buscarItem(Object personagem) {
        System.out.println(listarItensDaBolsa.get(0));
    }

    @Override
    public void removerItem(Object personagem) {
        listarItensDaBolsa.remove(personagem);
    }
}
