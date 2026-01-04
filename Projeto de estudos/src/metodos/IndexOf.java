package metodos;

import javax.swing.JOptionPane;

public class IndexOf {
    public static void main(String[] args) {
        
        String frase = "Livro Java - Ensino didatico";
        char caractere = '1';
        
        JOptionPane.showMessageDialog(null, "Frase: " + frase
            +"\nIndices: " + frase.indexOf(caractere)
            +"' " + frase.indexOf("Ensino")
            +"' " + frase.indexOf("Java", 15)
        );
        System.exit(0);
        
    }
    
}

//busca caracteres em uma String