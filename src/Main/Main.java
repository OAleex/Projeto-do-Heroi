package Main;

import Categorias.Guerreiro;
import DAO.PersonagensDAO;
import Interface.Ataques;
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

        personagensDAO.addHistoria(
                "Mago" , "Vivia em uma família nobre composta por \n" +
                "magos da cidade de Santë'Soul.\n" +
                "Seu avô era o mago mais experiente e respeitado entre todos os magos \n" +
                "daquele local. No aniversário de 14 anos de Soulker,\n" +
                "seu avô o presentou com um anel que seria capaz de armazenar imagens\n" +
                "e facilitariam o aprendizado de Soulker, em seguida, \n" +
                "o avô o mandou para a Escola de Magos em Inedrau, onde\n" +
                "Saint Soulker vive até hoje aprimorando suas habilidades de\n" +
                "invocação.\n");

        personagensDAO.addHistoria(
                "Guerreiro", "Pettros nasceu em uma família burguesa,\n" +
                        "comerciantes nas terras de Heros. Sua vida era feliz e próspera \n" +
                        "até que aos 26 anos, sua cidade foi atacada pelo exército do \n" +
                        "Demônio Ancião (Antiga lenda que relata a existência de um demônio\n " +
                        "capaz de reunir forças para dominar todos os povos existentes e \n" +
                        "exercer total poder sobre todas as coisas) e Pettros perdeu quase \n" +
                        "tudo. Sua família, amigos e todos os conhecidos morreram, ele só\n" +
                        "sobreviveu pois estava na floresta caçando quando ouviu a confusão,\n" +
                        "ao voltar para o reino, se deparou com a cena e decidiu procurar \n" +
                        "pais, porém, ao encontrar todos mortos e os guardas sendo derrotados\n" +
                        "Pettros arrumou o máximo de suprimentos que pôde e fugiu.\n ");

        personagensDAO.addHistoria("Paladino" ,"Drake nasceu na vila de Tornin e \n" +
                "foi criado por uma família de camponeses até os 16 anos. Com 17,\n" +
                "decidiu tomar o próprio rumo e comprou uma pequena casa de madeira \n" +
                "nas proximidades da vila, desde então, Drake trabalhou como caçador e\n " +
                "sempre mostrou ser o melhor da região, seus produtos eram os melhores e\n" +
                "conhecidos por todo o continente de Enton. Certo dia, Drake vagava pela \n" +
                "floresta quando viu um homem esquisito se alimentando do corpo de um cavalo,\n " +
                "o homem se virou para Drake, fez um corte em seu pescoço, e fugiu. De repente,\n" +
                "Drake começou a utilizar sua pequena adaga com um nível de precisão extremamente\n" +
                "alto." );


        String categoriaDoPersonagem =
                "1 - Guerreiro;\n" +
                        "2 - Mago;\n" +
                        "3 - Paladino;\n" +
                        "4 - Orc;\n" +
                        "5 - Espadachim";
        System.out.println(categoriaDoPersonagem);
        System.out.println("Selecione uma Categoria para seu guerreiro:");

        // Tratamento de erro e Scanner

        try {

            int opcao = 0;

            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {

                Scanner selecionarCategoria = new Scanner(System.in);
                opcao = selecionarCategoria.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Voce selecionou o Guerreiro");
                        Guerreiro guerreiro = new Guerreiro(Guerreiro.addArma);
                        System.out.println(guerreiro);
                        guerreiro.ataqueDoPersonagem();
                        personagensDAO.buscarHistoria("Guerreiro");
                        break;
                    case 2:
                        System.out.println("Voce selecionou o Mago");
                        Mago mago = new Mago(Mago.addArma);
                        System.out.println(mago);
                        mago.ataqueDoPersonagem();
                        personagensDAO.buscarHistoria("Mago");
                        break;
                    case 3:
                        System.out.println("Voce selecionou o Paladino");
                        Paladino paladino = new Paladino(Paladino.addArma);
                        System.out.println(paladino);
                        paladino.ataqueDoPersonagem();
                        personagensDAO.buscarHistoria("Paladino");
                        break;
                    case 4:
                        System.out.println("Voce selecionou o Orc");
                        Orc orc = new Orc(Orc.addArma);
                        System.out.println(orc);
                        orc.ataqueDoPersonagem();
                        break;
                    case 5:
                        System.out.println("Voce selecionou o Espadachim");
                        Espadachim espadachim = new Espadachim(Espadachim.addArma);
                        System.out.println(espadachim);
                        espadachim.ataqueDoPersonagem();
                        break;
                    default:
                        System.out.println("Opcao invalida.\nSelecione uma Categoria para seu guerreiro:");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas numeros.");
        }
    }
}

//
//    @Override
//    public void ataqueDoPersonagem() {
//
//    }
//}