import java.util.Scanner;

public class Dia13 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int anoA, anoN, conta, idade;
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite o ano atual: ");
		anoA = imput.nextInt();
		
		System.out.println("Digite o ano que você nasceu: ");
		anoN = imput.nextInt();
		
		conta = (anoA - anoN);
		idade = conta;
		
		System.out.println("Sua idade é: " + idade);
		
		if (idade >= 16) {
			System.out.println("Você já pode votar!");
		} else {
			System.out.println("Você não pode votar esse ano!");
		}
	}
}
