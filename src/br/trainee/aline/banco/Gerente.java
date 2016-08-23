package br.trainee.aline.banco;

public class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionariosGerenciados;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	//Método que retorna um novo salário com bonificação de 15%
	@Override
	public double getBonificacao(){
		return this.salario * 0.15;
	}

	
	/*
	 * Método que aplica bonificação chamando super(chamando o método da classe mãe getBonificacao)
	public double getBonificacao(){
		return super.getBonificacao() + 1000;
	}
	
	*/

	//Método que autentica a senha
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}
	
	
}
