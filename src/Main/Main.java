package Main;

import Dao.Bolsa;
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
        Heroi heroi = new Heroi("Alex Kidd","Exelente", 10, 6, picareta);
        System.out.println(heroi);
        heroi.usarFerramenta();

        Bolsa bolsa = new Bolsa();
        bolsa.adicionarItem("1");
        bolsa.adicionarItem("2");
//        bolsa.removerItem(0);
        bolsa.buscarItemPelaPosicao(0);
    }
}
