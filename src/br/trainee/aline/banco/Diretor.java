package br.trainee.aline.banco;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public boolean autentica(int senha) {
		if (this.senha != senha) {
			return false;
		}
		return true;
	}

	@Override
	double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * // verifica aqui se a senha confere com a recebida como parametro public
	 * boolean autentica(int senha) {
	 * 
	 * if (this.senha == senha) { System.out.println("Acesso permitido!");
	 * return true;
	 * 
	 * } else { System.out.println("Acesso negado!"); return false; } }
	 * 
	 */

}
