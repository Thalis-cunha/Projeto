package interfacegrafica;

import javax.swing.*;

public class CaregarFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Testando Janelas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuiLogin());   //altere o nome Gui... para vizualizar a parte do codigo desejada
        frame.setBounds(0, 0, 400, 300);
        frame.setVisible(true);
    }
}


//aqui voce executa os codigos criados abaixo sem metodo main.