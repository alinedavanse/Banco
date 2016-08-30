package br.trainee.aline.banco;

public class Presidente extends Funcionario {

	@Override
	public double getBonificacao() {
      return this.salario * 0.5;
	}

}
