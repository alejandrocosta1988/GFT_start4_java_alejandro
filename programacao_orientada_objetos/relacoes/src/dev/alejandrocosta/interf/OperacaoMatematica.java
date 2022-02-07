package dev.alejandrocosta.interf;

public interface OperacaoMatematica {
	
	// Nas interfaces podemos trabalhar com métodos sem as chaves, utilizando apenas a assinatura. A partir do Java 8, podemos incluir métodos default.
	// Uma interface obriga um terceiro a implementar todos os métodos contidos nela.
	public void soma(double primeiroNumero, double segundoNumero);
	
	public void subtracao(double primeiroNumero, double segundoNumero);
	
	public void multiplicacao(double primeiroNumero, double segundoNumero);
	
	public void divisao(double primeiroNumero, double segundoNumero);

}
