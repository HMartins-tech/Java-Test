import java.util.Scanner;

public class Dia17 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float numeroConta, saldo, saldoAtual, debito, credito;
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite o número da sua conta: ");
		numeroConta = imput.nextFloat();
		System.out.println("Bem-vindo!");
		
		System.out.println("Digite o valor do saldo disponível: ");
		saldo = imput.nextFloat();
		
		System.out.println("Digite o valor a ser pago no Crédito: ");
		credito = imput.nextFloat();
		
		System.out.println("Digite o valor a ser pago no Débito: ");
		debito = imput.nextFloat();
		
		saldoAtual = (saldo - (debito + credito));
		System.out.println("Seu saldo atual é: " + saldoAtual + "R$");
		
		if (saldoAtual > 0) {
			System.out.println("Saldo Positivo. Você possui saldo para pagar as contas.");
		} else if (saldoAtual == 0) {
			System.out.println("Saldo Zerado. Você possui saldo suficiente para pagamento de contas, porém ficará com saldo zerado..");
		} else {
			System.out.println("Saldo Negativo. Você não possui saldo para pagamento das contas e há risco de ter dívidas com o Banco.");
		}		
	}
}
