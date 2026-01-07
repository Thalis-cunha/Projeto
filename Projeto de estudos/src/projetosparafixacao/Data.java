package projetosparafixacao;

import javax.swing.JOptionPane;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getDataFormatada() {
        return dia + "/" + mes + "/" + ano;
    }

    
    public static void main(String[] args) {

        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o dia:")
        );
        int mes = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o mês:")
        );
        int ano = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o ano:")
        );
        
        Data data = new Data(dia, mes, ano);

        JOptionPane.showMessageDialog(null,
                "Data informada: " + data.getDataFormatada()
        );
    }
}


//exercicio ja com uma base orientada a objetos que vai ser os proximos estudos.