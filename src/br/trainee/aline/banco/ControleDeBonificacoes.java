package br.trainee.aline.banco;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	// M�todo que registra o total de bonifica��es dos funcion�rios
	public void registra(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	// M�todo que retorna o total de bonifica��es dos funcion�rios
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}
