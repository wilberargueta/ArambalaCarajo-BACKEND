package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.MenuServicioConvert;
import com.arambalacarajo.convert.MenusConvert;
import com.arambalacarajo.model.MenuServicioModel;
import com.arambalacarajo.model.MenusModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.MenuServicioRepository;

@Service("menuServicioService")
public class MenuServicioService {

	@Autowired
	@Qualifier("menuServicioRepository")
	private MenuServicioRepository cr;

	@Autowired
	@Qualifier("menuServicioConvert")
	private MenuServicioConvert cc;

	@Autowired
	@Qualifier("menusConvert")
	private MenusConvert ec;

	private Message m;

	public Message addMenuServicio(MenuServicioModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("MenuServicio Agregado Correctamente..");
		return m;
	}

	public Message deleteMenuServicio(MenuServicioModel cm) {
		m = new Message();
		cr.delete(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("MenuServicio Eliminado Correctamente..");
		return m;
	}

	public Message updateMenuServicio(MenuServicioModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("MenuServicio Update Correctamente..");
		return m;
	}

	public List<MenuServicioModel> listaMenuServicio() {

		List<MenuServicioModel> lcpm = new ArrayList<>();
		cr.findAll().forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}

	public MenuServicioModel findMenuServicioById(int id) {

		return cc.EntityToModel(cr.findMenuServicioByIdMenuServicio(id));
	}

	public List<MenuServicioModel> listaByMenu(MenusModel em) {

		List<MenuServicioModel> lcpm = new ArrayList<>();
		cr.findMenuServicioByMenu(ec.ModelToEntity(em)).forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}

}
