package br.trainee.aline.teste;

import br.trainee.aline.banco.ControleDeBonificacoes;

import br.trainee.aline.banco.Gerente;
import br.trainee.aline.banco.Presidente;
import br.trainee.aline.banco.Secretaria;
import br.trainee.aline.banco.SecretariaAdministrativa;
import br.trainee.aline.banco.SecretariaAgencia;

public class TestaGerente {

	public static void main(String[] args) {

		// Cria um controle controle
		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		// Cria o gerente funcinario1
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);

		System.out.println("Bonificação Gerente: " + funcionario1.getBonificacao());

		Presidente funcionaro2 = new Presidente();
		funcionaro2.setSalario(5000.0);
		controle.registra(funcionaro2);

		System.out.println("Bonificação Presidente: " + funcionaro2.getBonificacao());

		SecretariaAgencia sag = new SecretariaAgencia();
		sag.setSalario(5000.0);
		controle.registra(sag);

		System.out.println("Secretaria Agência: " + sag.getBonificacao());

		SecretariaAdministrativa sad = new SecretariaAdministrativa();
		sad.setSalario(5000.0);
		controle.registra(sad);

		System.out.println("Secretaria Administrativa: " + sad.getBonificacao());
		
		Secretaria s = new Secretaria();
        s.setSalario(5000.0);
        controle.registra(s);

        System.out.println("Secretaria: " + s.getBonificacao());
        
		System.out.println("-----------------------------------");

		// Verifica se a senha está correta
		funcionario1.setSenha(12345);
		System.out.println("Senha: " + funcionario1.autentica(12345));

	}

}
