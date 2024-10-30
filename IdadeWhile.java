package exercicio_java;

import java.util.Scanner;

public class IdadeWhile {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int menor21 = 0;
		int maior50 = 0;

		System.out.println("Digite a sua idade (Idade negativa caso deseja sair)");

		while (true) {

			int idade = leitor.nextInt();//rode a variavel sempre dentro do loop

			if (idade < 0) {
				break;

			}
			if (idade < 21) {
				menor21++;

			} else if (idade > 50) {
				maior50++;

			}

		}

		System.out.println("Total de pessoas menores que 21 anos:" + menor21);//rode os resultados sempre fora do loop
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

		leitor.close();
	}

}
