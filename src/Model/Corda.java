package Model;

import Interfaces.IUsarFerramenta;

public class Corda implements IUsarFerramenta {

    @Override
    public void usarFerramenta() {
        System.out.println("Usou a Corda.");
    }
}
