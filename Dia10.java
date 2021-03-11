import java.util.Scanner;

  public class Dia10 {
    public static void main(String[] args) {
      float valor;

      Scanner imput = new Scanner (System.in);

      System.out.println("Digite qualquer valor: ");
      valor = imput.nextFloat();

      if (valor >= 0) {
        System.out.println("O valor é positivo.");
      } else {
        System.out.println("O valor é negativo.");
		  }
	}
}
