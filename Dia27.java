import java.util.Scanner;

public class Dia27 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int numero;
        Scanner imput = new Scanner(System.in);

        System.out.println("Aperte qualquer número para ver os valores de 10 a 1: ");
        numero = imput.nextInt();

        while (numero > -999) {
            System.out.println("Os números entre de 10 a 1 são: " + 10);
            System.out.println("Os números entre de 10 a 1 são: " + 9);
            System.out.println("Os números entre de 10 a 1 são: " + 8);
            System.out.println("Os números entre de 10 a 1 são: " + 7);
            System.out.println("Os números entre de 10 a 1 são: " + 6);
            System.out.println("Os números entre de 10 a 1 são: " + 5);
            System.out.println("Os números entre de 10 a 1 são: " + 4);
            System.out.println("Os números entre de 10 a 1 são: " + 3);
            System.out.println("Os números entre de 10 a 1 são: " + 2);
            System.out.println("Os números entre de 10 a 1 são: " + 1);
            return;
        }
    }
}
