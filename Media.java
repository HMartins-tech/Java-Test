import java.util.Scanner;

public class Media {
	public static void main (String [] args) {
		float n1, n2, n3, n4, mediaFinal;
		
		Scanner nota = new Scanner (System.in);
		
		System.out.print("Entre com a nota do primeiro bimestre: ");
		n1 = nota.nextFloat();
		System.out.print("Entre com a nota do segundo bimestre: ");
		n2 = nota.nextFloat();
		System.out.print("Entre com a nota do terceiro bimestre: ");
		n3 = nota.nextFloat();
		System.out.print("Entre com a nota do quarto bimestre: ");
		n4 = nota.nextFloat();
		
		mediaFinal = (n1+n2+n3+n4)/4;
		if(mediaFinal >= 6) {
			System.out.print("Voce foi APROVADO. ");
		} else {
			System.out.print("Voce foi REPROVADO. ");
		}
		System.out.print("A media final é de: " + mediaFinal + " pontos.");
	}
}
