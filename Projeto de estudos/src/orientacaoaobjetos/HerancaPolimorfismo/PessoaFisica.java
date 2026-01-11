package orientacaoaobjetos.HerancaPolimorfismo;

public class PessoaFisica extends Pessoa {
    private String rg;
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getRg() {
        return (rg);
    }
    
    
     //polimorfismo abaixo
    public void mostrarClasse() {
        System.out.println("classe Fisica");
    }
}
