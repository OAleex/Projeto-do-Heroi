package Model;

import Interfaces.IUsarFerramenta;

public class Vilao extends Personagem {

    int nivelDePoder;

    public Vilao(String nome, int nivelDeVida, int nivelDeforca, int nivelDePoder) {
        super(nome, nivelDeVida, nivelDeforca);
        this.nivelDePoder = nivelDePoder;
    }


    @Override
    public String toString() {
        return  "Sobre o Vilão:\n" +
                "Nome: " + nome + "\n" +
                "Nivel de poder: " + nivelDePoder + "\n" +
                "Nivel de vida: " + nivelDeVida + "\n" +
                "Nivel de forca: " + nivelDeforca + "\n";
    }
}
