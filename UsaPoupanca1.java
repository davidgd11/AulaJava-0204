package br.com.fiap;

public class UsaPoupanca1 {

	public static void main(String[] args) {
		
		ContaPoupanca poup = new ContaPoupanca();
		
		poup.setNumConta(1502);
		poup.setDonoConta("David");
		poup.setSaldoConta(300000.50f);
		
		
		System.out.println("\nNúmero da conta: " + poup.getNumConta()
		+ "\nDono da conta: " + poup.getDonoConta()
		+ "\nSaldo da conta: R$" + poup.getSaldoConta());
		poup.realizaSaque(22400f);

	
		ContaPoupanca poup1 = new ContaPoupanca (1102, "Cris", 23000.2f);
	
		System.out.println("\nNúmero da conta: " + poup1.getNumConta()
		+ "\nDono da conta: " + poup1.getDonoConta()
		+ "\nSaldo da conta: R$" + poup1.getSaldoConta());
		poup1.realizaDeposito(1500f);
	
	
	

	}
}
