package exercicio_java; // Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido.
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
