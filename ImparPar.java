package exercicio_java;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite uma valor inteiro");
		int numero = leitor.nextInt();

		if (numero % 2 == 0) {

			System.out.println("O número é par e ");

		} else {

			System.out.println("O númerp é impar e");

		}

		if (numero > 0) {

			System.out.println("O numero é positivo");
		} else {

			System.out.println("O numero é negativo");
		}

		leitor.close();

	}

}
