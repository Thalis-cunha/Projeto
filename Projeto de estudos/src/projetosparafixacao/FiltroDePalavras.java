package projetosparafixacao;

import javax.swing.JOptionPane;


public class FiltroDePalavras {
    public static void main(String[] args) {
        
        String[] palavrasProibidas = {
            "idiota", "burro"
        };
        
        String textoUsuario = JOptionPane.showInputDialog(null, 
                "Digite uma frase", "Entrada e texto",
                JOptionPane.QUESTION_MESSAGE
        );
        
        if(textoUsuario == null){
            JOptionPane.showMessageDialog(null, "Cancelado");
            return;            
        }
        
        
        if (contemPalavrasProibidas(textoUsuario, palavrasProibidas)) {
            JOptionPane.showMessageDialog(null, 
                    "texto bloqueado! Contem palavras improprias.",
                    "Bloqueado",
                    JOptionPane.ERROR_MESSAGE
            );            
        }else {
            JOptionPane.showMessageDialog(null,
                    "Texto permitido: \n" + textoUsuario,
                    "aprovado", 
                    JOptionPane.INFORMATION_MESSAGE
            );           
        }
    }
    

public static boolean contemPalavrasProibidas(String texto, String[] proibidas) {
    
    texto = texto.toLowerCase();
    
    for (String palavra : proibidas) {
        
        if(texto.contains(palavra.toLowerCase())) {
            return true;
        }
    }
    return false;
    
    }
}