package com.br.wosapp.wosMusic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.wosapp.wosMusic.dao.ProfessorRepository;
import com.br.wosapp.wosMusic.models.Professor;

@Controller
public class ProfessorController {

	@Autowired
	private ProfessorRepository pr;
	
	@RequestMapping(value="/cadastrarProfessor", method=RequestMethod.GET)
	public String form(){
		return "evento/formProfessor";
	}
	
	@RequestMapping(value="/cadastrarProfessor", method=RequestMethod.POST)
	public String form(Professor professor){
		pr.save(professor);
		return "redirect:/cadastrarProfessor";
	}

}
