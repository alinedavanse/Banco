package br.trainee.aline.banco;

public class Cliente implements Autenticavel {

	protected String nome;
	protected String cpf;
	protected double salario;
	int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha != senha) {
			return false;
		}
		return true;
	}

	/*
	 * public boolean autentica(int senha) { if (this.senha == senha) {
	 * System.out.println("Acesso permitido!"); return true; } else
	 * System.out.println("Acesso negado!"); return false; }
	 * 
	 */

}
