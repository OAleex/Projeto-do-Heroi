package Model;

import Interfaces.IUsarFerramenta;

public class Heroi extends Personagem implements IUsarFerramenta {

    private IUsarFerramenta usar;

    String reputacaoDeHeroi;

    public Heroi(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    public String getReputacaoDeHeroi() {
        return reputacaoDeHeroi;
    }

    public void setReputacaoDeHeroi(String reputacaoDeHeroi) {
        this.reputacaoDeHeroi = reputacaoDeHeroi;
    }
    @Override
    public void usarFerramenta() {
        this.usar.usarFerramenta();
    }


    @Override
    public String toString() {
        return "Sobre o Heroi:" +
                "ReputacaoDeHeroi: " + reputacaoDeHeroi + '\'' +
                "Nome: '" + nome + '\'' +
                "Nivel de vida: " + nivelDeVida +
                "Nivel de Forca: " + nivelDeforca +
                '}';
    }
}