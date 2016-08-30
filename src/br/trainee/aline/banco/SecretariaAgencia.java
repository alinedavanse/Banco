package br.trainee.aline.banco;

public class SecretariaAgencia extends Secretaria {

	@Override
	public double getBonificacao(){
		return this.salario * 0.40;
	}
}
