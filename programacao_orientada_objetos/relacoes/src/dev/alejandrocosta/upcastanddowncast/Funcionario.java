package dev.alejandrocosta.upcastanddowncast;

public class Funcionario
{
    private String nome;
    private double salario;
    
    Funcionario(String nome, double salario)
    {
    	this.nome = nome;
    	this.salario = salario;
    }
    
    public String getNome()
    {
    	return this.nome;
    }
    
    public double getSalario()
    {
    	return this.salario;
    }
    
    public void getFuncao()
    {
    	System.out.println(this.getNome() + " - Funcionário");
    }
}
