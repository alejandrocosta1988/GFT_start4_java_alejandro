package dev.alejandrocosta.association;

public class Disciplina 
{
	private String nomeDoComponenteCurricular;
	//Associação do tipo: agregação. Aluno não depende de Disciplina para existir.
    private Aluno[] alunosMatriculados;
    
    public Disciplina(String nomeDoComponenteCurricular)
    {
    	this.nomeDoComponenteCurricular = nomeDoComponteCurricular;
    }
}
