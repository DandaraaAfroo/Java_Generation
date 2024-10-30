package exercicio_java;

import java.util.Scanner;

public class ReajusteSwitch {

	public static void main(String[] args) {

		float reajuste = 0;
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = leitor.nextLine();

		System.out.println("Cargo: Gerente - digite 1");
		System.out.println("Cargo: Vendedor - digite 2");
		System.out.println("Cargo: Supervisor - digite 3");
		System.out.println("Cargo: Motorista - digite 4");
		System.out.println("Cargo: Estoquista - digite 5");
		System.out.println("Cargo: Técnico em TI - digite 6");
		int cargo = leitor.nextInt();

		switch (cargo) {

		case 1:
			System.out.println("Digite o seu salário:");
			int gerente = leitor.nextInt();
			reajuste = gerente + ((gerente * 10) / 100);
			break;

		case 2:
			System.out.println("Digite o seu salário:");
			int vendedor = leitor.nextInt();
			reajuste = vendedor + ((vendedor * 7) / 100);
			break;

		case 3:
			System.out.println("Digite o seu salário:");
			int supervisor = leitor.nextInt();
			reajuste = supervisor + ((supervisor * 9) / 100);
			break;

		case 4:
			System.out.println("Digite o seu salário:");
			int motorista = leitor.nextInt();
			reajuste = motorista + ((motorista * 6) / 100);
			break;

		case 5:
			System.out.println("Digite o seu salário:");
			int estoquista = leitor.nextInt();
			reajuste = estoquista + ((estoquista * 5) / 100);
			break;

		case 6:
			System.out.println("Digite o seu salário:");
			int tecnico = leitor.nextInt();
			reajuste = tecnico + ((tecnico * 8) / 100);
			break;

		default:
			System.out.println("Cargo inválido");
			return;

		}

		System.out.println(nome + ", o seu novo salário é: " + reajuste);
		leitor.close();
	}
}
