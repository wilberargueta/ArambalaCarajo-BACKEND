package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.FacturasConvert;
import com.arambalacarajo.entity.TipoComprobante;
import com.arambalacarajo.model.FacturasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.FacturasRepository;

@Service("facturasService")
public class FacturasService {

	@Autowired
	@Qualifier("facturasRepository")
	private FacturasRepository evr;

	@Autowired
	@Qualifier("facturasConvert")
	private FacturasConvert evc;

	private Message m;

	public FacturasModel addFacturas(FacturasModel em) {

		return evc.EntityToModel(evr.saveAndFlush(evc.ModelToEntity(em)));
	}

	public Message deleteFacturas(FacturasModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Facturas Eliminado Correctamente..");
		return m;
	}

	public Message updateFacturas(FacturasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Facturas Update Correctamente..");
		return m;
	}

	public List<FacturasModel> listaFacturas() {

		List<FacturasModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public FacturasModel findFacturasById(int id) {

		return evc.EntityToModel(evr.findFacturaByIdFactura(id));
	}

	public FacturasModel findFacturaByNumFactura(String num) {

		return evc.EntityToModel(evr.findFacturaByNumFactura(num));
	}

	public List<FacturasModel> findFacturaByComprobante(TipoComprobante tc) {
		List<FacturasModel> lcpm = new ArrayList<>();
		evr.findFacturasByTipoComprobante(tc).forEach(e -> lcpm.add(evc.EntityToModel(e)));
		return lcpm;
	}

}
