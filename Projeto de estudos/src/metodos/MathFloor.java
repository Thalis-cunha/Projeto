package metodos;

import javax.swing.JOptionPane;

public class MathFloor {
    public static void main(String[] args) {
        
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota da prova?")
        );
        
        JOptionPane.showMessageDialog(null, "Nota original: " + nota +
                "\nAredondada para baixo: " + Math.floor(nota)
        );
        System.exit(0);        
    }
    
}

//aredondamento de numeros para baixo