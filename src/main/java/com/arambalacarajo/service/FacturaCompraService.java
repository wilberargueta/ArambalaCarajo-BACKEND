package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.ComprasConvert;
import com.arambalacarajo.convert.FacturaCompraConvert;
import com.arambalacarajo.convert.FacturasConvert;
import com.arambalacarajo.model.ComprasModel;
import com.arambalacarajo.model.FacturaCompraModel;
import com.arambalacarajo.model.FacturasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.FacturaCompraRepository;

@Service("facturaCompraService")
public class FacturaCompraService {

	@Autowired
	@Qualifier("facturaCompraRepository")
	private FacturaCompraRepository evr;

	@Autowired
	@Qualifier("facturaCompraConvert")
	private FacturaCompraConvert evc;

	@Autowired
	@Qualifier("facturasConvert")
	private FacturasConvert fc;

	@Autowired
	@Qualifier("comprasConvert")
	private ComprasConvert cc;

	private Message m;

	public Message addFacturaCompra(FacturaCompraModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("FacturaCompra Agregado Correctamente..");
		return m;
	}

	public Message deleteFacturaCompra(FacturaCompraModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("FacturaCompra Eliminado Correctamente..");
		return m;
	}

	public Message updateFacturaCompra(FacturaCompraModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("FacturaCompra Update Correctamente..");
		return m;
	}

	public List<FacturaCompraModel> listaFacturaCompra() {

		List<FacturaCompraModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public FacturaCompraModel findFacturaCompraById(int id) {

		return evc.EntityToModel(evr.findFacturaCompraByIdFacturaCompra(id));
	}

	public FacturaCompraModel findFacturaCompraByFactura(FacturasModel fm) {

		return evc.EntityToModel(evr.findFacturaCompraByFactura(fc.ModelToEntity(fm)));
	}

	public FacturaCompraModel findFacturaCompraByCompra(ComprasModel cm) {

		return evc.EntityToModel(evr.findFacturaCompraByCompra(cc.ModelToEntity(cm)));
	}

}
