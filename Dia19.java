import java.util.Scanner;

public class Dia19 {

	public static void main(String[] args) {
		int valor1, valor2, valor3, maior;
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = imput.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = imput.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		valor3 = imput.nextInt();
		
		if (valor1 > valor2) {
			if (valor1 > valor3) {
				maior = valor1;
			} else {
				maior = valor3;
			}
		} else if (valor2 > valor3) {
			maior = valor2;
		} else {
			maior = valor3;
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		
	}
}
