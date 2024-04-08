package br.com.fiap;

public class ContaPoupanca {
	
	private int numConta;
	private String donoConta;
	private float saldoConta;
	
	public ContaPoupanca() {}
	
	public ContaPoupanca(int numConta, String donoConta, float saldoConta) {
		this.numConta = numConta;
		this.donoConta = donoConta;
		this.saldoConta = saldoConta;
	}

	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getDonoConta() {
		return donoConta;
	}

	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}

	public float getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(float saldoConta) {
		try {
			if(saldoConta > 0 ) {
				this.saldoConta = saldoConta;
			} else {
				throw new Exception("Valor negado!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	
	public void realizaSaque(float realizaSaque) {
		realizaSaque = saldoConta - realizaSaque;
		System.out.println("Saldo após saque: R$" + realizaSaque);
	}
	
	public void realizaDeposito(float realizaDeposito) {
		realizaDeposito = saldoConta + realizaDeposito;
		System.out.println("Saldo após depósito: R$" + realizaDeposito);
	}
	

}
