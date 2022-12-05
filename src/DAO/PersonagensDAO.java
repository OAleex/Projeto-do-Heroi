package DAO;

import java.util.HashMap;

public  class PersonagensDAO implements Ipersonagem {

    public HashMap<String, String> Historia = new HashMap<>();

    public PersonagensDAO(){}


    @Override
    public void addHistoria(String Personagem, String Historiaperson) {
        Historia.put(Personagem , Historiaperson);
    }

    @Override
    public void buscarHistoria(String Historiaperson) {
        System.out.println(Historia.get(Historiaperson));
    }
}
