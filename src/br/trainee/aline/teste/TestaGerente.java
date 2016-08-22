package br.trainee.aline.teste;

import br.trainee.aline.banco.Funcionario;
import br.trainee.aline.banco.Gerente;

public class TestaGerente {

	public static void main(String[] args) {

		System.out.println("-----------------------------------");

		Gerente gerente = new Gerente();
		gerente.setSalario(5000.0);
		System.out.println("Salario: " + gerente.getBonificacao());

		// podemos chamar métodos do Funcionario:
		gerente.setNome("Bruno");
		System.out.println("Nome: " + gerente.getNome());

		// e também métodos do Gerente!
		gerente.setSenha(12345);
		System.out.println("Senha: " + gerente.autentica(12345));

		System.out.println("-----------------------------------");

		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(5000.0);
		System.out.println("Salario: " + funcionario.getBonificacao());

		funcionario.setNome("Aline");
		System.out.println("Nome: " + funcionario.getNome());

	}

}
