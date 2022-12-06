package Vilao.Model;

public class Lord {
    String nome;
    String poderes;
    String vitalidade;
    String armas;

    private final IPoder poder;


    public Lord(IPoder ferramenta) {
        this.poder = ferramenta;
    }

    @Override
    public String toString() {
        return "Contra esse personagem o grande Lord usa o poder de " +
                poder;
    }
}
