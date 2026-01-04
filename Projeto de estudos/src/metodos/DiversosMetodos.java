package metodos;

import javax.swing.JOptionPane;

public class DiversosMetodos {
    public static void main(String[] args) {
        
        double a= 2.4, b= 2.8, c= 4, d= -1;
        String r= "Arredondamento menor de " + a + "= " + Math.round(a) 
                + "\nArredondamento maior de " + b + "= " + Math.round(b) 
                + "\nMaior de " + a +" e "+ b + "= " + Math.max(a, b) 
                + "\nmenor de " + a +" e" + b + "= " + Math.min(a, b) 
                + "\nRaiz quadrada de " + c + "= " + Math.sqrt(c) 
                + "\nPrimeiro elevado ao segundo " + c  + "= " + Math.pow(c, 2) 
                + "\nRetorna o valor abosluto " + d + "= " + Math.abs(d);
        JOptionPane.showMessageDialog(null, r);
    }
    
}


/*
Diversos Metodos
        math.round (valor)       recebe um valor e retorna o valor aredondado  <0.5 = 0, >0.5 = 1;
        math.max (valor1, valor2)    recebe dois valores e retorna o maior deles  1,2 = 2;
        math.min (valor1, valor2)    recebe dois valores e retorna o menor deles  1,2 = 1;
        math.sqrt (valor)        recebe um valor e retorna a raiz quadradad  25 = 5;
        math.pow (valor1, valor2)    recebe dois valores e eleva o primeiro ao segundo 10,2 = 100;
        math.abs (valor)        recebe um valor e retorna seu valor absoluto desconsiderando seu sinal  -2 = 2;

*/