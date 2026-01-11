package orientacaoaobjetos.gravacaoLeitura;
import java.io.*;

public class produtoPersiste {
    public String gravar() {
        String ret = "Produto armazenado com sucesso!";
        try {
            fileOutputStream file = new FileOutputStream("c:produto" + this.getCodigo());
            Stream.writeObject(this);
            stream.flusg();
        }
        catch (exception erro) {
            ret = "falha na gravaçao\n" + erro.toString();
        }
    }
    
}
