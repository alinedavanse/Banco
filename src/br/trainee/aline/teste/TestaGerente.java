package br.trainee.aline.teste;

import br.trainee.aline.banco.ControleDeBonificacoes;
import br.trainee.aline.banco.Funcionario;
import br.trainee.aline.banco.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		//Cria um controle controle
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		//Cria o gerente funcinario1
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);
		
		//Cria o funcion�rio funcionario2
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000.0);
		controle.registra(funcionario2);
		
		System.out.println("Total de bonifica��o (Funcionario e Gerente): " +controle.getTotalDeBonificacoes());
		System.out.println("Bonifica��o Gerente: " +funcionario1.getBonificacao());
		System.out.println("Bonifica��o Funcion�rio: " +funcionario2.getBonificacao());
		

		
		System.out.println("-----------------------------------");
		
		// Verifica se a senha est� correta
		funcionario1.setSenha(12345);
		System.out.println("Senha: " + funcionario1.autentica(12345));

		

	}

}
