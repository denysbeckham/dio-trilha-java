public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 300.0;
        double valorSolicitado = 217.0;

        if(valorSolicitado < saldo) {
           saldo = saldo - valorSolicitado;
           System.out.println("Saque Realizado, novo saldo: " + saldo);
        }
        else{
        System.out.println("###### ATENÇÃO ######");
        System.out.println("SAQUE NÃO REALIZADO, SALDO INSUFICIENTE...");
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("Saque Solicitado: " + valorSolicitado);
        
        }
           
           

    }
}
