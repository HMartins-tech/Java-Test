import java.util.Scanner;

public class Dia22 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Int valor1, valor2;
		Scanner imput =  new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = imput.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = imput.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O primeiro valor é maior que o segundo.");
		} else {
			if (valor1 < valor2) {
				System.out.println("O segundo valor é maior que o primeiro.");
			} else if (valor1 == valor2) {
				System.out.println("Os números são iguais.");
			}
		}
	}
}
