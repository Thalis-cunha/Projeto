package arrays;

import javax.swing.JOptionPane;

public class BuscaEmArrays {
    public static void main(String[] args) {
        String[] cores = { "verde", "amarelo", "azul", "vermeho", "preto"};
        String cor = JOptionPane.showInputDialog("Forneça uma cor");
        String mensagem = "Cor nao encontrada";
        
        for (String elemento: cores) {
            if (elemento.equals(cor)) {
                mensagem = "Cor encontrada";
            }            
        }
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
    
}
