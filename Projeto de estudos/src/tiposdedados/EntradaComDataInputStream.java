package TiposDeDados;


import java.io.*;
public class EntradaComDataInputStream {
    public static void main(String args[]){
        String s;
        float largura, comprimento, area, perimetro;
        DataInputStream dado;
        try {
            System.out.println("Entre com o comprimento");
            dado = new DataInputStream(System.in);
            s = dado.readLine();  //deprecated
            comprimento = Float.parseFloat(s);
            
            System.out.println("Entre com a largura");
            dado = new DataInputStream(System.in);
            s = dado.readLine();  //deprecated
            largura = Float.parseFloat(s);
            
            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retangulo:" + area);
            System.out.println("Perimetro do retangulo:" + perimetro);
        }catch (IOException erro){
            System.out.println("Houve erro na entrada de dados" + erro.toString());
        }catch (NumberFormatException erro){
            System.out.println("Houve erro na conversao, digite apenas caracteres numericos" + erro.toString());
        }
    }
    
}