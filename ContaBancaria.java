package exercicio_java;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		float saldo = 1000;
		float saldofinal = 0;
		Scanner leitor = new Scanner (System.in);

		System.out.println("Para consultar o seu saldo: Digite 1");
		System.out.println("Para consultar o seu saque: Digite 2");
		System.out.println("Para consultar o seu depósito: Digite 3");
		int acao = leitor.nextInt();
		
		switch(acao) {
		
		case 1:
			System.out.println("Seu saldo é: " + saldo);
			break;
			
		case 2:
			
			System.out.println("Digite o valor que deseja sacar: ");
			float saque = leitor.nextFloat();
			
			if(saque <= 1000) {
				saldofinal = saldo - saque;
				System.out.println("Seu saldo atual é: " + saldofinal);
				
			}else{
				
				System.out.println("Seu saldo é insuficiente! ");
			}
			break;
			
		case 3:
			System.out.println("Digite o valor que deseja depositar: ");
			float deposito = leitor.nextFloat();
			
			saldofinal = saldo + deposito;
			System.out.println("Seu saldo atual é: " + saldofinal);
			break;
			
			default:
				
				System.out.print("Operação invalida");
				return;
		}
		
			leitor.close();
	}

}
