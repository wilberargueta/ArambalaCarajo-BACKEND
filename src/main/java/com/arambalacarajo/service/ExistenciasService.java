package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.component.ConvertirMedidas;
import com.arambalacarajo.convert.ExistenciasConvert;
import com.arambalacarajo.convert.ProductosConvert;
import com.arambalacarajo.entity.Existencias;
import com.arambalacarajo.entity.RecetaProductos;
import com.arambalacarajo.model.ExistenciasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.model.ProductosModel;
import com.arambalacarajo.repository.ExistenciasRepository;

@Service("existenciasService")
public class ExistenciasService {

	@Autowired
	@Qualifier("existenciasRepository")
	private ExistenciasRepository evr;

	@Autowired
	@Qualifier("existenciasConvert")
	private ExistenciasConvert evc;

	@Autowired
	@Qualifier("productosConvert")
	private ProductosConvert pc;

	@Autowired
	@Qualifier("convertMedidas")
	ConvertirMedidas cm;

	private Message m;

	public Message addExistencias(ExistenciasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Existencias Agregado Correctamente..");
		return m;
	}

	public Message deleteExistencias(ExistenciasModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Existencias Eliminado Correctamente..");
		return m;
	}

	public Message updateExistencias(ExistenciasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Existencias Update Correctamente..");
		return m;
	}

	public List<ExistenciasModel> listaExistencias() {

		List<ExistenciasModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public ExistenciasModel findExistenciasById(int id) {

		return evc.EntityToModel(evr.findExistenciaByIdExistencias(id));
	}

	public ExistenciasModel findExistenciasByProducto(ProductosModel pm) {

		return evc.EntityToModel(evr.findExistenciasByProductos(pc.ModelToEntity(pm)));
	}

	public void incrementarStok(RecetaProductos rp) {
		Existencias stockProducto = this.evr.findExistenciasByProductos(rp.getProducto());
		stockProducto.setCantidad(stockProducto.getCantidad() + this.cm.convertir(rp));
		this.evr.save(stockProducto);

	}

	public void decrementarStok(RecetaProductos rp) {
		Existencias stockProducto = this.evr.findExistenciasByProductos(rp.getProducto());
		if (stockProducto.getCantidad() > 0.0 && stockProducto.getCantidad() > rp.getCantidad()) {
			stockProducto.setCantidad(stockProducto.getCantidad() - this.cm.convertir(rp));
			this.evr.save(stockProducto);
		} else {
			stockProducto.setCantidad(0.0);
			this.evr.save(stockProducto);
		}

	}

}
