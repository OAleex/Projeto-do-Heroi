package Model;

import Dao.Bolsa;
import Interfaces.IUsarFerramenta;

public class Heroi extends Personagem implements IUsarFerramenta {

    private IUsarFerramenta usar;


    public Heroi(String nome, int nivelDeVida, int nivelDeforca, IUsarFerramenta usarFerramenta) {
        super(nome, nivelDeVida, nivelDeforca);
        this.usar = usarFerramenta;
    }



    public void atualizarFerramenta(IUsarFerramenta usarFerramenta){
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
                "Nivel de vida: " + nivelDeVida + "\n" +
                "Nivel de forca: " + nivelDeforca + "\n";
    }
}