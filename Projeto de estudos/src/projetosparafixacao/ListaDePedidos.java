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
        btRemover = new JButton("Remover");
        btRemover.setToolTipText("Remove os itens selecionado");
        lbProduto.setBounds(15, 40, 100, 25);
        lbQuantidade.setBounds(255, 40, 100, 25);
        lbPrecoUnitario.setBounds(310, 40, 100, 25);
        lbNumero.setBounds(15, 10, 120, 25);
        lbTotal.setBounds(278, 360, 100, 25);
        tfProduto.setBounds(15, 65, 200, 25);
        tfQuantidade.setBounds(255, 65, 50, 25);
        tfPrecoUnitario.setBounds(310, 65, 80, 25);
        tfNumero.setBounds(130, 10, 50, 25);
        tfTotal.setBounds(375, 360, 100, 25);
        btAdicionar.setBounds(15, 100, 100, 22);
        btRemover.setBounds(125, 100, 100, 22);
        pnPrincipal = new JPanel();
        pnPrincipal.setLayout(null);
        pnPrincipal.setBounds(0, 0, 500, 400);
        pnPrincipal.add(lbNumero);
        pnPrincipal.add(lbTotal);
        pnPrincipal.add(tfNumero);
        pnPrincipal.add(tfTotal);
        pnPrincipal.add(lbProduto);
        pnPrincipal.add(tfProduto);
        pnPrincipal.add(lbQuantidade);
        pnPrincipal.add(tfQuantidade);
        pnPrincipal.add(lbPrecoUnitario);
        pnPrincipal.add(tfPrecoUnitario);
        pnTable = new JPanel(new BorderLayout());
        pnTable.setBorder(new TitledBorder("Itens do pedido"));
        scrollTable = new JScrollPane();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        pnPrincipal.add(btAdicionar);
        pnPrincipal.add(btRemover);
        DefaultTableModel tableModel = new DefaultTableModel(
            new String[] {"Produto", "Qtde", "Preco Un.", "Total"},0) {
                public boolean isCellEditable(int row, int col) {
                    if (col == 3) {
                        return false;
                    }
                    return true;
                }  
            };
        table = new JTable(tableModel);
        
        DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();
        alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);
        table.getColumnModel() .getColumn(0) .setPreferredWidth(150);
        table.getColumnModel() .getColumn(0) .setResizable(false);
        table.getColumnModel() .getColumn(1) .setPreferredWidth(50);
        table.getColumnModel() .getColumn(1) .setResizable(false);
        table.getColumnModel() .getColumn(1) .setCellRenderer(alinhaDireita);
        table.getColumnModel() .getColumn(2) .setPreferredWidth(100);
        table.getColumnModel() .getColumn(2) .setResizable(false);
        table.getColumnModel() .getColumn(2) .setCellRenderer(alinhaDireita);
        table.getColumnModel() .getColumn(3) .setPreferredWidth(100);
        table.getColumnModel() .getColumn(3) .setResizable(false);
        table.getColumnModel() .getColumn(3) .setCellRenderer(alinhaDireita);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scrollTable.setViewportView(table);
        pnTable.add(scrollTable);
        pnTable.setBounds(10, 130, 470, 230);
        pnPrincipal.add(pnTable);
        add(pnPrincipal);        
    }
    
    
    private void definirEventos(){
        
    }
    
}

//Exercicio de inclusao de grade.