package com.example.exercicio_sb.controlleres;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/metodos")
public class metodosHttpController {
	
	@GetMapping(path = "/http")
	public String get() {
		return "Requesição GET";
	}
	
	@PostMapping(path = "/http")
	public String post() {
		return "Requesição POST";
	}
	
	@PutMapping(path = "/http")
	public String put() {
		return "Requesição PUT";
	} 
	
	@PatchMapping(path = "/http")
	public String patch() {
		return "Requesição PATCH";
	}
	
	@DeleteMapping(path = "/http")
	public String delete() {
		return "Requesição DELETE";
	} 
	
	
}
