package com.example.exercicio_sb.controlleres;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "calc")
public class CalculadoraController {
	
	
		@GetMapping(path = "somar/{num1}/{num2}")	
		private String somar(@PathVariable  double num1, @PathVariable double num2) {
			return "Resultado desta operação de somar foi: "+(num1+num2);
			// TODO Auto-generated method stub

		}
		@GetMapping(path = "somar")	
		private String subtrair(@RequestParam(name = "num1", defaultValue = "1") double num1, @RequestParam(name = "num2", defaultValue = "1") double num2) {
			return "Resultado desta operação de subtrair foi: "+(num1-num2);
				
		}
		
	
	
}
