package EstruturaCondicionais;
import javax.swing.JOptionPane;

public class While {
    public static void main(String args[]){
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero abaixo de 10"));
        
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
    
}




// ao adicionar um numero abaixo de 10 ele vai fazer loop até chegar em 10 e encerrar o programa.