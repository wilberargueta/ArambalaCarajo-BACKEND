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

import com.arambalacarajo.model.EmpleadosModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.EmpleadosService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadosController {


	@Autowired
	@Qualifier("empleadosService")
	private EmpleadosService cps;

	@PostMapping
	public EmpleadosModel nuevo(@RequestBody EmpleadosModel cp) {
		cp.setCreado(LocalDate.now());
		cp.setActualizado(LocalDate.now());
		return cps.addEmpleado(cp);
	}

	@PostMapping("/update")
	public Message actualizar(@RequestBody EmpleadosModel cp) {
		return cps.updateEmpleado(cp);
	}

	@PostMapping("/delete")
	public Message eliminar(@RequestBody EmpleadosModel cp) {

		return cps.deleteEmpleado(cp);
	}

	@GetMapping
	public List<EmpleadosModel> lista() {
		return cps.listaEmpleados();
	}

	@GetMapping("/nombre/{nombre}")
	public List<EmpleadosModel> listaByNombre(@PathVariable String nombre) {
		return cps.listaEmpleadosByNombre(nombre);
	}

	@GetMapping("/{cod}")
	public EmpleadosModel byId(@PathVariable String cod) {

		return cps.findEmpleadoByCod(cod);
	}

	@GetMapping("/activos")
	public List<EmpleadosModel> listaEmpleadosActivos() {
		return cps.empleadosActivos();
	}

	@GetMapping("/desactivados")
	public List<EmpleadosModel> listaEmpleadosNoActivos() {
		return cps.empleadosNoActivos();
	}
}
