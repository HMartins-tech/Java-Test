import java.util.Scanner;

public class Dia7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int C, F;
		
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite o valor dos graus em Fahrenheit: ");
		F = imput.nextInt();
		
		C = ( F-32)* 5/9;
		System.out.println("Os graus em Celsius são de aproximadamente: " + C + "°");	
	}
}
