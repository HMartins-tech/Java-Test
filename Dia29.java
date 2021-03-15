import java.util.Scanner;

public class Dia29 {
    @SuppressWarnings("resource")

    public static void main() {
        float n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, soma;
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        n1 = imput.nextInt();

        System.out.println("Digite o valor 2: ");
        n2 = imput.nextInt();

        System.out.println("Digite o valor 3: ");
        n3 = imput.nextInt();

        System.out.println("Digite o valor 4: ");
        n4 = imput.nextInt();

        System.out.println("Digite o valor 5: ");
        n5 = imput.nextInt();

        System.out.println("Digite o valor 6: ");
        n6 = imput.nextInt();

        System.out.println("Digite o valor 7: ");
        n7 = imput.nextInt();

        System.out.println("Digite o valor 8: ");
        n8 = imput.nextInt();

        System.out.println("Digite o valor 9: ");
        n9 = imput.nextInt();

        System.out.println("Digite o valor 11: ");
        n10 = imput.nextInt();

        soma = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10);

        System.out.println("A soma dos 10 valores é: " + soma);
    }
}
