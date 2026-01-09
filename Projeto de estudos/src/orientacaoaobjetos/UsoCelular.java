package orientacaoaobjetos;

public class UsoCelular {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
        Celular celular3 = new Celular();
        celular1.numero = "11 5432-1234";
        celular2.numero = "51 9876-5432";
        celular3.numero = "21 9012-3456";
        Celular.empresa = "Empresa Generica do Brasil";
    }
    
}
