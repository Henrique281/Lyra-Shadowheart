import java.util.Random;

public class Heroina {
    // Atributos encapsulados
    private String nome;
    private int vida;
    private int mp;
    private String arma;
    private int nivel;
    private int forca;

    // Construtor
    public Heroina(String nome, int vida, int mp, String arma, int nivel, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.mp = mp;
        this.arma = arma;
        this.nivel = nivel;
        this.forca = forca;
    }

    // Métodos getters para acessar os atributos encapsulados
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getMp() {
        return mp;
    }

    public String getArma() {
        return arma;
    }

    public int getNivel() {
        return nivel;
    }

    public int getForca() {
        return forca;
    }

    // Método para exibir o status do personagem
    public void mostraStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("MP: " + mp);
        System.out.println("Arma: " + arma);
        System.out.println("Nível: " + nivel);
        System.out.println("Força: " + forca);
    }

    // Método para calcular o dano causado pelo personagem
    public int calculaDano() {
        Random gerador = new Random();
        int dado20faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20faces;
        return dano;
    }

    // Método para realizar um ataque
    public void atacar(String alvo, String habilidade) {
        int danoCausado = calculaDano();
        if (habilidade.length() == 0) {
            System.out.format("%s infligiu (%d de dano) no %s!!!\n", nome, danoCausado, alvo);
            System.out.println("\n ");
        } else {
            System.out.format("%s usou o %s contra %s!!!\n\n", nome, habilidade, alvo);
        }
    }
}