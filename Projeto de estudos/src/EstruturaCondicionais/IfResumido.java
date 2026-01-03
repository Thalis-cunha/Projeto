package EstruturaCondicionais;

import javax.swing.JOptionPane;

public class IfResumido {

    public static void main(String args[]) {
        int a = 10, b = 15, maior;
        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }
        JOptionPane.showMessageDialog(null, "Usando um if comun" + maior);

        int c = 10, d = 8;
        maior = (c > d) ? c : d;
        JOptionPane.showMessageDialog(null, "Usando if resumido: " + maior);
    }
}

// feito 2 veses com modelos de if diferentes para melhor estudo e repeticoes de codigo, a segunda opçao é a resumida.

// ? ponto de interrogaçao faz o papel do if