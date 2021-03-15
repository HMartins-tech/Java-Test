import java.util.Scanner;

public class Dia25 {
    @SuppressWarnings({ "resource", "unused" })

    public static void main() {
        int nascimento, ingresso, idade, tempo, ano;
        String nome;
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = imput.nextLine();

        System.out.println("Digite o ano do seu nascimento: ");
        nascimento = imput.nextInt();

        System.out.println("Qual ano que você está fazendo esta pesquisa?");
        ano = imput.nextInt();

        System.out.println("Digite o ano que você ingressou na empresa: ");
        ingresso = imput.nextInt();

        idade = (ano - nascimento);
        tempo = (ano - ingresso);

        System.out.println("A sua idade é: " + idade);
        System.out.println("Seu tempo trabalhando na empresa: " + tempo);

        if (tempo >= 30) {
            System.out.println("Requer aposentadoria");
        }
        if (idade >= 65) {
            System.out.println("Requer aposentadoria");
        }
    }
}
