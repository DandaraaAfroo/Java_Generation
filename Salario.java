package exercicio_java;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o valor do salário: ");
		float salario = leitor.nextFloat();

		System.out.println("Digite o valor do abono: ");
		float abono = leitor.nextFloat();

		float novosalario = salario + abono;
		System.out.println("O novo salário é:" + novosalario);

		leitor.close();
	}

}
