import java.util.Scanner;

public class Dia16 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int valorVendas, comissao1, comissao2, salarioFixo;

		Scanner imput = new Scanner (System.in);
		
		System.out.println("A empresa que você está trabalhando, está dando comissão para os vendedores que vendem mais de 1501R$ em produtos. "
				+ "Caso venda 1500R$, você ganhará comissão, porém mais baixa. "
				+ "Caso não venda acima de 1499, você não ganhará comissão. Confira seu salário com a comissão.");
		System.out.println(" ");
		
		System.out.println("Digite o valor do seu Salario Mensal: ");
		salarioFixo = imput.nextInt();
		
		System.out.println("Digite o valor total das vendas que você fez este mês: ");
		valorVendas = imput.nextInt();
		
		if (valorVendas > 1500) {
			comissao1 = (int) ((salarioFixo*0.25) + salarioFixo);
			System.out.println("Seu salário desse mês foi reajustado para: R$"  + comissao1);
		} else if (valorVendas == 1500) {
				comissao2 = (int) ((salarioFixo*0.1) + salarioFixo);
				System.out.println("Seu salário desse mês foi reajustado para: R$"  + comissao2);
			}
		 else {
			System.out.println("Você não ganhou comissão. Seu salário continuará sendo: R$" + salarioFixo);
		}
	}
}
