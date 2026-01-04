package tiposdedados;

import javax.swing.JOptionPane;

public class EntradaComJOptionPane {
    public static void main(String args[]){
        String aux;
        float largura, comprimento, area, perimetro;
        try{
            aux = JOptionPane.showInputDialog("Entre com o comprimento");
            comprimento = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com a largura");
            largura = Float.parseFloat(aux);
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura *2;
            JOptionPane.showInputDialog(null, "Área:" + area + ", perimetro:" + perimetro);
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "houve erro na conversao, digite apenas caracteres numericos" + erro.toString());
        }
    }
}
