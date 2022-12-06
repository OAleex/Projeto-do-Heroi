package Vilao.Poderes;


import Vilao.Model.IPoder;

public class Fogo implements IPoder {
    @Override
    public String lutaCom() {
        return "fogo";
    }

    public String toString(){
        return lutaCom();
    }
}
