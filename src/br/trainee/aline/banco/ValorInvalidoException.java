package br.trainee.aline.banco;

public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(double valor){
		super("Valor inv�lido: " +valor);
	}
}
