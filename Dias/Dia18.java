import java.util.Scanner;

public class Dia18 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int estoqueAtual, estoqueMaximo, estoqueMinimo, quantidadeMedia;
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite a quantidade atual no estoque: ");
		estoqueAtual = imput.nextInt();
		
		System.out.println("Digite a quantidade de estoque máximo: ");
		estoqueMaximo = imput.nextInt();
		
		System.out.println("Digite a quantidade mínima de estoque: ");
		estoqueMinimo = imput.nextInt();
		
		quantidadeMedia = ((estoqueMaximo + estoqueMinimo)/2);		
		System.out.println("O estoque médio é de: " + quantidadeMedia);
		
		if (estoqueAtual >= quantidadeMedia) {
			System.out.println("Não é necessário efetuar compra.");
		} else if (estoqueAtual < quantidadeMedia) {
			System.out.println("É necessário efetuar compra.");
		}
	}
}
