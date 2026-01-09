package orientacaoaobjetos.Composicao;

public class Caminhao {
    public String modelo, fabricante;
    public Motor motor;
    public Roda roda1,roda2, roda3, roda4;
    public Pneu pneu1, pneu2, pneu3, pneu4;
    public Caminhao() {
        motor = new Motor();
        roda1 = new Roda();
        roda2 = new Roda();
        roda3 = new Roda();
        roda4 = new Roda();
        pneu1 = new Pneu();
        pneu2 = new Pneu();
        pneu3 = new Pneu();
        pneu4 = new Pneu();
    }
    public static void main(String[] args) {
        Caminhao c = new Caminhao();
        c.modelo = "Atego 2425";
        c.fabricante = "mercedes";
        c.motor.potencia = 245;
        c.motor.cilindrada = 6374;
        c.motor.cilindrada = 92;
        c.roda1.cor = "Preta";
        c.pneu1.diametro = 17;
    }
}
