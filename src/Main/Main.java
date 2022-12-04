package Main;

import Categorias.Guerreiro;
import Model.CategoriaDoPersonagem;
import java.util.InputMismatchException;
import java.util.Scanner;
import Categorias.Mago;
import Categorias.Espadachim;
import Categorias.Guerreiro;
import Categorias.Orc;
import Categorias.Paladino;


public class Main extends CategoriaDoPersonagem {


    public Main(String categoriaDoPersonagem) {
        super(categoriaDoPersonagem);
    }

    public static void main(String[] args) {


        String categoriaDoPersonagem =
                "1 - Guerreiro;\n" +
                        "2 - Magoo;\n" +
                        "3 - Paladino;\n" +
                        "4 - Orc;\n" +
                        "5 - Espadachim";
        System.out.println(categoriaDoPersonagem);
        System.out.println("Selecione uma Categoria para seu guerreiro:");

        // Tratamento de erro e Scanner

        try {
        Scanner selecionarCategoria = new Scanner(System.in);
        int selecionar = selecionarCategoria.nextInt();

            switch (selecionar) {
                case 1:
                    System.out.println("Voce selecionou o Guerreiro");
                    Guerreiro guerreiro = new Guerreiro(Guerreiro.addArma.getListaDeArmas());
                    System.out.println(guerreiro);
                    break;
                case 2:
                    System.out.println("Voce selecionou o Mago");
                    Mago mago = new Mago(Mago.addArma.getListaDeArmas());
                    System.out.println(mago);
                    break;
                case 3:
                    System.out.println("Voce selecionou o Paladino");
                    Paladino paladino = new Paladino(Paladino.addArma.getListaDeArmas());
                    System.out.println(paladino);
                    break;
                case 4:
                    System.out.println("Voce selecionou o Orc");
                    Orc orc = new Orc(Orc.addArma.getListaDeArmas());
                    System.out.println(orc);
                    break;
                case 5:
                    System.out.println("Voce selecionou o Espadachim");
                    Espadachim espadachim = new Espadachim(Espadachim.addArma.getListaDeArmas());
                    System.out.println(espadachim);
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Nao pode digitar Strings");
        }
    }
}