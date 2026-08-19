package projetosparafixacao;
import java.awt.*;
import javax.swing.JInternalFrame;

public class FrameInterno extends JInternalFrame{
    
    public FrameInterno() {
        inicializarComponentes();
    }
    
    private void inicializarComponentes() {
     setTitle("Usando Frame Interno");
     setSize(300, 100);
     setResizable(true);
     setClosable(true);
     setMaximizable(true);
     setIconifiable(true);
     setBackground(Color.magenta);
     setVisible(true);
        
    }    
}

//necessita de um caregar frame para ser executado, execute o FrameInternoCaregar para vizualizar.