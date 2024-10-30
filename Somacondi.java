package exercicio_java;

import java.util.Scanner;

public class Somacondi {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		float soma;

		System.out.println("Digite o valor de A: ");
		float A = leitor.nextFloat();

		System.out.println("Digite o valor de B: ");
		float B = leitor.nextFloat();

		System.out.println("Digite o valor de C: ");
		float C = leitor.nextFloat();

		soma = A + B;

		if (soma < C) {
			System.out.println("A soma de A + B é menor que C");

		} else if (soma == C) {
			System.out.println("A soma de A + B é igual que C");

		} else {
			System.out.println("A soma de A + B é maior que C");
		}

		leitor.close();
	}
}