package interfacegrafica;

import javax.swing.*;

public class CaregarFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste de Janelas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuiLabel());
        frame.setBounds(0, 0, 500, 300);
        frame.setVisible(true);
    }
}
