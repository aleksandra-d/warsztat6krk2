package pl.coderslab.warsztat6krk2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping
	public String test() {
		return "home";
	}
}
