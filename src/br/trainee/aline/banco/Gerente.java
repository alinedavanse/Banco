package br.trainee.aline.banco;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	int numeroDeFuncionariosGerenciados;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	// M�todo que retorna um novo sal�rio com bonifica��o de 15%
	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha != senha) {
			return false;
		}
		return true;
	}

	/*
	 * M�todo que aplica bonifica��o chamando super(chamando o m�todo da classe
	 * m�e getBonificacao) public double getBonificacao(){ return
	 * super.getBonificacao() + 1000; }
	 * 
	 */

	/*
	 * //M�todo que autentica a senha public boolean autentica(int senha) { if
	 * (this.senha == senha) { System.out.println("Acesso permitido"); return
	 * true; } else { System.out.println("Acesso negado"); return false; }
	 * 
	 */
}
