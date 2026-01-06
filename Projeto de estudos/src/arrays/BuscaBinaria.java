package arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] n = new int[10000];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 1000);            
        }
        
        int valor =Integer.parseInt(JOptionPane.showInputDialog("Fornerça um numero "));
        String r ="valor nao encontrado";
        
        for (int i = 0; i < n.length; i++) {
            if (n[i] == valor) {
                r = "Valor encontrado na posiçao " + i;
                break;
            }           
        }
        System.out.println(r);
        
        Arrays.sort(n);
        int pos = Arrays.binarySearch(n, valor);
        System.out.println("Nova posiçao ordenada: " + pos);
    }
    
    
}
