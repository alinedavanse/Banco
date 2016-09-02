package br.trainee.aline.banco;

public class FuncionarioAutenticavel extends Funcionario {

	public boolean autentica(int senha) {
		// faz autenticacao padrão
		if (this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}

	}

	@Override
	double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}