import java.util.Scanner;

public class Dia6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String usuario;
		int salarioFixo, parteVenda, valorCarro, carrosVendidos, totalVendas, salarioFinal, ganhoTotal;
		salarioFixo = 3000;
		
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite seu nome de Usuário: ");
		usuario = imput.nextLine();
		System.out.println("Seu Salário, sem vender nenhum carro é de: " + salarioFixo + "R$");
		System.out.println("A sua comissão, por venda, é de 10% do valor de cada carro.");
		
		System.out.println(" ");
		
		System.out.println("Quantos modelos HB20 você vendeu este mês?");
		totalVendas = imput.nextInt();
		
		System.out.println("Qual o valor de cada HB20?");
		valorCarro = imput.nextInt();
		
		System.out.println(" ");
		
		ganhoTotal = (valorCarro*totalVendas);
		System.out.println("O ganho total na venda dos HB20 foi de : " + ganhoTotal + "R$");
		
		parteVenda = (int) (ganhoTotal*0.1);
		System.out.println("A sua parte, nas vendas dos HB20 é de: " + parteVenda + "R$");

		salarioFinal = (salarioFixo+parteVenda);
		System.out.println("Bom, " + usuario + ", Seu salário desse mês foi alterado para: " + salarioFinal + "R$");	
	}
}
