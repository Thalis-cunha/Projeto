package TiposDeDados;


public class OperadoresAritmeticos {
    public static void main(String args[]) {
    int x = 10;
    int y = 3;
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("-x = " + (-x));
    System.out.println("x/y = " + (x / y));
    System.out.println("resto de x por y =" + (x % y)); //resulta 1
    System.out.println("inteiro de x por y =" + (int) (x / y)); //resulta 3
    System.out.println("x + 1 =" + (++x)); // resulta 11
    
    }    
}
