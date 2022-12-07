package Dao;

import Interfaces.IBolsa;

import java.util.ArrayList;

public class Bolsa implements IBolsa {
    ArrayList<Object> armazemItem;

    public Bolsa() {
        armazemItem = new ArrayList<>();
    }

    @Override
    public void adicionarItem(Object item) {
        listarItensDaBolsa.add(item);
    }


    public void buscarItemPelaPosicao(int index) {
        for (int i = 0; i < listarItensDaBolsa.size(); i++) {
            System.out.println(listarItensDaBolsa.get(i));
        }
    }

    @Override
    public void removerItem(int item) {
        listarItensDaBolsa.remove(item);
    }
}