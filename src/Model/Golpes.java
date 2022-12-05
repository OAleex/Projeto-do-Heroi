package Model;

import Interface.IAtaques;

public class Golpes implements IAtaques {

    @Override
    public String ataqueNormal() {
        return "Voce utilizou o ataque normal";
    }

    @Override
    public String ataqueCritico() {
        return "Voce usou o golpe critico";
    }

    @Override
    public String especial() {
        return "Voce usou o golpe especial";
    }
}
