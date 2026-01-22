package interfacegrafica;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GuiListaComFotos extends JPanel{
    
    private JList<String>lsFotos;
    private DefaultListModel<String> dlm;
    private ImageIcon imagem1;
    private JScrollPane sp;
    private JLabel lbImagem;
    
    public GuiListaComFotos() {
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes() {
        setLayout(null);
        
        dlm = new DefaultListModel<String>();
        for (int i = 1; i < 10; i++) {
            dlm.addElement("foto" + i);
        }
        
        lsFotos = new JList<String>(dlm);
        sp = new JScrollPane(lsFotos);
        sp.setBounds(50, 50, 70, 150);
        
        imagem1 = new ImageIcon();
        lbImagem = new JLabel(imagem1);
        lbImagem.setBounds(150, 30, 180, 180);
        
        add(sp);
        add(lbImagem);
    }
    
    private void definirEventos() {
        lsFotos.addListSelectionListener(new ListSelectionListener() {
           public void valueChanged(ListSelectionEvent e) {
               imagem1 = new ImageIcon(
                       "Fotos/" + lsFotos.getSelectedValue() + ".jpg");
               lbImagem.setIcon(imagem1);
           } 
        });
    }
}
