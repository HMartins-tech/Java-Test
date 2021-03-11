import java.util.Scanner;

public class Dia2 {	
    public static void main(String args []){
        int idade = 0;
        int meses;
        int dias;
        int soma;
        
        Scanner imput = new Scanner (System.in);

        System.out.println("Qual sua idade?");
		idade = imput.nextInt();

        System.out.println("A sua idade é " + idade);
        
        meses = idade * 12;
        System.out.println("A sua idade em Meses é: " + meses);
        
        dias = idade * 365;
        System.out.println("A sua idade em Dias são: " + dias);  
    }
}
