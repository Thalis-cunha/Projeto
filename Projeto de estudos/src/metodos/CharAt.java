package metodos;

import javax.swing.JOptionPane;

public class CharAt {
    public static void main(String[] args) {
        
        String palavra = JOptionPane.showInputDialog("Forneça uma " + "palavra com pelo menos 6 letras");
        
        JOptionPane.showMessageDialog(null, "Palavra: " + palavra
            +"\nCaractere 1: " + palavra.charAt (0)            
            +"\nCaractere 2: " + palavra.charAt (1)            
            +"\nCaractere 3: " + palavra.charAt (2)
            +"\nCaractere 4: " + palavra.charAt (3)
            +"\nCaractere 5: " + palavra.charAt (4)
            +"\nCaractere 6: " + palavra.charAt (5)
        );
        System.exit(0);
    }
    
}
