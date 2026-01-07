package criacaodemetodos;

public class UsoComArray {
    public static void main(String[] args) {
        
        double[] numeros = {12.4, 3.4, 9.7, 7.3, 6.6};
        double maior = ComArray.buscarMaior(numeros);
        System.out.println(maior);
        
        String[] nomes = {"Ivone", "Lilia", "Lila", "Almira", "Bruno", "Fabio", "Rita"};
        String[] retorno = ComArray.ordenarPalavras(nomes);
        
        for (int i = 0; i < retorno.length; i++) {
            System.out.println(retorno[i]);
        }
    }
    
}

//retorna nomes por ordem alfabetica