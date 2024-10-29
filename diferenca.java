package exercicio_java;//Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4.
import java.util.Scanner;
public class diferenca {

	public static void main(String[] args) {
		
		float diferenca = 0;
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite o valor A1: ");
		float a1 = leitor.nextFloat();
		
		System.out.print("Digite o valor A2: ");
		float a2 = leitor.nextFloat();
		
		System.out.print("Digite o valor de B1: ");
		float a3 = leitor.nextFloat();
		
		System.out.print("Digite o valor B2: ");
		float a4 = leitor.nextFloat();
		
		diferenca = (a1 * a2) - (a3 * a4);

		System.out.println("A diferença é: " + diferenca);
		
		leitor.close();
		
	}

}
