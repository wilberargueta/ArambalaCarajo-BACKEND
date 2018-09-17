package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.MenusConvert;
import com.arambalacarajo.model.MenusModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.MenusRepository;

@Service("menusService")
public class MenusService {

	@Autowired
	@Qualifier("menusRepository")
	private MenusRepository evr;

	@Autowired
	@Qualifier("menusConvert")
	private MenusConvert evc;

	private Message m;

	public Message addMenus(MenusModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Menus Agregado Correctamente..");
		return m;
	}

	public Message deleteMenus(MenusModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Menus Eliminado Correctamente..");
		return m;
	}

	public Message updateMenus(MenusModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Menus Update Correctamente..");
		return m;
	}

	public List<MenusModel> listaMenus() {

		List<MenusModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public MenusModel findMenusById(int id) {

		return evc.EntityToModel(evr.findMenusByIdMenu(id));
	}

}
