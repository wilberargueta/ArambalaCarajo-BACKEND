package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.CompraProductosConvert;
import com.arambalacarajo.convert.ComprasConvert;
import com.arambalacarajo.model.CompraProductosModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CompraProductosRepository;

import com.arambalacarajo.model.ComprasModel;

@Service("compraProductosService")
public class CompraProductosService {

	@Autowired
	@Qualifier("compraProductosRepository")
	private CompraProductosRepository cpr;

	@Autowired
	@Qualifier("compraProductosConvert")
	private CompraProductosConvert cpc;

	@Autowired
	@Qualifier("comprasConvert")
	private ComprasConvert cc;

	private Message m;

	public CompraProductosModel addCompraProducto(CompraProductosModel cp) {
		
		return cpc.EntityToModel(cpr.save(cpc.ModelToEntity(cp)));
	}

	public Message deleteCompraProducto(CompraProductosModel cp) {
		m = new Message();
		cpr.delete(cpc.ModelToEntity(cp));
		m.setStatus(HttpStatus.OK);
		m.setMessage("CompraProductos Eliminado Correctamente..");
		return m;
	}
	public Message deleteCompraProductoByCompra(ComprasModel cp) {
		m = new Message();
		cpr.deleteCompraProductosByCompras(cc.ModelToEntity(cp));
		m.setStatus(HttpStatus.OK);
		m.setMessage("CompraProductos Eliminado Correctamente..");
		return m;
	}

	public Message updateCompraProducto(CompraProductosModel cp) {
		m = new Message();
		cpr.save(cpc.ModelToEntity(cp));
		m.setStatus(HttpStatus.OK);
		m.setMessage("CompraProductos Update Correctamente..");
		return m;
	}

	public List<CompraProductosModel> listaCompraProductos() {

		List<CompraProductosModel> lcpm = new ArrayList<>();
		cpr.findAll().forEach(p -> lcpm.add(cpc.EntityToModel(p)));

		return lcpm;
	}

	public CompraProductosModel findCompraProductosById(int id) {

		return cpc.EntityToModel(cpr.findCompraByidCompraProducto(id));
	}

	public List<CompraProductosModel> listaByCompra(ComprasModel cm) {

		List<CompraProductosModel> lcpm = new ArrayList<>();
		cpr.findByCompras(cc.ModelToEntity(cm)).forEach(c -> lcpm.add(cpc.EntityToModel(c)));

		return lcpm;
	}
	

}
