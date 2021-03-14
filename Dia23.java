import java.util.Scanner;

public class Dia23 {

    public static void main(String[] args) {
        float morango, maca, morango1, maca1, morango2, maca2, valor, valor1;
        morango1 = (float) 2.3;
        morango2 = (float) 2;
        maca1 = (float) 1.8;
        maca2 = (float) 1.5;

        Scanner imput = new Scanner(System.in);

        System.out.println("O Mercado da Maria está fazendo a seguinte promoção: "
                + "O KG da Maçã está R$1.80, e o KG do Morango está R$2.30. "
                + "Comprando mais de 5 KG, você ganha um desconto, e o KG do Morango vai para R$2.00,"
                + " e da maçã sai por R$1.50. Faça as contas aqui, e veja se compensa!");

        System.out.println("Digite os KG de morangos que você comprou: ");
        morango = imput.nextFloat();

        System.out.println("Digite os KG de maçãs que você comprou: ");
        maca = imput.nextFloat();

        if (morango > 5) {
            valor = morango * morango2;
            System.out.println("O preço total sai por R$" + valor);
        } else {
            valor = morango * morango1;
            System.out.println("O preço total sai por R$" + valor);
        }

        if (maca > 5) {
            valor1 = maca * maca2;
            System.out.println("O preço total sai por R$" + valor1);
        } else {
            valor1 = maca * maca1;
            System.out.println("O preço total sai por R$" + valor1);
        }
    }
}
