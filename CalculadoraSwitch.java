package exercicio_java;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {

		float calculo = 0;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		float valor1 = leitor.nextFloat();

		System.out.println("Digite o segundo valor");
		float valor2 = leitor.nextFloat();

		System.out.println("Operação: Soma - Digite 1: ");
		System.out.println("Operação: Subtração - Digite 2: ");
		System.out.println("Operação: Multiplicação - Digite 3: ");
		System.out.println("Operação: Divisão - Digite 4: ");
		int operacao = leitor.nextInt();

		switch (operacao) {

		case 1:

			calculo = valor1 + valor2;
			break;

		case 2:

			calculo = valor1 - valor2;
			break;

		case 3:

			calculo = valor1 * valor2;
			break;

		case 4:

			calculo = valor1 / valor2;
			break;

		default:
			System.out.println("Operação invalida");
			return;
		}

		System.out.println("O valor da operação é:" + calculo);
		leitor.close();
	}

}
