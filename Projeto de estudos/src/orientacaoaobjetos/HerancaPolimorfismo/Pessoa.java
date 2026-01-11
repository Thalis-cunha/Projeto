package orientacaoaobjetos.HerancaPolimorfismo;

public class Pessoa {
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return (nome);
    };
    
    
    
    //polimorfismo abaixo
    public void mostrarClasse() {
        System.out.println("classe Pessoa");
    }
    
}
