package Main;

import Dao.Falas;

public class Main {

    public static void main(String[] args) {
        Falas falas = new Falas();
        falas.adicionarFala("Alex Kid", "Vamos viajar!");
//        falas.removerFalaPorNome("Alex Kid");
        falas.buscarFala("Alex Kid");
    }

}
