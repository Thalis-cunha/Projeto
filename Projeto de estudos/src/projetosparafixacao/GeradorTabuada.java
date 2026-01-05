package projetosparafixacao;

import javax.swing.JOptionPane;


public class GeradorTabuada {
    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog(null, 
                "Insira o numero da tabuada que deseja", 
                "tabuada",
                JOptionPane.QUESTION_MESSAGE
        );
        
        
        if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Operaçao cancelada"
            );
            return;    
        }
        
        int numero = Integer.parseInt(entrada);
        String resultado = gerarTabuada(numero);        
        
        
        
        JOptionPane.showMessageDialog(null, resultado, "Resultado",
                JOptionPane.INFORMATION_MESSAGE
        );
    } 
    
   
public static String gerarTabuada(int numero) {   
        
        String resultado = "";
        
        for (int i= 1; i <=10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
            
        }
        return resultado;
    }
}