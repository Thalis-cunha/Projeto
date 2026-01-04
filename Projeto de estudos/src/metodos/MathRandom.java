package metodos;

import javax.swing.JOptionPane;

public class MathRandom {
    public static void main(String[] args) {
        
        String senha = "";
        
        for (int i = 1; i <= 10; i ++) {                //cria 10 numeros de forma aleatoria como senha
            int num = (int) (Math.random() * 10);
            senha += num;
        }
        JOptionPane.showMessageDialog(null, "Senha gerada:" + senha);
        
        
        for (int cartao = 1; cartao <= 4; cartao++ ) {          //cria 4 cartoes com numeros aleatorios
            
            String numerosCartao = "";
            
            for (int numCartao = 1; numCartao <= 6; numCartao++) {
                int num = (int) (Math.random() *100);
                numerosCartao += num + "   ";                
            }
            JOptionPane.showMessageDialog(null, "Numeros do cartao:" + cartao +
                    "\n" + numerosCartao                    );
        }
        System.exit(0);
    }
    
}

//gerador de numero de cartao de credito
