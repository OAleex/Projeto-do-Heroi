package Main;

import Model.CategoriaDoPersonagem;
import java.util.InputMismatchException;
import java.util.Scanner;
import Categorias.Mago;



public class Main extends CategoriaDoPersonagem {


    public Main(String categoriaDoPersonagem) {
        super(categoriaDoPersonagem);
    }

    public static void main(String[] args) {


        CategoriaDoPersonagem categoriaDoPersonagem = new CategoriaDoPersonagem(
                "1 - Guerreiro;\n" +
                        "2 - Mago;\n" +
                        "3 - Paladino;\n" +
                        "4 - Orque;\n" +
                        "5 - Espadachim");
        System.out.println(categoriaDoPersonagem.getCategoriaDoPersonagem());
        System.out.println("Selecione uma Categoria para seu guerreiro:");

        // Tratamento de erro e Scanner

        try {
        Scanner selecionarCategoria = new Scanner(System.in);
        int selecionar = selecionarCategoria.nextInt();

            switch (selecionar) {
                case 1:
                    System.out.println("Você selecionou o Guerreiro");
                    break;
                case 2:
                    System.out.println("Você selecionou o Mago");
                    Mago mago = new Mago(Mago.addArma.getListaDeArmas());
                    System.out.println(mago);
                    break;
                case 3:
                    System.out.println("Você selecionou o Paladino");
                    break;
                case 4:
                    System.out.println("Você selecionou o Orc");
                    break;
                case 5:
                    System.out.println("Você selecionou o Espacim");
                    break;
                default:
                    System.out.println("Não existe esta opcao aqui, parceiro.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Nao pode digitar Strings");
        }
    }
}