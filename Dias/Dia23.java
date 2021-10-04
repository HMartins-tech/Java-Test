import java.util.Scanner;

public class Dia23 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float morango, maca, morango1, maca1, morango2, maca2, valor, valor1;
		morango1 = (float) 2.3F;
		morango2 = (float) 2F;
		maca1 = (float) 1.8F;
		maca2 = (float) 1.5F;

		Scanner imput = new Scanner(System.in);

		System.out.println("O Mercado da Maria está fazendo a seguinte promoção: ");
		System.out.println("O KG da Maçã está R$1.80, e o KG do Morango está R$2.30. ");
		System.out.println("Comprando mais de 5 KG, você ganha um desconto, e o KG do Morango vai para R$2.00,");
		System.out.println("e da maçã sai por R$1.50. Faça as contas aqui, e veja se compensa!");
		System.out.println(" ");
		//
		System.out.println("Digite os KG de morangos que você comprou: ");
		morango = imput.nextFloat();

		System.out.println("Digite os KG de maçãs que você comprou: ");
		maca = imput.nextFloat();
		//
		if (morango > 5) {
			valor = morango * morango2;
			System.out.println("O preço total do Morango COM desconto sai por R$" + valor);
		} else {
			valor = morango * morango1;
			System.out.println("O preço total do Morango SEM desconto sai por R$" + valor);
		}

		System.out.println(" e ");

		if (maca > 5) {
			valor1 = maca * maca2;
			System.out.println("O preço total da Maçã COM desconto sai sai por R$" + valor1);
		} else {
			valor1 = maca * maca1;
			System.out.println("O preço total da Maçã SEM desconto sai por R$" + valor1);
		}

	}

}
