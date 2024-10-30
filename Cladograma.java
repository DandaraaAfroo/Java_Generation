package exercicio_java;

import java.util.Scanner;

public class Cladograma {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("O animal é vertebrado ou invertebrado?");
		String caracteristica1 = leitor.nextLine();

		System.out.println("O animal é Mamifero, Ave, Inseto ou Anelideo?");
		String caracteristica2 = leitor.nextLine();

		System.out.println("O animal é Onívoro, Herbívoro, Carnívoro ou Hematófago?");
		String caracteristica3 = leitor.nextLine();

		if (caracteristica1.equalsIgnoreCase("Vertebrado")) {

			if (caracteristica2.equalsIgnoreCase("Mamifero")) {

				if (caracteristica3.equalsIgnoreCase("Onivoro")) {
					System.out.println("O animal é um Homosapien");

				} else if (caracteristica3.equalsIgnoreCase("Herbivoro")) {
					System.out.println("O animal é uma Vaca");

				} else {

					System.out.println("Animal não encontrado");
				}

			} else if (caracteristica2.equalsIgnoreCase("Ave")) {
				if (caracteristica3.equalsIgnoreCase("Onivoro")) {
					System.out.println("O animal é uma Pomba");

				} else if (caracteristica3.equalsIgnoreCase("Carnivoro")) {
					System.out.println("O animal é uma Águia");

				}

			}

		}

		if (caracteristica1.equalsIgnoreCase("Invertebrado")) {
			if (caracteristica2.equalsIgnoreCase("Inseto")) {
				if (caracteristica3.equalsIgnoreCase("Hematofago")) {
					System.out.println("O animal é uma Pulga");

				} else if (caracteristica3.equalsIgnoreCase("Herbivoro")) {
					System.out.println("O animal é uma Largata");

				} else {

					System.out.println("Animal não encontrado");
				}

			} else if (caracteristica2.equalsIgnoreCase("Anelideo")) {
				if (caracteristica3.equalsIgnoreCase("Hematofago")) {
					System.out.println("O animal é uma Sanguessuga");

				} else if (caracteristica3.equalsIgnoreCase("Onivoro")) {
					System.out.println("O animal é uma Minhoca");

				} else {
					System.out.println("Animal não encontrado");
				}

			}

		}

		leitor.close();

	}

}
