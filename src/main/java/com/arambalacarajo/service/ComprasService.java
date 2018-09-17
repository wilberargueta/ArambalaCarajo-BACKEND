package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.ComprasConvert;
import com.arambalacarajo.convert.ProveedoresConvert;
import com.arambalacarajo.model.ComprasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.model.ProveedoresModel;
import com.arambalacarajo.repository.ComprasRepository;

@Service("comprasService")
public class ComprasService {

	@Autowired
	@Qualifier("comprasRepository")
	private ComprasRepository cr;

	@Autowired
	@Qualifier("comprasConvert")
	private ComprasConvert cc;

	@Autowired
	@Qualifier("proveedoresConvert")
	private ProveedoresConvert ec;

	private Message m;

	public Message addCompra(ComprasModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Compra Agregado Correctamente..");
		return m;
	}

	public Message deleteCompra(ComprasModel cm) {
		m = new Message();
		cr.delete(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Compra Eliminado Correctamente..");
		return m;
	}

	public Message updateCompra(ComprasModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Compra Update Correctamente..");
		return m;
	}

	public List<ComprasModel> listaCompras() {

		List<ComprasModel> lcpm = new ArrayList<>();
		cr.findAll().forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}

	public ComprasModel findCompraById(int id) {

		return cc.EntityToModel(cr.findCompraByIdCompra(id));
	}
	
	public ComprasModel findCompraByR(String reg) {

		return cc.EntityToModel(cr.findCompraByRegistroCompra(reg.toCharArray()));
	}

	public List<ComprasModel> listaByProveedor(ProveedoresModel em) {

		List<ComprasModel> lcpm = new ArrayList<>();
		cr.findComprasByProveedor(ec.ModelToEntity(em)).forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}

}
