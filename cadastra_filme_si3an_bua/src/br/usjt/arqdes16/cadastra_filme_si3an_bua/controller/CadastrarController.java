package br.usjt.arqdes16.cadastra_filme_si3an_bua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastrarController {

	@RequestMapping("/cadastroFilme")
	public String execute() {
		System.out.println("cadastrar");
		return "cadastroFilme";
		
	}
}
