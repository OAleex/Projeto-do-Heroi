package Model;

public class Personagem {

    String nome;
    int nivelDeVida;
    int nivelDeforca;

    public Personagem(String nome, int nivelDeVida, int nivelDeforca) {
        this.nome = nome;
        this.nivelDeVida = nivelDeVida;
        this.nivelDeforca = nivelDeforca;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Sobre o personagem:\n" +
                "Nome: " + nome + "\n" +
                "Vida: " + nivelDeVida + "\n" +
                "Nivel de forca : " + nivelDeforca + "\n";
    }
}
