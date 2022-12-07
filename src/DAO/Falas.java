package Dao;

import Interfaces.IFalas;

import java.util.HashMap;

public class Falas implements IFalas {

    HashMap<Object, Object> falasDoPersonagemDAO = new HashMap<>();

    @Override
    public void adicionarFala(String personagem, String fala) {
        falasDoPersonagemDAO.put(personagem, fala);
    }

    @Override
    public void buscarFala(String localizarFala) {
        System.out.println(falasDoPersonagemDAO.get(localizarFala));
    }

    @Override
    public void removerFalaPorNome(String personagem) {
        falasDoPersonagemDAO.remove(personagem);
    }
}
