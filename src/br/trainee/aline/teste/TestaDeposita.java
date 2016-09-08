package br.trainee.aline.teste;

import br.trainee.aline.banco.Conta;
import br.trainee.aline.banco.ContaPouponca;
import br.trainee.aline.banco.ValorInvalidoException;

public class TestaDeposita {

	public static void main(String[] args) {

		Conta cp = new ContaPouponca();

		try {

			cp.deposita(-100);
			System.out.println("Depósito válido");
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
