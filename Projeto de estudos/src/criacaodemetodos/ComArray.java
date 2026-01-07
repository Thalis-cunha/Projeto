package criacaodemetodos;

import java.util.*;

public class ComArray { 
    public static double buscarMaior(double[] numeros) {
        double maior = numeros[0];
        for (int i= 1; i < numeros.length; i++) {
            maior = Math.max(maior, numeros[i]);
        }
        return maior;
    }
    
    public static String[] ordenarPalavras(String[] palavras) {
        Arrays.sort(palavras);
        return palavras;
    }
    
}


//metodos para manipular Arrays