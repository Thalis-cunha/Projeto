package projetosparafixacao;

import java.util.Random;
import javax.swing.JOptionPane;

public class Dado {
    public static void main(String[] args) {
        
        Random random = new Random();
        int soma = 0;
         String resultado = "";
        
        
        for (int i = 1; i <= 3; i++ ) {
        
        int dado = random.nextInt(6) + 1;
        
        resultado +=  i+ "° jogada: " + dado + "\n";
        
        soma += dado;       
        
    }
        resultado += "\nSoma final das jogadas= " + soma;
        JOptionPane.showMessageDialog(null, resultado);
        
    }
    
}
