package exercicio_java;

import java.util.Scanner;

public class ProdutosSwitch {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int valortotal = 0;

		System.out.println("Para Cachorro quente digite: 1");
		System.out.println("Para X-Salada digite: 2");
		System.out.println("Para X-Bacon digite: 3");
		System.out.println("Para Bauru digite: 4");
		System.out.println("Para Refrigerante digite: 5");
		System.out.println("Para Suco de laranja digite: 6");
		int produto = leitor.nextInt();

		switch (produto) {

		case 1:
			System.out.println("Digite a quantidade");
			int cachorroquente = leitor.nextInt();
			valortotal = cachorroquente * 10;
			break;

		case 2:

			System.out.println("Digite a quantidade");
			int xsalada = leitor.nextInt();
			valortotal = xsalada * 15;
			break;

		case 3:
			System.out.println("Digite a quantidade");
			int xbacon = leitor.nextInt();
			valortotal = xbacon * 18;
			break;

		case 4:
			System.out.println("Digite a quantidade");
			int bauru = leitor.nextInt();
			valortotal = bauru * 12;
			break;

		case 5:
			System.out.println("Digite a quantidade");
			int refrigerante = leitor.nextInt();
			valortotal = refrigerante * 13;
			break;

		case 6:

			System.out.println("Digite a quantidade");
			int sucolaranja = leitor.nextInt();
			valortotal = sucolaranja * 8;
			break;

		default:

			System.out.print("Produto invalido");
			return;
		}

		System.out.println("O valor total é:" + valortotal);
		leitor.close();
	}
}
