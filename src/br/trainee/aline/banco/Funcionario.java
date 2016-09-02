package br.trainee.aline.banco;

abstract class Funcionario {

	protected String nome;
	protected String cpf;
	double salario;
	int senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Método que retorna novo salário com bonificação de 10%
	/*
	 * public double getBonificacao() { return this.salario * 0.10; }
	 * 
	 */

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	abstract double getBonificacao();
}
