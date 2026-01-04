package metodos;

import javax.swing.JOptionPane;

public class Trim {
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        frase = "   " + frase + "   ";
        
        JOptionPane.showMessageDialog(null,
                "\nFrase com espaços: " + frase + "-"
               +"\nFrase sem espaços: " + "-" + frase.trim() + "-"
                
        );System.exit(0);
        
    }
     
}

//esse metodo remove todos os espacos em branco que aparecem noinicio e nofim da frase.
