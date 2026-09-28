package controledeeventos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GuiEventos extends JFrame{
    JButton btMudarCor;
    JTextField tfCaixa1, tfCaixa2;
    int posicaoEsquerda = 100, posicaoTopo = 100;
    
    public static void main(String args[]){
        JFrame janela = new GuiEventos();
        janela.addWindowListener(new WindowListener() {
            public void WindowOpened(WindowEvent e) {}
            public void WindowClosing(WindowEvent e) {}
            public void WindowClosed(WindowEvent e) {}
            public void WindowIconified(WindowEvent e) {
                System.out.println("A Janela foi Minimizada!");
            }
            public void windowDeiconnified(WindowEvent e) {
                System.out.println(" A Janela foi Restaurada");
            }
            public void windowActivated(WindowEvent e) {}
            public void windowDeactivated(WindowEvent e) {}
        });
        janela.addComponentListener(new ComponentListener() {
            public void componentResized(ComoinentEvent e) {
                System.out.println("A Janela foi Redimensionada!");
            }
            public void componentMoved(ComponentEvent e) {
                System.out.println("A Janela foi Movida!");
            }
            public void componentShown(componentEvent e) {
                System.out.println("A Janela tornou-se Visa-vel!");
            }
            public void componentHidden(componentEvent e) {
                System.out.println("A Janela tornou-se Oculta");
            }           
        });
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);        
    }
    
    public GuiEventos() {
        inicializarComponentes();
        definirEventos();
    }
    
    public void inicializarComponentes() {
        setTitle("Controle de Eventos");
        setSize(250, )
        
    }
    
    public void definirEventos() {
        
    }
    
}
