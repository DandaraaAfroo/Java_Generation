package exercicio_java;

import java.util.Scanner;

public class IntervaloFor {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int contador = 0;

		System.out.println("Digite o menor valor:");
		int menorvalor = leitor.nextInt();

		System.out.println("Digite o maior valor:");
		int maiorvalor = leitor.nextInt();

		if (menorvalor > maiorvalor) {
			System.out.println("Intervalo inválido");

		} else {

			System.out.println("Os multiplos de 3 e 5 são:" + menorvalor + "e" + maiorvalor + ":");

			for (int i = menorvalor; i <= maiorvalor; i++) {

				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i);

				}
			}
		}
		leitor.close();
	}

}
