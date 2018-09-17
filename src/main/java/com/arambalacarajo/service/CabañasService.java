package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.CabañasConvert;
import com.arambalacarajo.model.CabañasModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.CabañasRepository;

@Service("cabañasService")
public class CabañasService {

	@Autowired
	@Qualifier("cabañasRepository")
	private CabañasRepository cr;

	@Autowired
	@Qualifier("cabañasConvert")
	private CabañasConvert cc;

	private Message m;

	public Message addCabaña(CabañasModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Cabaña Agregado Correctamente..");
		return m;
	}

	public Message deleteCabaña(CabañasModel cm) {
		m = new Message();
		cr.delete(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Cabaña Eliminado Correctamente..");
		return m;
	}

	public Message updateCabaña(CabañasModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Cabaña Update Correctamente..");
		return m;
	}

	public List<CabañasModel> listaCabaña() {

		List<CabañasModel> lcpm = new ArrayList<>();
		cr.findAll().forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}

	public CabañasModel findCompraByCod(String cod) {

		return cc.EntityToModel(cr.findCabañaByCodCabana(cod.toCharArray()));
	}

}
