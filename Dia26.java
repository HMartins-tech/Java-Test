import java.util.Scanner;

public class Prova44 {
    @SuppressWarnings("resource")

    public static void main() {

        float divisao, valor1, valor2;
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        valor1 = imput.nextFloat();

        System.out.println("Digite o valor 2: ");
        valor2 = imput.nextFloat();

        while (valor1 == 0) {
            System.out.println("Digite novamente o valor 1: ");
            valor1 = imput.nextFloat();
        }
        while (valor2 == 0) {
            System.out.println("Digite novamente o valor 2: ");
            valor2 = imput.nextFloat();
        }
        divisao = (valor1 / valor2);
        System.out.println("A divisão entre o " + valor1 + " e o " + valor2 + "é: " + divisao);
    }
}
