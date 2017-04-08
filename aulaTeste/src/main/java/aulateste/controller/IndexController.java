package aulateste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aulateste.ConversorDeNumeroRomano;

@Controller
public class IndexController {

	@GetMapping("/")
	@ResponseBody
	public String index(){
		return "index";
	}
	@PostMapping("/converteRomano")
	@ResponseBody
	public Integer converteRomano(String numeroRomano){
		ConversorDeNumeroRomano conversor = new ConversorDeNumeroRomano();
		return conversor.converte(numeroRomano);
	}
	
}
