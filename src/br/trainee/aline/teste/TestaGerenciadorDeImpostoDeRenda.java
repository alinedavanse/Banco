package br.trainee.aline.teste;

import br.trainee.aline.banco.ContaCorrente;
import br.trainee.aline.banco.GerenciadorDeImpostoDeRenda;
import br.trainee.aline.banco.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);

		System.out.println(gerenciador.getTotal());
		System.out.printf("O saldo �: %.2f", cc.getSaldo());
	}
}
