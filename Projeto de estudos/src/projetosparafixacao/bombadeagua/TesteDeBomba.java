package projetosparafixacao.bombadeagua;

public class TesteDeBomba {
    public static void main(String[] args) {
        
        Bomba bomba = new Bomba();
        System.out.println("Status inicial: "+ bomba.getStatus());
        
        bomba.ligar();
        
        System.out.println("Status final: " + bomba.getStatus());
    }
    
}
