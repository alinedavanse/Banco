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
	
	@Override
	public double getBonificacao(){
		return this.salario * 0.15;
	}

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
