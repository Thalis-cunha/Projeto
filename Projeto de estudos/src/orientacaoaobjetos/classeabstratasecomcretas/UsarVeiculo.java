package orientacaoaobjetos.classeabstratasecomcretas;

public class UsarVeiculo {
    public static void main(String[] args) {
        
        Automovel automovel = new Automovel();
        automovel.ligar();
        automovel.acelerar();
        System.out.println(automovel.Velocidade);
        automovel.desligar();
        
        Aviao aviao= new Aviao();
        aviao.ligar();
        aviao.acelerar();
        System.out.println(aviao.Velocidade);
        aviao.desligar();
    }
    
}
