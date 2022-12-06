package DAO;

import java.util.HashMap;

public  class PersonagensDAO implements IPersonagem {

    public HashMap<String, String> Historia = new HashMap<>();

    public PersonagensDAO(){}


    @Override
    public void addFala(String personagem, String fala) {
        Historia.put(personagem , fala);
    }

    @Override
    public void buscarFala(String fala) {
        System.out.println(Historia.get(fala));
    }
}
