import java.util.Scanner;

public class Dia3 {

	public static void main(String[] args) {
		float eleitores, brancos, nulos, validos, somaBrancos, somaNulos, somaValidos;
		
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite o número total de eleitores do município: ");
		eleitores = imput.nextFloat();
		
		System.out.println("Digite o número total de votos em BRANCO: ");
		brancos = imput.nextFloat();
		
		System.out.println("Digite o número total de votos NULOS: ");
		nulos = imput.nextFloat();
		
		System.out.println("Digite o número total de votos VÁLIDOS: ");
		validos = imput.nextFloat();
		
		System.out.println("Os votos em branco foram de: " + brancos);		
		somaBrancos = ((100*brancos)/eleitores);
		System.out.println("Em porcentagem, os votos em branco foram de: " + somaBrancos + "%");
		
		
		System.out.println("Os votos anulados foram de: " + nulos);		
		somaNulos = ((100*nulos)/eleitores);
		System.out.println("Em porcentagem, os votos anulados foram de: " + somaNulos + "%");
		
		System.out.println("Os votos válidos foram: " + validos);
		somaValidos = ((100*validos)/eleitores);
		System.out.println("Em porcentagem, os votos vaválidos foram de: " + somaValidos + "%");		
	}
}
