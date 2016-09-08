package br.trainee.aline.teste;

import br.trainee.aline.banco.Conta;
import br.trainee.aline.banco.ContaCorrente;
import br.trainee.aline.banco.ContaPouponca;
import br.trainee.aline.banco.SaldoInsuficienteException;

public class TesteConta {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		cc.deposita(10);

		try {
			cc.saca(9);
			System.out.println("Saldo suficiente");
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}

}
