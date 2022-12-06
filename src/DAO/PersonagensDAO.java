package DAO;

import java.util.HashMap;

public  class PersonagensDAO implements IPersonagem {

    public HashMap<String, String> falaDescrita = new HashMap<>();

    public PersonagensDAO(){}


    @Override
    public void addFala(String personagem, String fala) {
        falaDescrita.put(personagem , fala);
    }

    @Override
    public void buscarFala(String fala) {
        System.out.println(falaDescrita.get(fala));
    }
}
