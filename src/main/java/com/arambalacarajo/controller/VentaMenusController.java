package com.arambalacarajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.model.VentaMenusModel;
import com.arambalacarajo.model.VentasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.service.VentaMenusService;

@RestController
public class VentaMenusController {

	@Autowired
	@Qualifier("ventaMenusService")
	private VentaMenusService cps;

	@RequestMapping(path = "/api/ventaMenus", method = RequestMethod.POST)
	public Message nuevo(@RequestBody VentaMenusModel cp) {

		return cps.addVentaMenus(cp);
	}

	@RequestMapping(path = "/api/ventaMenus", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody VentaMenusModel cp) {

		return cps.updateVentaMenus(cp);
	}

	@RequestMapping(path = "/api/ventaMenus", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody VentaMenusModel cp) {

		return cps.deleteVentaMenus(cp);
	}

	@RequestMapping(path = "/api/ventaMenus", method = RequestMethod.GET)
	public List<VentaMenusModel> lista() {

		return cps.listaVentaMenus();
	}

	@RequestMapping(path = "/api/ventaMenus/{id}", method = RequestMethod.GET)
	public VentaMenusModel byId(@PathVariable int id) {

		return cps.findVentaMenusById(id);
	}

	@RequestMapping(path = "/api/ventaMenus/venta", method = RequestMethod.GET)
	public List<VentaMenusModel> byVenta(@RequestBody VentasModel vm) {

		return cps.findVentaMenusByReceta(vm);
	}

}
