package projetosparafixacao;

import javax.swing.JOptionPane;
import java.util.*;

public class MenuSimples {

    public static void main(String[] args) {

        int opcao = -1;

        while (opcao != 0) {

            String entrada = JOptionPane.showInputDialog(null,
                    "Escolha uma opçao:\n"
                    + "1 - Par ou Impar\n"
                    + "2 - Tabuada\n"
                    + "3 - Soma\n"
                    + "0 - Sair", "Menu",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Operaçao cancelada"
                );
                break;

            }
            try {
                opcao = Integer.parseInt(entrada);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas numeros!" + "Erro"
                        + JOptionPane.ERROR_MESSAGE);
                continue;

            }
            switch (opcao) {
                case 1:
                    verificarParOuImpar();
                    break;

                case 2:
                    gerarTabuada();
                    break;

                case 3:
                    somarNumeros();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opçao é invalida! Escolha entre 0 e3.");

            }
        }
    }

    public static void verificarParOuImpar() {

        String entrada = JOptionPane.showInputDialog("Digite um numero inteiro");

        if (entrada == null) {
            return;
        }

        try {
            int numero = Integer.parseInt(entrada);
            String resultado = (numero % 2 == 0) ? "Par" : "Impar";
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros inteiros!" + "Erro"
                    + JOptionPane.ERROR_MESSAGE);

        }
    }

    public static void gerarTabuada() {

        String entrada = JOptionPane.showInputDialog("Digite o numero para da tabuada desejada:");

        if (entrada == null) {
            return;
        }

        try {
            int numero = Integer.parseInt(entrada);
            String resultado = "";

            for (int i = 1; i <= 10; i++) {
                resultado += numero + " x " + i + " = " + (numero * i) + "\n";
            }

            JOptionPane.showMessageDialog(null, resultado, "Tabuada", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros inteiros!", "erro", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static void somarNumeros() {
        String entrada = JOptionPane.showInputDialog("Digite um numero inteiro para somar de 1 até ele:");

        if (entrada == null) {
            return;
        }

         try {
            int numero = Integer.parseInt(entrada);
            int soma = 0;
            for (int i = 1; i <= numero; i++) {
                soma += i;
            }
            JOptionPane.showMessageDialog(null, "A soma de 1 até " + numero + " é " + soma);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}