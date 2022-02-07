package dev.alejandrocosta.association;

public class Aluno extends Pessoa
{
    private String curso;
    
    public Aluno(String nome, String rua, String cidade, String estado, String curso)
    {
    	super(nome, rua, cidade, estado);
    	this.curso = curso;
    }
}
