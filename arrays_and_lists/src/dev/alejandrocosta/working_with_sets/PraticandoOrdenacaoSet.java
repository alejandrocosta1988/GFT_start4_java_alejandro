package dev.alejandrocosta.working_with_sets;

import java.util.Objects;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PraticandoOrdenacaoSet {
	
	public static void  main(String args[])
	{
		System.out.println("Criando um Set e imprimindo em ordem aleatória...");
		Set<Serie> seriesEmOrdemAleatoria = new HashSet<Serie>()
		{{
		    add(new Serie("Reacher", "action", 45));
			add(new Serie("The Last Kingdom", "fiction", 45));
			add(new Serie("The Wheel of Time", "fantasy", 60));
		}};
		for (Serie serie : seriesEmOrdemAleatoria) System.out.println(serie.getNome() + ", " + serie.getGenero() + ", " + serie.getDuracaoEpisodio() + " minutos por episódio.");
		System.out.println();
		
		System.out.println("Imprimindo em ordem de inserção...");
		// Para imprimir em ordem de inserção, precisamos criar um LinkedHashSet
		Set<Serie> seriesEmOrdemDeInsercao = new LinkedHashSet<>()
				{{
					add(new Serie("Reacher", "action", 45));
					add(new Serie("The Last Kingdom", "fiction", 45));
					add(new Serie("The Wheel of Time", "fantasy", 60));
				}};
				for (Serie serie : seriesEmOrdemDeInsercao) System.out.println(serie.getNome() + ", " + serie.getGenero() + ", " + serie.getDuracaoEpisodio() + " minutos por episódio.");
				System.out.println();
				
				System.out.println("Imprimindo em ordem natural...");
				// Para imprimir em ordem natural, precisamos criar um TreeSet. Para que o TreeSet funcione, também precisamos criar um Comparable.
				Set<Serie> seriesEmOrdemNatural = new TreeSet<>(seriesEmOrdemDeInsercao);
				for (Serie serie : seriesEmOrdemNatural) System.out.println(serie.getNome() + ", " + serie.getGenero() + ", " + serie.getDuracaoEpisodio() + " minutos por episódio.");
				System.out.println();
				
				System.out.println("Imprimindo em ordem de Nome, Gênero, Duração dos episódios...");
				// Vamos utilizar um Comparator na criação do TreeSet
				Set<Serie> seriesEmOrdemEspecifica = new TreeSet<>(new ComparatorNomeGeneroDuracao());
				seriesEmOrdemEspecifica.addAll(seriesEmOrdemNatural); // método addAll() adiciona todos os elementos de uma Collection.
				for (Serie serie : seriesEmOrdemNatural) System.out.println(serie.getNome() + ", " + serie.getGenero() + ", " + serie.getDuracaoEpisodio() + " minutos por episódio.");
				System.out.println();

				
				
		
    } // método main
} // classe PraticandoOrdenacaoSet



class Serie implements Comparable<Serie>
{
	private String nome;
	private String genero;
	private int duracaoEpisodio;
	
	public Serie(String nome, String genero, int duracaoEpisodio)
	{
		this.nome = nome;
		this.genero = genero;
		this.duracaoEpisodio = duracaoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracaoEpisodio() {
		return duracaoEpisodio;
	}

	public void setDuracaoEpisodio(int duracaoEpisodio) {
		this.duracaoEpisodio = duracaoEpisodio;
	}

	@Override
	public String toString() {
		return "[nome = " + nome + ", genero = " + genero + ", duracaoEpisodio = " + duracaoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracaoEpisodio, genero, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return duracaoEpisodio == other.duracaoEpisodio && Objects.equals(genero, other.genero)
				&& Objects.equals(nome, other.nome);
	}
	
	@Override
	public int compareTo(Serie serie)
	{
		int duracaoDeEpisodio = Integer.compare(this.getDuracaoEpisodio(), serie.getDuracaoEpisodio());
		if (duracaoDeEpisodio != 0) return duracaoDeEpisodio;
		int genero = this.getGenero().compareToIgnoreCase(this.getGenero());
		if (genero != 0) return genero;
		return this.getNome().compareToIgnoreCase(serie.getNome());
	}
	
} // Serie

class ComparatorNomeGeneroDuracao implements Comparator<Serie>
{
	@Override
	public int compare(Serie umaSerie, Serie outraSerie)
	{
		int nome = umaSerie.getNome().compareToIgnoreCase(outraSerie.getNome());
		if (nome != 0) return nome;
		int genero = umaSerie.getGenero().compareToIgnoreCase(outraSerie.getGenero());
		if (genero != 0) return genero;
		return Integer.compare(umaSerie.getDuracaoEpisodio(), outraSerie.getDuracaoEpisodio());
	}
}
