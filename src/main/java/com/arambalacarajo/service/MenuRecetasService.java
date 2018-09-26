package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.MenuRecetasConvert;
import com.arambalacarajo.convert.MenusConvert;
import com.arambalacarajo.model.MenuRecetasModel;
import com.arambalacarajo.model.MenusModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.MenuRecetasRepository;

@Service("menuRecetasService")
public class MenuRecetasService {

	@Autowired
	@Qualifier("menuRecetasRepository")
	private MenuRecetasRepository evr;

	@Autowired
	@Qualifier("menuRecetasConvert")
	private MenuRecetasConvert evc;

	@Autowired
	@Qualifier("menusConvert")
	private MenusConvert mc;

	private Message m;

	public MenuRecetasModel addMenuRecetas(MenuRecetasModel em) {
	
		
		
		return evc.EntityToModel(evr.save(evc.ModelToEntity(em)));
	}

	public Message deleteMenuRecetas(MenuRecetasModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("MenuRecetas Eliminado Correctamente..");
		return m;
	}
	

	public Message deleteMenuRecetasByMenu(MenusModel mm) {
		m = new Message();
		evr.deleteMenuRecetaBymenu(mc.ModelToEntity(mm));
		m.setStatus(HttpStatus.OK);
		m.setMessage("MenuRecetas Eliminado Correctamente..");
		return m;
	}
	public Message updateMenuRecetas(MenuRecetasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("MenuRecetas Update Correctamente..");
		return m;
	}

	public List<MenuRecetasModel> listaMenuRecetas() {

		List<MenuRecetasModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public MenuRecetasModel findMenuRecetasById(int id) {

		return evc.EntityToModel(evr.findMenuRecetaByIdMenuReceta(id));
	}

	public List<MenuRecetasModel> findMenuRecetaByMenu(MenusModel mm) {
		List<MenuRecetasModel> mL = new ArrayList<>();

		evr.findMenuRecetaByMenu(mc.ModelToEntity(mm)).forEach(ss -> mL.add(evc.EntityToModel(ss)));

		return mL;
	}

}
