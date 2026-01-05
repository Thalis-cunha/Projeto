package projetosparafixacao;

import javax.swing.JOptionPane;

public class SimulacaoDeLogin {
    public static void main(String args[]){
        
        String senhaCorreta = "123";
        int tentativas = 0;
        boolean acesso = false;
        
        String usuario = JOptionPane.showInputDialog("insira seu nome de usuario:");
         
        if (usuario == null){
            JOptionPane.showMessageDialog(null, "Operaçao cancelada devido a falta de usuario.");
            System.exit(0);
        }
        
        while (tentativas < 3){
            
            String senhaDigitada = JOptionPane.showInputDialog("Usuario:" + usuario + "\nDigite a senha:");
            
            
            if (senhaDigitada == null){
                JOptionPane.showMessageDialog(null, "operaçao cancelada.");
                System.exit(0);
                
            }if (senhaDigitada.equals(senhaCorreta)){
                acesso = true;
                break;
                
            }else {
                tentativas++;
                JOptionPane.showMessageDialog(null,"Senha incorreta " + tentativas + " de 3.");
            }
        
      }
            if (acesso) {
                JOptionPane.showMessageDialog(null,"Login realizado com sucesso");
            }else {
                JOptionPane.showMessageDialog(null, "Tente novamente.");
            }
    
    }
}  