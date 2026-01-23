package interfacegrafica;
import javax.swing.*;
import java.awt.event.*;

public class GuiCombo extends JPanel {
    private JComboBox<String> cbEstados;
    private JLabel lbEstados;
    private JButton btMostrar;
    
    public GuiCombo() {
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes() {
        setLayout(null);
        String[] cbEstadosItems = {"Rio Grande do Sul", "Minas Gerais", "Rio de Janeiro", "Sao Paulo"};
        cbEstados = new JComboBox<String>(cbEstadosItems);
        lbEstados = new JLabel ("Estados do Sudeste:");
        btMostrar = new JButton ("Mostrar");
        add(lbEstados);
        add(cbEstados);
        add(btMostrar);
        lbEstados.setBounds(25, 15, 150, 25);
        cbEstados.setBounds(25, 40, 150, 25);
        btMostrar.setBounds(25, 75, 100, 25);
    }
    
    private void definirEventos() {
        btMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Indice selecionado: " + cbEstados.getSelectedIndex() + "\nTexto Selecionado: " + cbEstados.getSelectedItem());
            }
            
        });
    }
    
    
}
