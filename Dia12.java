import java.util.Scanner;

	public class Dia12 {	
		public static void main(String[] args) {
			float n1, n2, n3, n4, soma, mediaFinal;
			Scanner imput = new Scanner (System.in);
			
			System.out.println("Entre com a nota do 1° Bimestre: ");
			n1 = imput.nextInt();
			
			System.out.println("Entre com a nota do 2° Bimestre: ");
			n2 = imput.nextInt();
			
			System.out.println("Entre com a nota do 3° Bimestre: ");
			n3 = imput.nextInt();
			
			System.out.println("Entre com a nota do 4° Bimestre: ");
			n4 = imput.nextInt();
			
			soma = (n1 + n2 + n3 + n4);
			mediaFinal = (soma/4);
			
			if (mediaFinal >= 6) {
				System.out.println("Você foi APROVADO! Sua nota foi: " + mediaFinal);
			} else {
				System.out.println("Você foi REPROVADO! Sua nota foi: " + mediaFinal);
			}
	}
}
