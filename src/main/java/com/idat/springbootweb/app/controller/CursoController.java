package com.idat.springbootweb.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.idat.springbootweb.app.models.Curso;

@Controller
public class CursoController 
{
	@RequestMapping(value="/curso")
	public String Curso(Model model)
	{
		List<Curso> curso = new ArrayList<>();
		curso.add(new Curso(1, "AEA"));
		curso.add(new Curso(1, "Hola"));
		model.addAttribute("titulo", "Listado de Cursos");
		model.addAttribute("curso", curso);
		return "curso";
	}

}
