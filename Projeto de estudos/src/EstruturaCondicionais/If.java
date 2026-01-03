package EstruturaCondicionais;


import javax.swing.JOptionPane;

public class If {

    public static void main(String args[]) {
        Object[] op = {"Masculino", "Feminino"};
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:\n",
                "Pesquisa", JOptionPane.PLAIN_MESSAGE,
                null, op, "Masculino");
        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Voce Pressionou Cancel");
        }
        if (resp.equals("Masculino")) {
            JOptionPane.showMessageDialog(null, "Voce é homen.");
        }
        if (resp.equals("Feminino")) {
            JOptionPane.showMessageDialog(null, "Voce é mulher.");
        }
        System.exit(0);
    }

}
