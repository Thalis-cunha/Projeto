package interfacegrafica;

import javax.swing.*;

public class CaregarFrame {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Uso de botoes");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GuiCaixaOpcao());
        frame.setBounds(0, 0, 500, 300);
        frame.setVisible(true);
    }
}

