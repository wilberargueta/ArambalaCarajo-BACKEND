package com.arambalacarajo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.ProductosModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.ProductosService;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {

	@Autowired
	@Qualifier("productosService")
	private ProductosService cps;


	@PostMapping
	public ProductosModel nuevo(@RequestBody ProductosModel cp) {
		cp.setActivo(true);
		cp.setActualizado(LocalDate.now());
		cp.setCreado(LocalDate.now());
		return cps.addProductos(cp);
	}

	@PostMapping("/update")
	public Message actualizar(@RequestBody ProductosModel cp) {
		cp.setActualizado(LocalDate.now());
		return cps.updateProductos(cp);
	}

	@PostMapping("/delete")
	public Message eliminar(@RequestBody ProductosModel cp) {

		return cps.deleteProductos(cp);
	}

	@GetMapping
	public List<ProductosModel> lista() {

		return cps.listaProductos();
	}

	@GetMapping("/{cod}")
	public ProductosModel byId(@PathVariable String cod) {

		return cps.findProductosByCod(cod);
	}

	@GetMapping("/nombre/{nombre}")
	public List<ProductosModel> listaByNombre(@PathVariable String nombre) {

		return cps.listaProductosByNombre(nombre);
	}

}
