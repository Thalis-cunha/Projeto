package EstruturaCondicionais;

import java.io.IOException;
import javax.swing.JOptionPane;

public class InstrucaoThrows {
    public static void main(String args[]) throws IOException {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade"));
            if ( idade < 18 ) {
                throw new Exception("Menor de idade, entrada nao permitida!!!");
            }else {
                JOptionPane.showMessageDialog(null, "Idade valida, seja bem vindo!");
            }
        }catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }
    
}
