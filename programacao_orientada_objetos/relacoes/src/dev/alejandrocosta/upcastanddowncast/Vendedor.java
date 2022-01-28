package dev.alejandrocosta.upcastanddowncast;

public class Vendedor extends Funcionario
{
    private double comissao;
    
    Vendedor(String nome, double salario)
    {
    	super(nome, salario);
    }
    
    public void setComissao(double valor)
    {
    	this.comissao = valor;
    }
    
    public double getComissao()
    {
    	return this.comissao;
    }
    
    //Polymorphism
    public double getSalario()
    {
    	return super.getSalario() + this.comissao;
    }
}
