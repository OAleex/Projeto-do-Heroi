package Main;

import Dao.Falas;
import Model.Corda;
import Model.Heroi;
import Model.Picareta;

public class Main {

    public static void main(String[] args) {
//        Falas falas = new Falas();
//        falas.adicionarFala("Alex Kid", "Vamos viajar!");
////        falas.removerFalaPorNome("Alex Kid");
//        falas.buscarFala("Alex Kid");

        Corda corda = new Corda();
        Picareta picareta = new Picareta();
        Heroi heroi = new Heroi("vilaoo","Exelente", 10, 6, picareta);
        heroi.usarFerramenta();
        System.out.println(heroi);
    }

}
