package metodos;

import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class ClasseLocale {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat();
        Locale local = Locale.getDefault();
        double valor = 1370.25;
        
        if (local.getCountry() .equals("BR")) {
            df.applyPattern("R$ #,##0.000");
        }
        JOptionPane.showMessageDialog(null, "Configuraçao do Sistema Operacional:"
            + "\nSigla:" + local.getCountry()
            + "\nPais:" + local.getDisplayCountry()
            + "\nTeclado:" + local.getDisplayName()
            + "\nValor:" + df.format(valor));
        System.exit(0);
    }
    
}
