package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.ProductosConvert;
import com.arambalacarajo.model.ProductosModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.ProductosRepository;

@Service("productosService")
public class ProductosService {

	@Autowired
	@Qualifier("productosRepository")
	private ProductosRepository evr;

	@Autowired
	@Qualifier("productosConvert")
	private ProductosConvert evc;

	private Message m;

	public ProductosModel addProductos(ProductosModel em) {

		return evc.EntityToModel(evr.save(evc.ModelToEntity(em)));
	}

	public Message deleteProductos(ProductosModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Productos Eliminado Correctamente..");
		return m;
	}

	public Message updateProductos(ProductosModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Productos Update Correctamente..");
		return m;
	}

	public List<ProductosModel> listaProductos() {

		List<ProductosModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public ProductosModel findProductosByCod(String cod) {

		return evc.EntityToModel(evr.findProductosByCodProducto(cod));
	}

	public List<ProductosModel> listaProductosByNombre(String nombre) {

		List<ProductosModel> lcpm = new ArrayList<>();
		evr.findProductosByNombreContaining(nombre).forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public List<ProductosModel> listaActivos() {
		List<ProductosModel> lcpm = new ArrayList<>();
		evr.findProductos().forEach(e -> lcpm.add(evc.EntityToModel(e)));
		return lcpm;
	}

}
