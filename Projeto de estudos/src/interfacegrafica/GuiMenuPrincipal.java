package interfacegrafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame {

    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao, miRadio, miLista,
            miLabel, miCombo, miAreaDeTexto,
            miDialogoMensagem, miDialogoConfirmacao, miDialogoOpcao,
            miBarraRolagem;

    public GuiMenuPrincipal() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);

        contentPane = getContentPane();

        mnBarra = new JMenuBar();

        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');

        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');

        miSair = new JMenuItem("Sair", new ImageIcon("icones/sair.png"));
        miSair.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK)
        );

        miBotao = new JMenuItem("Botao");
        miCaixaOpcao = new JMenuItem("Caixa de selecao");
        miRadio = new JMenuItem("Radio");
        miLista = new JMenuItem("Lista");
        miLabel = new JMenuItem("Label");
        miCombo = new JMenuItem("Combo");
        miAreaDeTexto = new JMenuItem("AreaDeTexto");
        miDialogoMensagem = new JMenuItem("Area De Mensagem");
        miDialogoConfirmacao = new JMenuItem("Mensagem De Confirmacao");
        miDialogoOpcao = new JMenuItem("Mensagem De Opcao");
        miBarraRolagem = new JMenuItem("Barra Rolagem");

        mnArquivo.add(miSair);

        mnExemplos.add(miBotao);
        mnExemplos.add(miCaixaOpcao);
        mnExemplos.add(miRadio);
        mnExemplos.add(miLista);
        mnExemplos.add(miLabel);
        mnExemplos.add(miCombo);
        mnExemplos.add(miAreaDeTexto);
        mnExemplos.add(miDialogoMensagem);
        mnExemplos.add(miDialogoConfirmacao);
        mnExemplos.add(miDialogoOpcao);
        mnExemplos.add(miBarraRolagem);

        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);

        setJMenuBar(mnBarra);
    }

    private void definirEventos() {

        miSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        miBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiBotao());
            }
        });

        miCaixaOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiCaixaOpcao());
            }
        });

        miRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiRadio());
            }
        });

        miLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiLista());
            }
        });

        miLabel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiLabel());
            }
        });

        miCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiCombo());
            }
        });

        miAreaDeTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiAreaDeTexto());
            }
        });

        miDialogoMensagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiDialogoMensagem());
            }
        });

        miDialogoConfirmacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiDialogoConfirmacao());
            }
        });

        miDialogoOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiDialogoOpcao());
            }
        });
        miBarraRolagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trocarTela(new GuiBarraRolagem());
            }
        });
    }

    // 🔁 método centralizado (reduz duplicação)
    private void trocarTela(JPanel painel) {
        contentPane.removeAll();
        contentPane.add(painel);
        contentPane.revalidate();
        contentPane.repaint();
    }

    public static void abrir() {
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(
                (tela.width - frame.getSize().width) / 2,
                (tela.height - frame.getSize().height) / 2
        );

        frame.setVisible(true);
    }
}

//   melhorando a cada dia :)
