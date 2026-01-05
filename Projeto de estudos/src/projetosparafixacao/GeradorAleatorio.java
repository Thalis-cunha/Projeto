package projetosparafixacao;

import java.util.Random;
import javax.swing.JOptionPane;

public class GeradorAleatorio {
    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog(null, "Quantos numeros deseja",
                "Entrada de numero",
                JOptionPane.QUESTION_MESSAGE
        );
        
              
    if (entrada == null) {
        JOptionPane.showMessageDialog(null, "Operaçao cancelada");
        return;     
        }
    
    
    int quantidade = Integer.parseInt(entrada);
    Random random = new Random();
    String resultado = "";
    
    
    for (int i = 0; i < quantidade; i++) {
     
        int numeroSAleatorios = random.nextInt(10);
        resultado += numeroSAleatorios;
    }
    
    
    JOptionPane.showMessageDialog(null, 
            "Numeros gerados: \n" + resultado, "Resultado",
            JOptionPane.INFORMATION_MESSAGE
        );
    
    }
}