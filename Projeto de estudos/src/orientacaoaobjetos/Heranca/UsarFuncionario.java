package orientacaoaobjetos.Heranca;

public class UsarFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas");
        funcionario.setRg("12.345.567-x");
        funcionario.setCartao("RH845");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRg());
        System.out.println(funcionario.getCartao());
    }
    
}
