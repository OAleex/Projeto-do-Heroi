package Interfaces;

import java.util.ArrayList;


public interface IBolsa {

    ArrayList<Object> listarItensDaBolsa = new ArrayList<>();

    public void adicionarItem(Object item);
    public void buscarItem(Object item);
    public void removerItem(Object item);


}
