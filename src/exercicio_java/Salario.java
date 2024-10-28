package exercicio_java;
import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float abono = 1000;
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.print("Digite o valor do salário: ");
		float salario = leitor.nextFloat();
		
		
		float novosalario = salario + abono;
		System.out.println("O novo salário é:" + novosalario);
		
		leitor.close();
	}

}
