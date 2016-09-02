package br.trainee.aline.banco;

public class SistemaInterno {

	void login(FuncionarioAutenticavel fa) {
		int senha = 1234;
		boolean ok = fa.autentica(senha);

	}

	void login(Cliente c) {
		int senha = 1234;
		boolean ok = c.autentica(senha);
	}

	void login(Autenticavel a) {
        int senha = 1234;
        boolean ok = a.autentica(senha);
	}

}
