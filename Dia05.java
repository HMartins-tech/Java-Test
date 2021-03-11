import java.util.Scanner;

public class Dia5 {

	public static void main(String[] args) {
		int valorCarro, impostosGerais, valorFinal;
		
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite o valor do carro sem impostos: ");
		valorCarro = imput.nextInt();
		
		System.out.println("Agora, digite o valor, em porcentagem, dos impostos gerais: ");
		impostosGerais = imput.nextInt();
		
		valorFinal = ((100*valorCarro)/impostosGerais);
		System.out.println("O valor do seu carro com os impostos à custo de fábrica é de: " + valorFinal + "R$");
	}
}
