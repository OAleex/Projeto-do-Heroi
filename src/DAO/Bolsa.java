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
        System.out.println(listarItensDaBolsa.get(index));
    }


    public void listarTodosOsItens() {
        for (int i = 0; i < listarItensDaBolsa.size(); i++) {
            System.out.println(listarItensDaBolsa.get(i));
        }
    }
    @Override
    public boolean removerItem(int item) {
        if (listarItensDaBolsa.remove(item) != null) {
            System.out.println("O item da posicao: " + item + " foi removido.");
            return true;
        }
        return false;
    }
}