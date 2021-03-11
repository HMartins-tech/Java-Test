import java.util.Scanner;

public class Dia21 {
	public static void main (String [] args) {
		String time, time1; 
		int gols, gols1, vencedor, empate;
		Scanner imput = new Scanner (System.in);
		
		System.out.println("Digite o nome do primeiro time: ");
		time = imput.next();
		
		System.out.println("Digite o nome do segundo time: ");
		time1 = imput.next();
		
		System.out.println("Digite o n° de gols marcados na partida pelo " + time + ":");
		gols = imput.nextInt();
		
		System.out.println("Digite o n° de gols marcados na partida pelo " + time1 + ":");
		gols1 = imput.nextInt();
		
		if (gols > gols1) {
			System.out.println("O time vencedor é: " + time);
		} else if (gols < gols1) {
			System.out.println("O time vencedor é: " + time1);
		} if (gols == gols1 ) {
			System.out.println("O jogo terminou empatado");
		}
	}
}
