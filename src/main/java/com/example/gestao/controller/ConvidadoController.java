package com.example.gestao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.gestao.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadoController {

	//a anotação é para não precisar dar new no objeto.
	@Autowired
	//instancia a interface de repositorio
	Convidados convidados;
	
	//método para retornar pra tela, todos os candidados
	@RequestMapping("")
	public ModelAndView listar()
	{
		//referencia o método à página convidados listagem
		ModelAndView mv = new ModelAndView("ConvidadosListagem.html");
		//manda para a tela, a listagem de convidados com o nome "convidados"
		mv.addObject("convidados",convidados.findAll());
		return mv;
	}
}
