package br.trainee.aline.banco;

public class SecretariaAdministrativa extends Secretaria {

	@Override
	public double getBonificacao(){
		return this.salario * 0.30;
	}
	
}
