import java.util.Scanner;

public class Dia20 {

	public static void main(String[] args) {
		int valor1, valor2, valor3, soma;

		@SuppressWarnings("resource")
		Scanner imput = new Scanner(System.in);

		System.out.println("Entre com o primeiro valor: ");
		valor1 = imput.nextInt();

		System.out.println("Entre com o segundo valor: ");
		valor2 = imput.nextInt();

		System.out.println("Entre com o terceiro valor: ");
		valor3 = imput.nextInt();

		if (valor1 > valor2) {
			if (valor2 > valor3) {
				soma = (valor1 + valor2);
			} else {
				soma = (valor1 + valor3);
			}
		} else {
			if (valor1 > valor3) {
				soma = (valor2 + valor1);
			} else {
				soma = (valor3 + valor2);
			}
		}
		System.out.println("A soma entre os maiores numeros é: " + soma);
	}
}
