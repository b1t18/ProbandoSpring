package com.idat.springbootweb.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControllerpe 
{
	//Método que permitirá crear una vista
	@RequestMapping(value = {"/servicio","/servicios"})
	public String servicio()
	{
		return "servicio";
	}
	
	@RequestMapping(value = {"/documento","/documentos"})
	public String documento()
	{
		return "documento";
	}
}
