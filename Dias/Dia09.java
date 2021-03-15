import java.util.Scanner;

public class Dia9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float valor;
		
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite qualquer valor: ");
		valor = imput.nextFloat();
		
		if (valor>10) {
			System.out.println("O valor é maior que 10.");
		} else {
			System.out.println("O valor é menor que 10.");
		}
	}
}
