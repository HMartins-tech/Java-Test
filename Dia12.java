import java.util.Scanner;

	public class Dia12 {	
		public static void main(String[] args) {
			float n1, n2, n3, n4, soma, media;
			Scanner imput = new Scanner (System.in);
			
			System.out.println("Entre com o primeiro valor: ");
			n1 = imput.nextInt();
			
			System.out.println("Entre com o segundo valor: ");
			n2 = imput.nextInt();
			
			System.out.println("Entre com o terceiro valor: ");
			n3 = imput.nextInt();
			
			System.out.println("Entre com o quarto valor: ");
			n4 = imput.nextInt();
			
			soma = (n1 + n2 + n3 + n4);
			media = (soma/4);
			
			if (media >= 6) {
				System.out.println("Você foi APROVADO! Sua nota foi: " + media);
			} else {
				System.out.println("Você foi REPROVADO! Sua nota foi: " + media);
			}
	}
}
