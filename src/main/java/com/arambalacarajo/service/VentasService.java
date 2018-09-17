package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.VentasConvert;
import com.arambalacarajo.model.VentasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.VentasRepository;

@Service("ventasService")
public class VentasService {

	@Autowired
	@Qualifier("ventasRepository")
	private VentasRepository evr;

	@Autowired
	@Qualifier("ventasConvert")
	private VentasConvert evc;

	@Autowired
	@Qualifier("ventasConvert")
	private VentasConvert vc;

	private Message m;

	public Message addVentas(VentasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Ventas Agregado Correctamente..");
		return m;
	}

	public Message deleteVentas(VentasModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Ventas Eliminado Correctamente..");
		return m;
	}

	public Message updateVentas(VentasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Ventas Update Correctamente..");
		return m;
	}

	public List<VentasModel> listaVentas() {

		List<VentasModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public VentasModel findVentasById(int id) {

		return evc.EntityToModel(evr.findVentasByIdVenta(id));
	}

}
