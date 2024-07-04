package com.bd.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MensajeControlador {
	//creamos metodo para visualizar el archivo
	@GetMapping("/mensaje")
	public String mensaje() {
		//retornamos hacia la vista
		return "mensaje";
	}

}
