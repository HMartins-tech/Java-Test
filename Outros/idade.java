import java.util.Scanner;

public class idade {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        int idade, meses, dias;
        Scanner imput = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        idade = imput.nextInt();

        meses = idade * 12;
        dias = idade * 365;

        System.out.println("A sua idade é " + idade);
        System.out.println("A sua idade em Meses é: " + meses);
        System.out.println("A sua idade em Dias são: " + dias);
    }
}
