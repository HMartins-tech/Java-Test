
import java.util.Scanner;

public class Dia4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float salario, salarioNovo, percentual, reajuste;
		
		Scanner imput = new Scanner(System.in);

		System.out.println("Entre com o valor salarial mensal: ");
		salario = imput.nextInt();

		System.out.println("Entre com o porcentual do reajuste salarial: ");
		percentual = imput.nextInt();

		reajuste = ((percentual*salario)/100);
		salarioNovo = (salario+reajuste);
		System.out.println("Seu novo salario mensal será de: " + salarioNovo + "R$");
	}
}
