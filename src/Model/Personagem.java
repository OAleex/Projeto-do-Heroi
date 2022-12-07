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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnivelDeVida() {
        return nivelDeVida;
    }

    public void setnivelDeVida(int nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    public int getNivelDeVida() {
        return nivelDeVida;
    }

    public void setNivelDeVida(int nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    public int getNivelDeforca() {
        return nivelDeforca;
    }

    public void setNivelDeforca(int nivelDeforca) {
        this.nivelDeforca = nivelDeforca;
    }

    @Override
    public String toString() {
        return "Sobre o personagem:" +
                "Nome: '" + nome + '\'' +
                "Vida: " + nivelDeVida +
                "Nivel de forca: " + nivelDeforca;
    }
}
