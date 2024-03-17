import java.util.Random;

public class Suporte extends Heroina {
    // Construtor
    public Suporte(String nome, int vida, int mp, String arma, int nivel, int forca) {
        super(nome, vida, mp, arma, nivel, forca);
    }

    // Sobrescrição do método para exibir status
    @Override
    public void mostraStatus() {
        super.mostraStatus();
    }

    // Sobrescrição do método para calcular dano
    @Override
    public int calculaDano() {
        Random gerador = new Random();
        int dado20faces = 1 + gerador.nextInt(19);
        int dano = getForca() + dado20faces;
        return dano;
    }
}