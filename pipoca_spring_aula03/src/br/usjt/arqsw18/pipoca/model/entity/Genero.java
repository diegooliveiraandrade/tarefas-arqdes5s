package br.usjt.arqsw18.pipoca.model.entity;

import java.util.List;

import javax.persistence.OneToMany;

public class Genero {
	private int id;
	private String nome;

	@OneToMany(mappedBy = "genero")
	private List<Filme> filmes;

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Genero [id=" + id + ", nome=" + nome + "]";
	}

}
