package metodos;

import javax.swing.JOptionPane;

public class Length {

    public static void main(String[] srgs) {

        String frase = JOptionPane.showInputDialog("Forneça uma frase ");
        int tamanho = frase.length();

        JOptionPane.showMessageDialog(null, "Frase: " + frase
                + "\nQuantidade de Caracteres:" + tamanho);
        System.exit(0);
    }

}
