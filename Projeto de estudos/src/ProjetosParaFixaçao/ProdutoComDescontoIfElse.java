package ProjetosParaFixaçao;  
import javax.swing.JOptionPane;

public class ProdutoComDescontoIfElse {
    public static void main(String[] args) {

        String preco = JOptionPane.showInputDialog("Forneça o valor do produto");

        if (preco == null) {
            System.exit(0);
        }

        double valor = Double.parseDouble(preco);
        double valorFinal;
        String produto = "Bicicleta";

        if (valor <= 100) {
            valorFinal = valor - (valor * 0.10);
            System.out.println("Voce obteve um desconto de 10%");
        } else if (valor >= 101 && valor <= 299 ) {
                valorFinal = valor - (valor * 0.15);
                System.out.println("Voce obteve um desconto de 15%");
        } else if (valor >= 300 ) {
                valorFinal = valor - (valor * 0.25);
                System.out.println("Voce obteve um desconto de 25%");
        } else {
            valorFinal = valor;
        }

        System.out.println("Produto:" + produto + "  Valor do produto:" + valorFinal);
    }
}


//muito pensamentos logicos, porem necessario gastar tempo para entender bem as opçoes que podem ser implementadas.