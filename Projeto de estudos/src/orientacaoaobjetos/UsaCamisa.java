package orientacaoaobjetos;

public class UsaCamisa {
    public static void main(String[] args) {
        
        Camisa camisa = new Camisa();
        System.out.println(camisa.getClass());
        System.out.println(camisa.getClass().getSimpleName());
        System.out.println(camisa.hashCode());        
    }
    
}


/*  cria um objeto apartir da classe camisa
    usa getClass Object que expoe na tela o pacote e nome da classe
    getSimpleName retorna apenas o nome da classe
    getHashCode retorna o numero para cada objeto, metodo usado para agilizar armazenamento e recuperaçao   de estruturas de dados complexas"ainda nao estudadas".
*/