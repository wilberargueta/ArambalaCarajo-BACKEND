package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arambalacarajo.model.VentasModel;
import com.arambalacarajo.service.VentasService;

@Controller
public class CustomerController {

	@Autowired
	@Qualifier("ventasService")
	private VentasService vs;

	@ModelAttribute("ventasList")
	public List<VentasModel> ventasList() {

		return this.vs.findVentasByFechaActual();
	}

	@RequestMapping("/")
	public String verTodos(Model model) {
		return "customer";
	}

	@RequestMapping("/pdf")
	public String generarPdf(Model model) {
		return "pdfView";
	}
}
