package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.CabanasConvert;
import com.arambalacarajo.model.CabanasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CabanasRepository;

@Service("cabanasService")
public class CabanasService {

	@Autowired
	@Qualifier("cabanasRepository")
	private CabanasRepository cr;

	@Autowired
	@Qualifier("cabanasConvert")
	private CabanasConvert cc;

	private Message m;

	public CabanasModel addCabaña(CabanasModel cm) {

	
		return cc.EntityToModel(cr.saveAndFlush(cc.ModelToEntity(cm)));
	}

	public Message deleteCabaña(CabanasModel cm) {
		m = new Message();
		cr.delete(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Cabaña Eliminado Correctamente..");
		return m;
	}

	public Message updateCabaña(CabanasModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Cabaña Update Correctamente..");
		return m;
	}

	public List<CabanasModel> listaCabaña() {

		List<CabanasModel> lcpm = new ArrayList<>();
		cr.findAll().forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}
	
	public List<CabanasModel> listaCabañaByNombre(String nombre) {

		List<CabanasModel> lcpm = new ArrayList<>();
		cr.findCabanasByNombreStartingWith(nombre).forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}


	public CabanasModel findCabañaByCod(String cod) {

		return cc.EntityToModel(cr.findCabañaByCodCabana(cod.toCharArray()));
	}

}
