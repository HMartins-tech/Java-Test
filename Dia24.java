import java.util.Scanner;

public class Dia24 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String nome;
        float adquirida, unico, total, totalPagar, desconto;
        @SuppressWarnings("resource")
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        nome = imput.nextLine();

        System.out.println("Digite a quantidade adquirida: ");
        adquirida = imput.nextFloat();

        System.out.println("Digite o valor da peça única: ");
        unico = imput.nextFloat();

        total = (adquirida * unico);

        if (adquirida >= 10) {
            desconto = (float) (unico * 0.1);
            totalPagar = (total - (desconto * adquirida));
            System.out.println("Você obteve um desconto de 10%, e pagará: R$" + totalPagar);
        } else {
            if (adquirida > 5) {
                desconto = (float) (unico * 0.05);
                totalPagar = (total - (desconto * adquirida));
                System.out.println("Você obteve um desconto de 5%, e pagará: R$" + totalPagar);
            } else if (adquirida <= 5) {
                desconto = (float) (unico * 0.03);
                totalPagar = (total - (desconto * adquirida));
                System.out.println("Você obteve um desconto de 3%, e pagará: R$" + totalPagar);
            }
        }
    }
}
