package br.usjt.arqsw18.pipoca.model.service;

import br.usjt.arqsw18.pipoca.model.dao.FilmeDAO;
import br.usjt.arqsw18.pipoca.model.entity.Filme;

public class FilmeService {
	
	private FilmeDAO filmeDAO;
	
	public FilmeService () {
		filmeDAO = new FilmeDAO();
	}
	public int inserirFilme(Filme filme)  {				
		return filmeDAO.inserirFilme(filme);
	}

}
