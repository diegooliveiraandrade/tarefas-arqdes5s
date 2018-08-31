package br.usjt.arqdes16.cadastra_filme_si3an_bua.controller;

import org.springframework.stereotype.Controller;

import br.usjt.arqdes16.cadastra_filme_si3an_bua.model.Filmes;

@Controller
public class MostrarFilme {
	
	public String mostraFilme(Filmes filmes) {
		
			
		return "cadastroFilme";
		
	}
}
