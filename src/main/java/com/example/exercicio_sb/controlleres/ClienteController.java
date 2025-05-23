package com.example.exercicio_sb.controlleres;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28,"Pedro","123.425.789-00");
	} 
	//Passar paramentros 
	@GetMapping("/qualquer/{id}")
	public Cliente obterClientePorId(@PathVariable  int id) {
		return new Cliente(id,"Maria","987.654.321-00");		
	}
	
	@GetMapping
	public Cliente obterClientePorId2(
			@RequestParam(name = "id", defaultValue = "2") int id) {
		return new Cliente(id,"jorge","418.186.186.187-15");
	}
	
	
}
