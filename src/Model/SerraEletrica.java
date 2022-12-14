package Model;

import Interfaces.IUsarFerramenta;

public class SerraEletrica implements IUsarFerramenta {

    public SerraEletrica(){

    }

    public void usarFerramenta(){
        System.out.println("Usou a serra eletrica");
    }

}
