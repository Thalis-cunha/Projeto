package orientacaoaobjetos;

public class UsaTelevisor {
    public static void main(String[] args) {
        
        Televisor tv = new Televisor();
        tv.canal = 150;
        tv.volume = 3;
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.trocarCanal(10);
        tv.mostrar();
    }
    
}


// exemplo possui 2 aumentar volume para aumentar de 3 para 5.