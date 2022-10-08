package com.idat.springbootweb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.idat.springbootweb.app.models.domain.*;

@Controller
public class FormController 
{
	@GetMapping("/form")
	public String form(Model model) 
	{
		model.addAttribute("titulo", "Formulario de Usuario");
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar(Model model, 
						   @RequestParam(name="usuario") String usuario,
						   @RequestParam String pass ,
	   					   @RequestParam String email)
	{
		Usuario user = new Usuario();
		user.setEmail(email);
		user.setUsuario(usuario);
		user.setPass(pass);
		
		model.addAttribute("titulo", "Resultado Form");
		model.addAttribute("user", user);
		//model.addAttribute("usuario", usuario);
		//model.addAttribute("pass", pass);
		//model.addAttribute("email", email);
		return "resultado";
	}

}
