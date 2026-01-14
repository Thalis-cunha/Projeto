package orientacaoaobjetos.classeabstratasecomcretas;

public abstract class Veiculo {
    public int Velocidade;
    public boolean status;
    public void ligar() {
        status = true;
        
    }
    public void desligar() {
        status = false;
        
    }
    public void mostrarStatus() {
        System.out.println(status);
        
    }
    public abstract void acelerar();
}
