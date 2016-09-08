package br.trainee.aline.banco;

public class Conta {

	private double saldo;
	private double limite;

	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor - 0.10;
		}

	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente," + "tente um valor menor");
		} else {
			this.saldo -= valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void atualiza(double taxa) {
		this.saldo = this.saldo * taxa;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
