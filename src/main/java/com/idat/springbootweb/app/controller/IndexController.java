package com.idat.springbootweb.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.idat.springbootweb.app.models.Usuario;

@Controller
@RequestMapping(value={"/app","/"})
public class IndexController 
{
	//Método que permitirá crear una vista
	@RequestMapping(value={"/index","/"}, method=RequestMethod.GET)
	public String index(ModelMap model)
	{
		model.addAttribute("titulo", "Bienvenido(a) a Spring");
		return "index"; //index.html (Templates)
	}
	
	@RequestMapping(value= "/indice")
	public ModelAndView indice(ModelAndView mv) 
	{
		mv.addObject("concepto","Hola Spring Framework con ModelAndView");
		mv.setViewName("indice");
		return mv;
	}
	
	//Usando model:
	@RequestMapping(value="/perfil")
	public String perfil(Model model)
	{
		Usuario usuario = new Usuario();
		usuario.setNombre("Jhanns");
		usuario.setApellido("Contreras Campos");
		//usuario.setEmail("PT72649394@idat.edu.pe");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil de Usuario: ".concat(usuario.getNombre()));
		return "perfil";
	}
	
	@RequestMapping(value="/listar")
	public String lista(Model model)
	{
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("a", "aa", "123"));
		usuarios.add(new Usuario("b", "bb", "456"));
		usuarios.add(new Usuario("c", "cc", "789"));
		model.addAttribute("titulo","Listado de Usuarios");
		model.addAttribute("usuarios", usuarios);
		return "listarUsuarios";
	}
	
}
