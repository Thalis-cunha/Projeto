package projetosparafixacao;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class ListaDePedidos extends JPanel{
    private JPanel pnPrincipal, pnTable;
    private JButton btRemover, btAdicionar;
    private JScrollPane scrollTable;
    private JTable table;
    private JLabel lbNumero, lbTotal, lbProduto, lbPrecoUnitario, lbQuantidade;
    private JTextField tfNumero, tfTotal, tfProduto, tfPrecoUnitario, tfQuantidade;
    DecimalFormat df= new DecimalFormat("#.##.00");
    
    public ListaDePedidos(){
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes(){
        setLayout(null);
        lbProduto = new JLabel("Produto");
        lbQuantidade = new JLabel("Quantidade");
        lbPrecoUnitario = new JLabel("PrecoUnitario");
        lbNumero = new JLabel("Numero do Pedido");
        lbTotal = new JLabel ("Total do Pedido");
        tfProduto = new JTextField();
        tfPrecoUnitario = new JTextField();
        tfQuantidade = new JTextField();
        tfNumero = new JTextField();
        tfTotal = new JTextField();
        tfTotal.setEnabled(false);
        tfTotal.setHorizontalAlignment(JTextField.RIGHT);
        btAdicionar = new JButton("Adicionar");
        btAdicionar.setToolTipText("Adiciona um item ao Pedido");
    }
    private void definirEventos(){
        
    }
    
}

//Exercicio de inclusao de grade.