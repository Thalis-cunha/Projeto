package criacaodemetodos;

public class ComRetorno {
    public static void main(String[] args) {
        System.out.println(ComRetorno.somar(2, 3));
        System.out.println(ComRetorno.mostrarPares(100));
        System.out.println(ComRetorno.mostrarDiaPorExtenso(3));
        System.out.println(ComRetorno.contarLetrasA("Banana"));
    }
    public static double somar(double a, double b) {
        return a + b;
    }
    public static String mostrarPares(int valor) {
        String retorno = "";
   
        for (int a = 0; a <= valor; a = a + 2) {
            retorno += a + " ";
        }
        return retorno;
    }
    public static String mostrarDiaPorExtenso(int dia) {
        String extenso = "Domingo";
        if(dia == 1) {
            extenso = "Segunda";
        }else if (dia == 2) {
            extenso = "terça";
        }else if (dia == 3) {
            extenso = "Quarta";
        }else if (dia == 4) {
            extenso = "Quinta";
        }else if (dia == 5) {
            extenso = "Sexta";
        }else if (dia == 6) {
            extenso = "Sabado";
        } else {
            extenso = "Dia nao reconhecido";
        }
        return extenso;
    }
        
    public static int contarLetrasA(String palavra) {
        int quantidade = 0;
        palavra = palavra.toUpperCase();
        for (int a = 0; a < palavra.length(); a++) {
            if (palavra.charAt(a) == 'A') {
                quantidade++;
            }
        }
        return quantidade;
    }
}


//usado if e else para praticar a repetiçao de digitaçao, mais adiante treinarei swith e outro laços de repetiçao para melhor fixacao do conteudo.