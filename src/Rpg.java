public class Rpg {
    public static void main(String[] args) throws Exception {
       
        // Cria um objeto Heroina chamado heroi
        Heroina heroi = new Heroina("Lyra", 100, 50, "Masamune", 5, 17);
        
        // Exibe o status do Herói
        heroi.mostraStatus();
        
        // Realiza um ataque do Herói contra um alvo ("Morgrath") usando uma habilidade vazia ("")
        heroi.atacar("Morgrath", "");

        // Cria um objeto Mago chamado mago
        Mago mago = new Mago("José", 120, 80, "Cajado Mágico", 10, 25);
        
        // Exibe o status do Mago
        mago.mostraStatus();
        
        // Realiza um ataque do Mago contra um alvo ("Inimigo") usando uma habilidade ("Bola de Fogo")
        mago.atacar("Inimigo", "Bola de Fogo");

        // Cria um objeto Arqueira chamado arqueira
        Arqueira arqueira = new Arqueira("Jena", 90, 20, "Arco simples", 8, 45);
        
        // Exibe o status da Arqueira
        arqueira.mostraStatus();
        
        // Realiza um ataque da Arqueira contra um alvo ("Inimigo") usando uma habilidade vazia ("")
        arqueira.atacar("Inimigo", "");

        // Cria um objeto Suporte chamado suporte
        Suporte suporte = new Suporte("Ciel", 50, 180, "Bastão de cura", 13, 7);
        
        // Exibe o status do Suporte
        suporte.mostraStatus();
        
        // Realiza um ataque do Suporte contra um alvo ("Inimigo") usando uma habilidade ("Cura")
        suporte.atacar("Inimigo", "Cura");
    }
}

