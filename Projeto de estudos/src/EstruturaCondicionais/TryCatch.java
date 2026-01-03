package EstruturaCondicionais;

import javax.swing.JOptionPane;

public class TryCatch {
    public static void main(String args[]){
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1° numero:");
            int num1 = Integer.parseInt(aux1);
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2° numero:");
            int num2 = Integer.parseInt(aux2);
            JOptionPane.showMessageDialog(null, "soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtraçao = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicaçao = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisao = " + (num1 / num2));
        }catch (ArithmeticException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Programa fechado ou cancelado pelo usuario!\n" + erro.toString(), "erro",
                JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Final de execuçao!");
        }
        System.exit(0);
      }
    }
  

//finally{} sempre apresenta uma ultima mensagem apos o fechamento ou cancelamento do programa.