package EstruturaCondicionais;

import javax.swing.JOptionPane;

public class GetMessageEPrintStackTrace {
    public static void main(String args[]) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(" Forneça um numero" ));
        try {
            int y = x / 0;       //gera uma exceçao
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
            erro.printStackTrace();
        }
    }
   
}

// erro por zero para demonstrar o uso da classe