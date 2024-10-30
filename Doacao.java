package exercicio_java;

import java.util.Scanner;

public class Doacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o seu nome");
		String nome = leitor.nextLine();

		System.out.println("Digite a sua idade");
		int idade = leitor.nextInt();

		System.out.println("É a sua primeira doação? (Digite true para SIM e false para NÂO)");
		boolean primeiradoacao = leitor.nextBoolean();

		if (idade >= 18 && idade <= 69) {

			if (idade >= 60 && primeiradoacao) {
				System.out.println(nome + "você não está apto para doar sangue, pois tem entre 60 e 69 anos e é a sua primeira doação.");

			} else {

				System.out.println(nome + "você está apto para doar sangue");
			}

		} else {

			System.out.println(nome + "você não está apto para doar sangue, pois não está na faixa etária permitida");
		}

		leitor.close();
	}
}
