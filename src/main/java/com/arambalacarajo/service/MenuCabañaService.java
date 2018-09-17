package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.MenuCabañaConvert;
import com.arambalacarajo.model.MenuCabañaModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.MenuCabañaRepository;

@Service("menuCabañaService")
public class MenuCabañaService {

	@Autowired
	@Qualifier("menuCabañaRepository")
	private MenuCabañaRepository cr;

	@Autowired
	@Qualifier("menuCabañaConvert")
	private MenuCabañaConvert cc;

	private Message m;

	public Message addMenuCabaña(MenuCabañaModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage(" MenuCabaña Agregado Correctamente..");
		return m;
	}

	public Message deleteMenuCabaña(MenuCabañaModel cm) {
		m = new Message();
		cr.delete(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage(" MenuCabaña Eliminado Correctamente..");
		return m;
	}

	public Message updateMenuCabaña(MenuCabañaModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage(" MenuCabaña Update Correctamente..");
		return m;
	}

	public List<MenuCabañaModel> listaMenuCabaña() {

		List<MenuCabañaModel> lcpm = new ArrayList<>();
		cr.findAll().forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}

	public MenuCabañaModel findCompraById(int id) {

		return cc.EntityToModel(cr.findMenuCabañaByIdCabañaMenu(id));
	}

}
