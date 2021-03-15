import java.util.Scanner;

  public class Dia11 {
   	@SuppressWarnings("resource")

    public static void main(String[] args) {
      float maca, m, m2;

      System.out.println("O Mercado do Tião está com promoção nas maçãs. Comprando 12 maçãs ou mais, cada maçã sai por 1 real. "
          + "Comprando menos de 12, as maçãs continuam 1,30R$");
      System.out.println(" ");

      Scanner imput = new Scanner (System.in);

      System.out.println("Quantas maçãs você comprou?");
      maca = imput.nextFloat();

      if (maca >= 12) {
        System.out.println("Cada maçã saiu por 1 real");
        m2 = (1*maca);
        System.out.println(" ");
        System.out.println("O custo total das compras das maçãs foi de: " + m2 + "R$");
      } else {
        System.out.println("Cada maçã continuou com preço de 1,30 R$");
        m = (float) (1.3*maca);
        System.out.println(" ");
        System.out.println("O custo total das compras das maçãs foi de: " + m + "R$");
      }	
  }
}
