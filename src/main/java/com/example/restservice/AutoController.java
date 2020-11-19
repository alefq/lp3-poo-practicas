package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uc.lp3.herencia.Auto;
import py.edu.uc.lp3.utilidades.Tracker;

@RestController
public class AutoController {
	@PostMapping("/auto")
	public Auto inscribir (@RequestBody Auto autoinscribir) throws InscripcionException {
		Auto auto= autoinscribir;
		auto.setVelocidad(50);
		if(auto.getNumeroChapa() % 2 != 0) {
			throw new InscripcionException("El numero de chapa no es par: "  + auto.getNumeroChapa());
		}
		//return new Greeting(counter.incrementAndGet(), String.format(template, name));
		Tracker.rastrear(auto);
		return auto;
	}
	@GetMapping("/auto")
	public Auto consultar (@RequestParam(value = "name", defaultValue = "World") String name) {
		Auto auto= new Auto();
		//return new Greeting(counter.incrementAndGet(), String.format(template, name));
		return auto;
	}
}
