package interfacegrafica;

import java.awt.event.*;
import javax.swing.*;

public class GuiBotao extends JPanel {

    private JButton btMensagem, btTeimoso;
    private ImageIcon imageIcon1;

    public GuiBotao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        imageIcon1 = new ImageIcon("icones/java.jpg");
        btMensagem = new JButton("Mensagem", imageIcon1);
        btMensagem.setBounds(50, 10, 180, 55);
        btMensagem.setMnemonic(KeyEvent.VK_M);
        btMensagem.setToolTipText("clique aqui para ver a mensagem");
        btTeimoso = new JButton("Teimoso");
        btTeimoso.setBounds(50, 70, 100, 25);
        add(btMensagem);
        add(btTeimoso);
    }

    private void definirEventos() {
        btMensagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botao Mensagem");
            }
        });

        btTeimoso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botao Teimoso");
            }
        });

       btTeimoso.addMouseListener(new MouseListener() {
            public void mouseClicked (MouseEvent e) {}
            public void mousePressed (MouseEvent e) {}
            public void mouseReleased (MouseEvent e) {}
            public void mouseEntered (MouseEvent e) {
                btTeimoso.setBounds (50, 70, 100, 25);
            }
            public void mouseExited (MouseEvent e) {
                btTeimoso.setBounds (50, 70, 100, 25);
            }
        });
    }
}
