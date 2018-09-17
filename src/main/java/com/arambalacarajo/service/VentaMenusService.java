package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.VentaMenusConvert;
import com.arambalacarajo.convert.VentasConvert;
import com.arambalacarajo.model.VentaMenusModel;
import com.arambalacarajo.model.VentasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.VentaMenusRepository;

@Service("ventaMenusService")
public class VentaMenusService {

	@Autowired
	@Qualifier("ventaMenusRepository")
	private VentaMenusRepository evr;

	@Autowired
	@Qualifier("ventaMenusConvert")
	private VentaMenusConvert evc;

	@Autowired
	@Qualifier("ventasConvert")
	private VentasConvert vc;

	private Message m;

	public Message addVentaMenus(VentaMenusModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("VentaMenus Agregado Correctamente..");
		return m;
	}

	public Message deleteVentaMenus(VentaMenusModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("VentaMenus Eliminado Correctamente..");
		return m;
	}

	public Message updateVentaMenus(VentaMenusModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("VentaMenus Update Correctamente..");
		return m;
	}

	public List<VentaMenusModel> listaVentaMenus() {

		List<VentaMenusModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public VentaMenusModel findVentaMenusById(int id) {

		return evc.EntityToModel(evr.findVentaMenusByIdVentaMenu(id));
	}

	public List<VentaMenusModel> findVentaMenusByReceta(VentasModel vm) {
		List<VentaMenusModel> vmm = new ArrayList<>();

		evr.findVentaMenusByVenta(vc.ModelToEntity(vm)).forEach(t -> vmm.add(evc.EntityToModel(t)));

		return vmm;
	}

}
