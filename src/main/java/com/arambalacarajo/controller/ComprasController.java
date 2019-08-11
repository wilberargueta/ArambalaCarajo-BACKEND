package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.ComprasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.model.ProveedoresModel;
import com.arambalacarajo.service.ComprasService;

@RestController
@RequestMapping("/api/compras")
public class ComprasController {

	@Autowired
	@Qualifier("comprasService")
	private ComprasService cps;

	@PostMapping
	public ComprasModel nuevo(@RequestBody ComprasModel cp) {

		return cps.addCompra(cp);
	}

	@PostMapping("/update")
	public Message actualizar(@RequestBody ComprasModel cp) {

		return cps.updateCompra(cp);
	}

	@PostMapping("/delete")
	public Message eliminar(@RequestBody ComprasModel cp) {

		return cps.deleteCompra(cp);
	}

	@GetMapping
	public List<ComprasModel> lista() {

		return cps.listaCompras();
	}

	@GetMapping("/{id}")
	public ComprasModel byId(@PathVariable int id) {

		return cps.findCompraById(id);
	}

	@GetMapping("/registro/{reg}")
	public ComprasModel byRegistro(@PathVariable String reg) {

		return cps.findCompraByR(reg);
	}

	@GetMapping("/proveedor")
	public List<ComprasModel> byEmpleado(@RequestBody ProveedoresModel em) {

		return cps.listaByProveedor(em);
	}

}
