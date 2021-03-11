import java.util.Scanner;

public class Dia4 {
	public static void main(String[] args) {
		int salario, salarioNovo, reajuste;
		
		Scanner imput = new Scanner (System.in);
		
		System.out.println("O valor em porcentagem do reajuste salarial é de 75%");
		
		System.out.println("Entre com o valor salarial mensal: ");
		salario = imput.nextInt();
		
		System.out.println("Entre com o porcentual do reajuste salarial: ");
		reajuste = imput.nextInt();
		
		salarioNovo = ((100*salario)/reajuste);
		System.out.println("Seu novo salario mensal será de: " + salarioNovo + "R$" );
	}
}
