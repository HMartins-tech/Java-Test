
import java.util.Scanner;

public class Dia1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int a, b, area;

		Scanner imput = new Scanner(System.in);

		System.out.println("Digite o valor da ALTURA do Triângulo: ");
		a = imput.nextInt();

		System.out.println("Digite o valor da BASE do Triângulo: ");
		b = imput.nextInt();

		area = (a * b);

		System.out.println("A área do Triângulo em M² é de: " + area + "m�");
	}
}
