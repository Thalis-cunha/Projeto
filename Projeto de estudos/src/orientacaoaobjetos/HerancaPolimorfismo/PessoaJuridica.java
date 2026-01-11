package orientacaoaobjetos.HerancaPolimorfismo;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    public void setCnpj (String cnpj) {
        this.cnpj = cnpj;        
    }
    public String getCnpj() {
        return (cnpj);
    }
    
     //polimorfismo abaixo
    public void mostrarClasse() {
        System.out.println("classe Juridica");
    }
}
