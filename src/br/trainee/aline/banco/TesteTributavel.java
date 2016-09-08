package br.trainee.aline.banco;

import br.trainee.aline.banco.ContaCorrente;
import br.trainee.aline.banco.SeguroDeVida;

public class TesteTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());

		SeguroDeVida sg = new SeguroDeVida();
		System.out.println(sg.calculaTributos());

		// Testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}
}
