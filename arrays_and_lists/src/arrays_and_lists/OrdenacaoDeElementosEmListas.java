package arrays_and_lists;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoDeElementosEmListas {

	public static void main(String[] args) {
		
        System.out.println("Criando uma lista com os dados de meus gatos...");
      //Nunca esquecer de incluir o diamond operator. Vamos utilizar duas chaves após a criação da lista, para já incluir as instâncias de Gato na lista.
        List<Gato> gatos = new ArrayList<>()
        {{
        	    add(new Gato("Sun", 7, "pastel"));
        	    add(new Gato("Bella", 4, "preto e branco"));
        	    add(new Gato("Shine", 2, "tigrado"));
        	    add(new Gato("Lis", 1, "branco, amarelo, rajado"));
        	    add(new Gato("Jour", 1, "branco e marrom"));
        	    add(new Gato("Pan", 1, "branco e preto"));
        }};
        System.out.println();
       
        System.out.println("Imprimindo na ordem de inserção:");
        System.out.println(gatos); //A ordem de inserção já é a original da List.
        System.out.println();
        System.out.println("Imprimindo em ordem aleatória:");
        Collections.shuffle(gatos); // Não existe método na List para ordem aleatória, mas podemos utilizar um método para embaralhar as instâncias dentro de uma collection. O método pertence a classe Colections.
        System.out.println(gatos);
        System.out.println();

        System.out.println("Imprimindo em ordem natural. Vamos utilizar os nomes para ordenar.");
        // Existe um método .sort() em List, mas ele ordena de acordo com um Comparator e nós utilizamos um Comparable. No nosso caso, vamos utilizar o método .sort() de Collections. Esse método tem uma assinatura que só receve a lista e, nesse caso, ele utiliza um Comparable.
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println();
        
        // Ordenação utilizando um Comparator
        System.out.println("Imprimindo em ordem de idade:");
        // Podemos utilizar o método de List ou o de Collections
        Collections.sort(gatos, new ComparatorIdade());
        
        
        
	
	}
	
}
	
	
	
	
class Gato implements Comparable<Gato> //Comparable é uma interface
{

	private String nome;
	private int idade;
	private String cor;
		
	public Gato(String nome, int idade, String cor)
	{
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "[nome = " + nome + ", idade = " + idade + ", cor = " + cor + "]";
	}
	
	// Implementando método da interface Comparable<>
	@Override
	public int compareTo(Gato gato) {
		
		// .compareToIgnoreCase() é um método da String. O resultado pode ser -1, 0 ou 1. -1 significa que o nome que está sendo comparado é menor que o outro. 0 significa que é igual. 1 significa que é maior.
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}


class ComparatorIdade implements Comparator<Gato>
{
	@Override
	public int compare(Gato gatoUm, Gato gatoDois)
	{
		return Integer.compare(gatoUm.getIdade(), gatoDois.getIdade());
	}
}
