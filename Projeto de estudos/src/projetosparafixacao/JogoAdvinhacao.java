package projetosparafixacao;

import java.util.Random;
import javax.swing.JOptionPane;


public class JogoAdvinhacao {
    public static void main(String[] args) {
        
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        int chute = 0;
        
        
        while (chute != numeroSecreto) {
            
            String entrada = JOptionPane.showInputDialog(null, 
                    "Advinhe um numero de 1 a 100:",
                    "Jogo de Advinhaçao",
                    JOptionPane.QUESTION_MESSAGE
            );
            
            
            if (entrada == null || entrada.isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "Operaçao cancelada");
                return;               
            }
            
            chute = Integer.parseInt(entrada);
            tentativa++;
            
            
            if (chute < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "O numero é maior");               
                
            }else if (chute  > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "O numero é menor");
                
            }else {
                JOptionPane.showMessageDialog(null, "Parabens voce acertou!\nEm " + tentativa + " tentativas."
                
                );
            }
        }
        
    }
}

//programa esta sem validaçao de caracteres de entrada pois sera refeito novamente, e melhorado outro dia.