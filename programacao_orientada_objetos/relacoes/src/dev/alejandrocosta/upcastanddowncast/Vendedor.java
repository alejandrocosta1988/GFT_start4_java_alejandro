package dev.alejandrocosta.upcastanddowncast;

public class Vendedor extends Funcionario
{
    private double comissao;
    
    Vendedor(String nome)
    {
    	super(nome);
    }
    
    public void setComissao(double valor)
    {
    	this.comissao = valor;
    }
    
    public double getComissao()
    {
    	return this.comissao;
    }
}
