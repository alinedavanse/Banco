package br.trainee.aline.banco;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	// Método que registra o total de bonificações dos funcionários
	public void registra(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	// Método que retorna o total de bonificações dos funcionários
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}
