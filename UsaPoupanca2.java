package br.com.fiap;

import java.util.Scanner;

public class UsaPoupanca2 {

	public static void main(String[] args) {
		
		ContaPoupanca poup = new ContaPoupanca();
		poup.setDonoConta("David");
		poup.setSaldoConta(300000.50f);
		
		ContaPoupanca poup1 = new ContaPoupanca(0, "Cris", 23000.2f);
		
		int conta = 0;
		int escolha = 0;
		
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Seja bem-vindo!"
					+ "\nDigite o número da sua conta: ");
			conta = scan.nextInt();
			
			if (conta == 1502) { 
				System.out.println("Bem vindo " + poup.getDonoConta()); 
				poup.getSaldoConta();
			} else if(conta == 1102){
				System.out.println("Bem vinda " + poup1.getDonoConta());
				poup1.getSaldoConta();
			} else {
				System.out.println("Conta não encontrada!");
			}
			
			System.out.println("\nFaça sua escolha: "
					+ "\n(1) Fazer um saque."
					+ "\n(2) Fazer um depósito.");
			escolha = scan.nextInt();
			
			if(escolha == 1) {
				System.out.println("Digite o valor: R$");
				poup.realizaSaque(scan.nextFloat());
			} else if (escolha == 2){
				System.out.println("Digite o valor: R$");
				poup.realizaDeposito(scan.nextFloat());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
