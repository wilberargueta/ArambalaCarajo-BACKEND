package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.RecetaProductosConvert;
import com.arambalacarajo.convert.RecetasConvert;
import com.arambalacarajo.model.RecetaProductosModel;
import com.arambalacarajo.model.RecetasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.RecetaProductosRepository;

@Service("recetaProductosService")
public class RecetaProductosService {

	@Autowired
	@Qualifier("recetaProductosRepository")
	private RecetaProductosRepository evr;

	@Autowired
	@Qualifier("recetaProductosConvert")
	private RecetaProductosConvert evc;

	@Autowired
	@Qualifier("recetasConvert")
	private RecetasConvert rc;

	private Message m;

	public RecetaProductosModel addRecetaProductos(RecetaProductosModel em) {
		 
		
		
		return evc.EntityToModel(evr.save(evc.ModelToEntity(em)));
	}

	public Message deleteRecetaProductos(RecetaProductosModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("RecetaProductos Eliminado Correctamente..");
		return m;
	}
	
	public Message deleteRecetaProductosByReceta(RecetasModel em) {
		m = new Message();
		evr.deleteRecetaProductosByReceta(rc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("RecetaProductos Eliminado Correctamente..");
		return m;
	}


	public Message updateRecetaProductos(RecetaProductosModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("RecetaProductos Update Correctamente..");
		return m;
	}

	public List<RecetaProductosModel> listaRecetaProductos() {

		List<RecetaProductosModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public RecetaProductosModel findRecetaProductosById(int id) {

		return evc.EntityToModel(evr.findRecetaProductosByIdRecetaProducto(id));
	}

	public List<RecetaProductosModel> findRecetaProductosByReceta(RecetasModel rm) {

		List<RecetaProductosModel> rL = new ArrayList<>();

		evr.findRecetaProductosByReceta(rc.ModelToEntity(rm)).forEach(ss -> rL.add(evc.EntityToModel(ss)));

		return rL;
	}

}
