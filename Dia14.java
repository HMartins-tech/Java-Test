import java.util.Scanner;

public class Prova19 {

	public static void main(String[] args) {
		int valor1, valor2;
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = imput.nextInt();
		
		System.out.println("Agora digite o segundo valor: ");
		valor2 = imput.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O primeiro valor é maior que o segundo valor.");
		} else {
			if (valor1 == valor2) {
				System.out.println("Os valores são iguais.");
			} else {
				System.out.println("O segundo valor é maior que o primeiro valor.");
			}
		}
	}
}
