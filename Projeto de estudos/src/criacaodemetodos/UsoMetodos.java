package criacaodemetodos;

public class UsoMetodos {
    public static void main(String [] args) {
        SemRetorno.imprimirTexto("Usando metodos de outra classe");
        SemRetorno.somar(20, 30);
        System.out.println(ComRetorno.mostrarDiaPorExtenso(5));
        System.out.println(ComRetorno.contarLetrasA("Marmelada"));
        
    }
    
}
