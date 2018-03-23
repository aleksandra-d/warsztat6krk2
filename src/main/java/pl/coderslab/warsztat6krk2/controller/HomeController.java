package pl.coderslab.warsztat6krk2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@GetMapping
	@ResponseBody
	public String test() {
		return "test";
	}
}
