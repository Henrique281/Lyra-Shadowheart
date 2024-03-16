public class Rpg {
    public static void main(String[] args) throws Exception {
       
        // Cria um objeto Personagem chamado Heroi
        Personagem heroi = new Personagem(null, 0, 0, null, 0, 0);
        
        // Define os atributos do Herói
        heroi.nome = "Lyra";
        heroi.vida = 100;
        heroi.mp = 50;
        heroi.arma = "Masamune";
        heroi.nivel = 5;
        heroi.forca = 17;

        // Exibe o status do Herói
        heroi.mostraStatus();
        
        // Realiza um ataque do Herói contra um alvo ("Morgrath") usando uma habilidade vazia ("")
        heroi.atacar("Morgrath", "");

        // Cria um objeto Mago chamado mago
        Mago mago = new Mago("Merlin", 120, 80, "Cajado Mágico", 10, 25);
        
        // Exibe o status do Mago
        mago.mostraStatus();
        
        // Realiza um ataque do Mago contra um alvo ("Inimigo") usando uma habilidade ("Bola de Fogo")
        mago.atacar("Inimigo", "Bola de Fogo");

        //criar outro personagens e inimigos
    }
}
