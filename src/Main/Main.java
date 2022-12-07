package Main;

import Dao.Bolsa;
import Dao.Falas;
import Interfaces.IUsarFerramenta;
import Model.Corda;
import Model.Heroi;
import Model.Picareta;
import Model.Vilao;

public class Main {

    // Os codigos em comentarios, sao possiveis comandos a serem utilizados para
    // manipulação.

    public static void main(String[] args) {

        // Ferramentas e Heroi
        Corda corda = new Corda();
        Picareta picareta = new Picareta();
        Heroi heroi = new Heroi("Alex Kidd",150, 250, picareta);
        System.out.println(heroi);
        heroi.usarFerramenta();

        // Falas
        Falas falas = new Falas();
        falas.adicionarFala("Alex Kidd", "Vamos nessa!");
        falas.removerFalaPorNome("Alex Kidd");
        falas.buscarFala("Alex Kidd");

        // Bolsa de itens
        System.out.println("\nInventario do Heroi:");
        Bolsa bolsa = new Bolsa();
        bolsa.adicionarItem("Pocao de MP");
        bolsa.adicionarItem("Pocao de HP");
//        bolsa.buscarItemPelaPosicao(0);
        bolsa.listarTodosOsItens();
//        bolsa.removerItem(0);

        // Vilao
        Vilao vilao = new Vilao("Lord Farquaad", 300, 500, 550);
        System.out.println(vilao);
        System.out.println("Apos conseguir vencer a batalha ardua contra o " + vilao.getNome() +
                ", o mundo foi sao e salvo.");
    }
}
