package interfacegrafica;
import java.awt.*;
import javax.swing.*;

public class GuiLabel extends JPanel {
    private JLabel label1, label2, label3, label4;
    private ImageIcon imageIcon1, imageIcon2;
        
    public GuiLabel() {
        inicializarComponentes();
    }
    
    private void inicializarComponentes() {
        setLayout(new GridLayout(4, 1));
        imageIcon1 = new ImageIcon(getClass().getResource("/icones/java.jpg"));       
        imageIcon2 = new ImageIcon(getClass().getResource("/icones/java2.jpg"));       
        setBackground(new Color(0, 0, 0));
        label1 = new JLabel("    Aprendendo a criar com cor branca",JLabel.LEFT);
        label1.setForeground(Color.white);
        label2 = new JLabel(imageIcon1);
        label3 = new JLabel("Mudança de cor e de lado para aprendizado ", JLabel.RIGHT);
        label3.setForeground(Color.blue);
        label4 = new JLabel("Labels e Imagens", imageIcon2, JLabel.CENTER);
        label4.setFont(new Font("Serif", Font.BOLD, 20));
        label4.setForeground(Color.green);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
    }
    
}
