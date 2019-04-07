package com.yokoy.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {
	
	@GetMapping({"", "/", "/vets/index", "/vets/index.html"})
	public String vetsList() {
		return "vets/index";
	}

}
