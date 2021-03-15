import java.util.Scanner;

public class Calculadora {

	public int som(int num1, int num2) {

		return num1 + num2;

	}

	public int sub(int num1, int num2) {

		return num1 - num2;

	}

	public int div(int num1, int num2) {

		return num1 / num2;

	}

	public int mult(int num1, int num2) {

		return num1 * num2;

	}

	public static void main(String args[]) {

		Calculadora c = new Calculadora();

		int opcao = 5;
		int num1;
		int num2;

		Scanner imput = new Scanner(System.in);

		System.out.println("-Escolha uma op��o-");
		System.out.println("1. Soma");
		System.out.println("2. Subtra��o");
		System.out.println("3. Multiplica��o");
		System.out.println("4. Divis�o");
		System.out.println("0. Sair");
		System.out.println("Opera��o: ");

		opcao = imput.nextInt();

		while (opcao != 0) {

			if (opcao == 1) {

				Scanner imput1 = new Scanner(System.in);

				System.out.println("Qual o primeiro numero: ");
				num1 = imput1.nextInt();
				System.out.println("Qual o segundo numero: ");
				num2 = imput1.nextInt();

				/***/
				int operacao = c.som(num1, num2);

				System.out.print("O resultado da soma á: ");
				System.out.println(operacao);
				break;
			}
			if (opcao == 2) {

				Scanner imput1 = new Scanner(System.in);

				System.out.println("Qual o primeiro numero: ");
				num1 = imput1.nextInt();
				System.out.println("Qual o segundo numero: ");
				num2 = imput1.nextInt();
				int operacao = c.sub(num1, num2);

				System.out.print("O resultado da Subtração é: ");
				System.out.println(operacao);

				break;
			}
			if (opcao == 3) {
				Scanner imput1 = new Scanner(System.in);

				System.out.println("Qual o primeiro numero: ");
				num1 = imput1.nextInt();
				System.out.println("Qual o segundo numero: ");
				num2 = imput1.nextInt();
				int operacao = c.mult(num1, num2);

				System.out.print("O resultado da multiplicação é: ");
				System.out.println(operacao);
				break;
			}
			if (opcao == 4) {
				Scanner imput1 = new Scanner(System.in);

				System.out.println("Qual o primeiro numero: ");
				num1 = imput1.nextInt();
				System.out.println("Qual o segundo numero: ");
				num2 = imput1.nextInt();
				int operacao = c.div(num1, num2);

				System.out.print("O resultado da divisão é: ");
				System.out.println(operacao);
				break;
			} else {
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		}
	}
}
