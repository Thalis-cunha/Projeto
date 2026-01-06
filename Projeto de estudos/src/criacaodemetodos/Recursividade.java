package criacaodemetodos;

public class Recursividade {
    public static void main(String[] args) {
        for (long i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + calculadoraFatorial(i));
        }
}
    
    public static long calculadoraFatorial(long num) {
        if (num <= 1) {
            return (1);
        }else {
            return (num * calculadoraFatorial(num - 1));
        }
    }
}
