package exercicio_java;
import java.util.Scanner;
public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float media = 0;
		Scanner leitor = new Scanner(System.in);
		
				
		System.out.print("Matemática - Digite a nota: ");
		float nota1 = leitor.nextFloat();
	
		System.out.print("Português - Digite a segunda nota: ");
		float nota2 = leitor.nextFloat();
		
		System.out.print("Geográfia - Digite a terceira nota: ");
		float nota3 = leitor.nextFloat();
		
		System.out.print("Ciências - Difite a quarta nota: ");
		float nota4 = leitor.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua média é: " +media);
		
		if (media >= 5) {
			
			System.out.println("Aluno aprovado!");
		}
		
		else {
			
			System.out.println("Aluno reprovado!");
		}
		
		leitor.close();
	
	}

}
