package criacaodemetodos;
import javax.swing.*;

public class EntradaDeDados {
        static String aux = "";
        public static int lerNumeroInt(int minimo, int maximo, String men) {
         int n = 0;
         while (true) {
             try {
                 aux = JOptionPane.showInputDialog(men);
                 n = Integer.parseInt(aux);
                 
                 if (n < minimo || n > maximo) {
                     JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida!!");
                 }else {
                     break;
                 }
             }catch (NumberFormatException erro) {
                 JOptionPane.showMessageDialog(null, "Digite apenas valores numericos!! \n" + erro.toString());
             }
         }
         return (n);
        }
        
        public static float lerNumeroFloat (float minimo, float maximo, String men) {
            float n = 0;
            while (true) {
                try {
                    aux = JOptionPane.showInputDialog(men);
                    n = Float.parseFloat(aux);
                    if (n < minimo || n > maximo) {
                        JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida");
                    }else {
                        break;
                    }
                }catch (NumberFormatException erro) {
                    JOptionPane.showMessageDialog(null, "Digite apenas valores numericos!! \n" + erro.toString());
                }
            }
            return (n);
        }
    public static double lerNumeroDouble(int minimo, int maximo, String men) {
        double n= 0;
        while (true) {
            try {
                aux = JOptionPane.showInputDialog(men);
                n = Double.parseDouble(aux);
                if (n < minimo || n > maximo) {
                    JOptionPane.showMessageDialog(null, "Entrada fora da faixa permitida!!");
                }else {
                    break;
                }
            }catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores numericos! \n" + erro.toString());
            }
        }
        return (n);
    }
    public static String lerString(String men) {
        aux = JOptionPane.showInputDialog(men);
        return(aux);
    }
    public static char selecionarOpcao(String men) {
        Object[] op = {"Sim", "Nao"};
        char opcao = 'N';
        String resp = (String) JOptionPane.showInputDialog(null, men
                + "\n", "Pesquisa", 
                JOptionPane.PLAIN_MESSAGE, null, op, "Sim");
       if ("Sim".equals(resp)) {
         opcao = 'S';
        }
        return opcao;
        }
        
    }


// clase sem main -> public static void main.
//importante estudar e repetir mais vezes para melhor entendimento.
// quando conseguir criar sem auxilio este é um nivel jr.
//base para orientaçao a objetos