package orientacaoaobjetos.gravacaoLeitura;
import java.io.*;

public class ProdutoPersiste extends Produto {
    public String gravar() {
        String ret = "Produto armazenado com sucesso!";
        try {
            FileOutputStream file = new FileOutputStream("c:/produto" + this.getCodigo());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
        }
        catch (Exception erro) {
            ret = "falha na gravaçao\n" + erro.toString();
        }
        return ret;
    }
    public static Produto ler(int codigo) {
        try {
            FileInputStream file = new FileInputStream("c:/Produto" + codigo);
            ObjectInputStream stream = new ObjectInputStream(file);
            return ((Produto) stream.readObject());
    }
        catch (Exception erro) {
            System.out.println("Falha na leitura\n" + erro.toString());
            return null;
        }
    }
}
