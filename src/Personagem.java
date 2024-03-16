import java.util.Random;

public class Personagem {
    public String nome;
    public int vida;
    public int mp;
    public String arma;
    public int nivel;
    public int forca;

    // Construtor com argumentos
    public Personagem(String nome, int vida, int mp, String arma, int nivel, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.mp = mp;
        this.arma = arma;
        this.nivel = nivel;
        this.forca = forca;
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

        // Gera um número aleatório entre 1 e 20 (simula um dado de 20 lados)
        int dado20faces = 1 + gerador.nextInt(19);
        
        // Calcula o dano usando a força do personagem e o número aleatório
        int dano = forca + dado20faces;

        // Retorna o dano calculado
        return dano;
    }

    // Método para realizar um ataque
    public void atacar(String alvo, String habilidade) {
        // Calcula o dano usando o método calculaDano
        int danoCausado = calculaDano();

        // Verifica se uma habilidade específica é usada durante o ataque
        if (habilidade.length() == 0) {
            // Exibe o dano causado quando nenhuma habilidade específica é usada
            System.out.format("%s infligiu (%d de dano) no %s!!!\n", nome, danoCausado, alvo);
            System.out.println("\n \n");
        } else {
            // Exibe o uso de uma habilidade específica durante o ataque
            System.out.format("%s usou o %s contra %s!!!\n", nome, habilidade, alvo);
        }
    }
}
