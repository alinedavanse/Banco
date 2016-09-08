package br.trainee.aline.banco;

public class SaldoInsuficienteException extends RuntimeException {

	SaldoInsuficienteException(String message) {
		super(message);
	}
}
