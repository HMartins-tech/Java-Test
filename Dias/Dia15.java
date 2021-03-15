import java.util.Scanner;

public class Dia15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int horaMes, horaDia, salarioDia, salarioHora, salarioTotal, salarioTotal1, salarioExtra, horaExtra;
		
		System.out.println("A sua empresa está dando um aumento para quem trabalhar 40 horas extras, caso queira ver qual será seu salário no final do mês, "
				+ "preencha as informações abaixo: ");
		System.out.println(" ");
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Qual seu salario mensal?");
		salarioTotal = imput.nextInt();
		
		System.out.println("Quantas horas, por dia, você trabalha?");
		horaDia = imput.nextInt();
		
		horaMes = (horaDia*22);
		System.out.println("Voê trabalha " + horaMes + " horas por mês, sem contar os finais de semana.");
		
		salarioDia = (salarioTotal/22);
		System.out.println("Você ganha " + salarioDia + "R$ por dia trabalhado");
		
		salarioHora = (salarioDia/horaDia);
		System.out.println("Você ganha " + salarioHora + "R$ por hora trabalhada.");
		
		System.out.println("Você trabalhou as 40 horas extras no mês? Se sim, digite 1, se não, digite 2: ");
		horaExtra = imput.nextInt();
		
		salarioExtra = (int) ((salarioTotal*0.5) + salarioTotal);
		
		if (horaExtra == 1) {
			salarioTotal1 = salarioExtra;
			System.out.println("Seu salário desse mês, com as horas extras, será de: R$" + salarioTotal1);
		} else if (horaExtra == 2) {
			System.out.println("Seu salário desse mês continuará sendo de: R$" + salarioTotal);
		} 
		if (horaExtra < 1) {
			System.out.println("Opção inválida, tente novamente.");
		} else if (horaExtra > 2) {
			System.out.println("Opção inválida, tente novamente.");
		}		
	}
}
