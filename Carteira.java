public class Carteira {
 
    String dono;
    double saldoBitcoin;
    String senhaAcesso;

    public Carteira (String dono, String senhaAcesso) {
        this.dono = dono;
        this.saldoBitcoin = 0.001;
        this.senhaAcesso = senhaAcesso;
    }

    public void depositar(double valor) {
    saldoBitcoin += valor;
    System.out.println("Depósito Feito!");
}
    }

}
