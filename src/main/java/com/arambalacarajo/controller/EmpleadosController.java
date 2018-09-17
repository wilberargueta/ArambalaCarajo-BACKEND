package com.arambalacarajo.controller;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.EmpleadosModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.EmpleadosService;

@RestController
public class EmpleadosController {

	@Autowired
	@Qualifier("empleadosService")
	private EmpleadosService cps;
	
	private final Log LOGGER = LogFactory.getLog(EmpleadosController.class); 
	
	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleados", method = RequestMethod.POST)
	public Message nuevo(@RequestBody EmpleadosModel cp) {
		cp.setCreado(LocalDate.now());
		cp.setActualizado(LocalDate.now());
		return cps.addEmpleado(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleados", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody EmpleadosModel cp) {
		
		return cps.updateEmpleado(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleados", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody EmpleadosModel cp) {

		return cps.deleteEmpleado(cp);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleados", method = RequestMethod.GET)
	public List<EmpleadosModel> lista() {
		LOGGER.info("Hola");
		return cps.listaEmpleados();
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(path = "/api/empleados/{cod}", method = RequestMethod.GET)
	public EmpleadosModel byId(@PathVariable String cod) {

		return cps.findEmpleadoByCod(cod.toCharArray());
	}

}