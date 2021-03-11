import java.util.Scanner;

public class Dia8 {
	public static void main(String[] args) {
		float n1, n2, n3, media, soma;
		
		System.out.println("Bem-vindo, você quer ver qual foi sua média final nas 3 etapas do PAS? Então coloque suas notas aí ;)");
		System.out.println("Sabemos que as notas do PAS são multiplicadas, a cada etapa. Por exemplo, multiplicamos a nota por3, na etapa 3.");
		
		Scanner imput = new Scanner (System.in);
		
		System.out.println(" ");
		
		System.out.println("Digite qual foi a sua nota na PRIMEIRA etapa: ");
		n1 = imput.nextFloat();
		
		System.out.println("Digite qual foi a sua nota na SEGUNDA etapa: ");
		n2 = imput.nextFloat();
		
		System.out.println("Digite qual foi a sua nota na TERCEIRA etapa: ");
		n3 = imput.nextFloat();
		
		soma = ((n1)+ (n2*2) + (n3*3));
		System.out.println("A soma das suas notas em todas as etapas é: " + soma);
		
		media = (soma/3);
		System.out.println("A sua média final, nas 3 etapas do PAS é de: " + media + " pontos!");
	}
}
