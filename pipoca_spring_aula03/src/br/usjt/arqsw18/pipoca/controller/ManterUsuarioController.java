package br.usjt.arqsw18.pipoca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.arqsw18.pipoca.model.service.UsuarioService;

@Controller
public class ManterUsuarioController {
	
	private UsuarioService uService;
	
	@Autowired
	public ManterUsuarioController (UsuarioService uService) {
		this.uService = uService;
	}
	
	@RequestMapping("/fazerLogin")
	public ModelAndView fazerLogin(UsuarioService uService) {
		return null;
	}
}
