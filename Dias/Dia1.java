
import java.util.Scanner;

public class Dia1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int a, b, area;

		Scanner imput = new Scanner(System.in);

		System.out.println("Digite o valor da ALTURA do Tri�ngulo: ");
		a = imput.nextInt();

		System.out.println("Digite o valor da BASE do Tri�ngulo: ");
		b = imput.nextInt();

		area = (a * b);

		System.out.println("A �rea do Tri�ngulo em M� � de: " + area + "m�");
	}
}
