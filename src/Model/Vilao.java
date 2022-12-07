package Model;

import Interfaces.IUsarFerramenta;

public class Vilao extends Personagem {


    public Vilao(String nome, int nivelDeVida, int nivelDeforca) {
        super(nome, nivelDeVida, nivelDeforca);
    }



    @Override
    public String toString() {
        return  "\nSobre o Vilao:\n" +
                "Nome: " + nome + "\n" +
                "Nivel de vida: " + nivelDeVida + "\n" +
                "Nivel de forca: " + nivelDeforca + "\n";
    }
}
