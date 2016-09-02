package br.trainee.aline.banco;

public class ContaPouponca extends Conta {

	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}
}
