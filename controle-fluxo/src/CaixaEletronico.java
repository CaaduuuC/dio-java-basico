public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 37.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso! Seu saldo atual é: " + saldo);
        }
        else
            System.out.println("Saldo insuficiente");;


    }
}
