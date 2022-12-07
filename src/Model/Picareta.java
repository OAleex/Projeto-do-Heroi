package Model;

import Interfaces.IUsarFerramenta;

public class Picareta implements IUsarFerramenta {
    @Override
    public void usarFerramenta() {
        System.out.println("Usou a Picareta.");
    }
}
