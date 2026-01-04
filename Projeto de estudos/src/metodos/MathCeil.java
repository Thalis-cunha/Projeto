package metodos;

import javax.swing.JOptionPane;

public class MathCeil {
    public static void main(String[] args) {
        
        final float LOTACAO_ONIBUS = 50;
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Numero de passageiros?"));
        float qtdeOnibus = numeroPassageiros / LOTACAO_ONIBUS;
        JOptionPane.showInputDialog(null, "Quantidade de passageiros: " + numeroPassageiros +
                "\nQuantidadecalculada: " + qtdeOnibus +
                "\nQuantidade de onibus necessarios: " + (int) Math.ceil(qtdeOnibus));
        System.exit(0);
    }
    
}


//aredondamento de numeros para cima
