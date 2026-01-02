
import java.io.*;
import javax.swing.JOptionPane;

public class Throws {

    public static void main(String args[]) throws IOException {
        String frase = JOptionPane.showInputDialog("Entre com uma frase");
        try {
            FileWriter file = new FileWriter("C:/temp/frases.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");
        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Erro, Verifique se a pasta c:temp existe!");
        }
    }

}


// é necesario criar a pasta temp no disco local c.
