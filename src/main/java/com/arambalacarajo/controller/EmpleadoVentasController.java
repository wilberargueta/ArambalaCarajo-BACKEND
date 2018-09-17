package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.EmpleadoVentasModel;
import com.arambalacarajo.model.EmpleadosModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.EmpleadoVentasService;

@RestController
public class EmpleadoVentasController {

	@Autowired
	@Qualifier("empleadoVentasService")
	private EmpleadoVentasService cps;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleadoVentas", method = RequestMethod.POST)
	public Message nuevo(@RequestBody EmpleadoVentasModel cp) {

		return cps.addEmpleadoVentas(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleadoVentas", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody EmpleadoVentasModel cp) {

		return cps.updateEmpleadoVentas(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleadoVentas", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody EmpleadoVentasModel cp) {

		return cps.deleteEmpleadoVentas(cp);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleadoVentas", method = RequestMethod.GET)
	public List<EmpleadoVentasModel> lista() {

		return cps.listaEmpleadoVentas();
	}	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleadoVentas/{id}", method = RequestMethod.GET)
	public EmpleadoVentasModel byId(@PathVariable int id) {

		return cps.findEmpleadoVentasById(id);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleadoVentas/empleado", method = RequestMethod.GET)
	public List<EmpleadoVentasModel> byEmpleado(@RequestBody EmpleadosModel e) {

		return cps.listaEmpleadoVentasByEmpleado(e);
	}

}
