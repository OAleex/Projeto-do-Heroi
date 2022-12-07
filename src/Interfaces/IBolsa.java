package Interfaces;

import java.util.ArrayList;


public interface IBolsa {

    ArrayList<Object> listarItensDaBolsa = new ArrayList<>();

    public void adicionarItem(Object item);
    public void buscarItemPelaPosicao(int index);
    public boolean removerItem(int item);
    public void listarTodosOsItens();


}
