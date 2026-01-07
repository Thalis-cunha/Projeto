package criacaodemetodos;

import javax.swing.JOptionPane;

public class chamaMetodos {
    public static void main(String[] args) {
        String nome = EntradaDeDados.lerString("Forneça seu nome");
        int idade = EntradaDeDados.lerNumeroInt(0, 120, "Forneça sua idade");
        float altura = EntradaDeDados.lerNumeroFloat(0, 2.5f, "Forneça sua altura");
        double peso = EntradaDeDados.lerNumeroDouble(0, 300, "Forneça seu peso");
        char op = EntradaDeDados.selecionarOpcao("Voce gosta de java?");
        JOptionPane.showMessageDialog(null, "nome: " + nome + "\nIdade: " + idade
            + "\nAltura: " + altura + "\nPeso: " + peso + "\nOpçao selecionada: " + op);
    }
    
}

//gostei desse estudo
