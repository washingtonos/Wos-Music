package com.br.wosapp.wosMusic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class IndexController {

	@RequestMapping("/Index")
	public String Index(){
		return "Index";
	}
}
