import java.util.Random;

public class Suporte extends Heroina {
      public Suporte(String nome, int vida, int mp, String arma, int nivel, int força) {
        // Chamada ao construtor da superclasse Personagem
        super(nome, vida, mp, arma, nivel, força);
    }

    // Método para exibir o status do mago
    @Override
    public void mostraStatus() {
        // Acessa os atributos herdados da superclasse Personagem
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("MP: " + mp);
        System.out.println("Arma: " + arma);
        System.out.println("Nível: " + nivel);
        System.out.println("Força: " + forca);
    }

    // Método para calcular o dano causado pelo mago
    @Override
    public int calculaDano() {
        Random gerador = new Random();

        // Gera um número aleatório entre 1 e 20 (simula um dado de 20 lados)
        int dado20faces = 1 + gerador.nextInt(19);
        
        // Calcula o dano usando a força do mago e o número aleatório
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
            System.out.format("%s usou a %s em um aliado!!!\n\n", nome, habilidade);
        }
    }
}

