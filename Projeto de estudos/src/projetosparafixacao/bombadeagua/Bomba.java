package projetosparafixacao.bombadeagua;

public class Bomba {
    
    private boolean status;
    public boolean getStatus() {
        return status;
    }
    
    public void ligar() {
        status = true;
        System.out.println("Bomba ligada");
        
        try {
            Thread.sleep(8000);
        }catch (InterruptedException e) {
           System.out.println("Erro no tempo");
        } 
        desligar();
    }
    
    public void desligar() {
        status = false;
        System.out.println("Bomba desligada");
    }
}