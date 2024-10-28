package exercicio_java; //
import java.util.Scanner;
public class Salarioliquido {

	public static void main(String[] args) {
		
		float liquido = 0;
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite o Salário Bruto: ");
		float bruto = leitor.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		float adicional = leitor.nextFloat();
		
		System.out.print("Digite as horas extras: ");
		float extra = leitor.nextFloat();
		
		System.out.print("Digite os descontos: ");
		float descontos = leitor.nextFloat();
		
		liquido = (bruto + adicional + (extra * 5)) - descontos;
		
		System.out.println("O salário liquido é:" + liquido);
		
		leitor.close();
		
	}

}
