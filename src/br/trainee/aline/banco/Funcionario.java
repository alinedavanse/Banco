package br.trainee.aline.banco;

public class Funcionario {

	protected String nome;
	protected String cpf;
    double salario;

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


	public double getBonificacao() {
		return this.salario * 0.10;
	}

}
