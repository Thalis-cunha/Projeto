package metodos;

import javax.swing.JOptionPane;

public class ToUpperEToLowerCase {
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        
        JOptionPane.showMessageDialog(null, "Frase: " + frase
            + "\nTodas em Maiusculas: " + frase.toUpperCase()
            + "\nTodas em Minusculas: " + frase.toLowerCase());
        
        System.exit(0);
        
    }
    
}

// toUper é usado para transofrmar todas as letras da string em maiusculas e o toLower em minusculas.