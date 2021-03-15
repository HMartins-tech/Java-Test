import java.util.Scanner;

public class Dia28 {
    @SuppressWarnings("resource")

    public static void main() {
        float v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, soma, media;
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        v1 = imput.nextInt();

        System.out.println("Digite o valor 2: ");
        v2 = imput.nextInt();

        System.out.println("Digite o valor 3: ");
        v3 = imput.nextInt();

        System.out.println("Digite o valor 4: ");
        v4 = imput.nextInt();

        System.out.println("Digite o valor 5: ");
        v5 = imput.nextInt();

        System.out.println("Digite o valor 6: ");
        v6 = imput.nextInt();

        System.out.println("Digite o valor 7: ");
        v7 = imput.nextInt();

        System.out.println("Digite o valor 8: ");
        v8 = imput.nextInt();

        System.out.println("Digite o valor 9: ");
        v9 = imput.nextInt();

        System.out.println("Digite o valor 11: ");
        v10 = imput.nextInt();

        soma = (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10);
        media = (soma / 10);

        System.out.println("A soma dos 10 valores é: " + soma);
        System.out.println("A média aritmética é: " + media);
    }
}
