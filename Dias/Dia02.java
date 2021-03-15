
import java.util.Scanner;

public class Dia2 {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        int idade = 0;
        int meses;
        int dias;

        Scanner imput = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        idade = imput.nextInt();

        System.out.println("A sua idade � " + idade);

        meses = idade * 12;
        System.out.println("A sua idade em Meses �: " + meses);

        dias = idade * 365;
        System.out.println("A sua idade em Dias s�o: " + dias);
    }
}
