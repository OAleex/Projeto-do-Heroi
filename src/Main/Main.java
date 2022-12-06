package Main;

import Categorias.Guerreiro;
import ContemplacaoDaHistoria.*;
import DAO.PersonagensDAO;
import Model.CategoriaDoPersonagem;
import java.util.InputMismatchException;
import java.util.Scanner;
import Categorias.Mago;
import Categorias.Espadachim;
import Categorias.Orc;
import Categorias.Paladino;



public class Main extends CategoriaDoPersonagem { //implements Ataques {

    public Main(String categoriaDoPersonagem) {
        super(categoriaDoPersonagem);
    }

    public static void main(String[] args) {

        PersonagensDAO personagensDAO = new PersonagensDAO();

        personagensDAO.addFala("Guerreiro", "'Vamos a luta!'\n");
        personagensDAO.addFala("Mago", "'Esta preparado?'\n");
        personagensDAO.addFala("Paladino", "'Eu cubro a area.'\n");
        personagensDAO.addFala("Orc", "'Eu fico de guarda.'\n");
        personagensDAO.addFala("Espadachim", "'Eu fico na frente.'\n");


        String categoriaDoPersonagem =
                "1 - Guerreiro;\n" +
                        "2 - Mago;\n" +
                        "3 - Paladino;\n" +
                        "4 - Orc;\n" +
                        "5 - Espadachim";
        System.out.println(categoriaDoPersonagem);
        System.out.println("Selecione uma Categoria para seu guerreiro:");

        // Tratamento de erro e Scanner

        int opcao = 0;
        try {

            opcao = 0;

            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {

                Scanner selecionarCategoria = new Scanner(System.in);
                opcao = selecionarCategoria.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Voce selecionou o Guerreiro");
                        Guerreiro guerreiro = new Guerreiro(Guerreiro.addArma);
                        System.out.println(guerreiro);
                        guerreiro.ataqueDoPersonagem();
                        personagensDAO.buscarFala("Guerreiro");
                        ContGuerreiro contguerreiro = new ContGuerreiro();
                        contguerreiro.ContemplarGuerreiro();
                        break;
                    case 2:
                        System.out.println("Voce selecionou o Mago");
                        Mago mago = new Mago(Mago.addArma);
                        System.out.println(mago);
                        mago.ataqueDoPersonagem();
                        personagensDAO.buscarFala("Mago");
                        ContMago contmago = new ContMago();
                        contmago.ContemplarMago();
                        break;
                    case 3:
                        System.out.println("Voce selecionou o Paladino");
                        Paladino paladino = new Paladino(Paladino.addArma);
                        System.out.println(paladino);
                        paladino.ataqueDoPersonagem();
                        personagensDAO.buscarFala("Paladino");
                        ContPaladino contpaladino = new ContPaladino();
                        contpaladino.ContemplarPaladino();
                        break;
                    case 4:
                        System.out.println("Voce selecionou o Orc");
                        Orc orc = new Orc(Orc.addArma);
                        System.out.println(orc);
                        orc.ataqueDoPersonagem();
                        personagensDAO.buscarFala("Orc");
                        ContOrc contorc = new ContOrc();
                        contorc.ContemplarOrc();
                        break;
                    case 5:
                        System.out.println("Voce selecionou o Espadachim");
                        Espadachim espadachim = new Espadachim(Espadachim.addArma);
                        System.out.println(espadachim);
                        espadachim.ataqueDoPersonagem();
                        personagensDAO.buscarFala("Espadachim");
                        // ending
                        ContEspadachim contespadachim = new ContEspadachim();
                        contespadachim.ContemplarEspadachim();
                        break;
                    default:
                        System.out.println("Opcao invalida.\nSelecione uma Categoria para seu guerreiro:");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas numeros.\nPrograma encerrado, abra novamente.");
        }
    }
}