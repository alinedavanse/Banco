package br.trainee.aline.banco;

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
