package Model;

import Interfaces.IUsarFerramenta;

public class Heroi extends Personagem implements IUsarFerramenta {

    private IUsarFerramenta usar;

    String reputacaoDeHeroi;

    public Heroi(String nome,String reputacaoDeHeroi, int nivelDeVida, int nivelDeforca, IUsarFerramenta usarFerramenta) {
        super(nome, nivelDeVida, nivelDeforca);
        this.reputacaoDeHeroi =  reputacaoDeHeroi;
        this.usar = usarFerramenta;
    }




    @Override
    public void usarFerramenta() {
        this.usar.usarFerramenta();
    }


    @Override
    public String toString() {
        return "Sobre o heroi:\n" +
                "Nome: " + nome + "\n" +
                "Reputacao de heroi: " + reputacaoDeHeroi + "\n" +
                "Nivel de vida: " + nivelDeVida + "\n" +
                "Nivel de Forca: " + nivelDeforca + "\n";
    }
}