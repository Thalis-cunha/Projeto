package projetosparafixacao;    

import javax.swing.JOptionPane;

public class MesesPT_EN {
     public static void main(String[] args) {
         
        String idiomaStr = JOptionPane.showInputDialog(
            "Escolha o idioma:\n1 - Portugues\n2 - Ingles"
        );
        String mesStr = JOptionPane.showInputDialog(
            "Digite o numero do mes (1 a 6)"
        );
        int idioma = Integer.parseInt(idiomaStr);
        int mes = Integer.parseInt(mesStr);    
        String resultado = obterMes(idioma, mes);
        
        JOptionPane.showMessageDialog(null, resultado);
    }

     
    public static String obterMes(int idioma, int numeroMes) {
        
        String[] mesesPT = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"
        };
        
        String[] mesesEN = {
            "january", "February", "March", "April", "May", "June"
        };
        
        int indice = numeroMes - 1;
        
        if (indice < 0 || indice >= 6) {
            return "Mes invalido";
        }
        
        switch (idioma) {
            case 1:
                return mesesPT[indice];
            case 2:
                return mesesEN[indice];
            default:
                return "Idioma Invalido";
        }
    }
}   
