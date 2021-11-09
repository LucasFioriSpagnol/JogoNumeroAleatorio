package Principal;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();

		Scanner sc = new Scanner(System.in);

		int valor = 0;
		int tentativas = 0;
		int nr = rand.nextInt(49);
		nr = nr + 1;

		System.out.println("numero sortedo " + nr);

		while (valor != nr) {
			System.out.println("Descubra o numero sorteado !!");
			valor = sc.nextInt();
			if (valor < nr) {
				System.out.println("Valor maior !!, TENTE NOVAMENTE");
				tentativas++;
			} else if (valor > nr) {
				System.out.println("Valor menor !!, TENTE NOVAMENTE");
				tentativas++;
			} else {
				System.out.println("Parabens miseravii, acertou");
				tentativas++;
				System.out.println("Numero de tentativas " + tentativas);
			}
		}
	}
}
