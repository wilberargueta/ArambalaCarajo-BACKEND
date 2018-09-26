package com.arambalacarajo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.arambalacarajo.convert.MenuCabanaConvert;
import com.arambalacarajo.convert.MenusConvert;
import com.arambalacarajo.model.MenuCabanaModel;
import com.arambalacarajo.model.MenusModel;
import com.arambalacarajo.model.Message;
import com.arambalacarajo.repository.MenuCabanaRepository;

@Service("menuCabanaService")
public class MenuCabanaService {

	@Autowired
	@Qualifier("menuCabanaRepository")
	private MenuCabanaRepository cr;

	@Autowired
	@Qualifier("menuCabanaConvert")
	private MenuCabanaConvert cc;
	
	@Autowired
	@Qualifier("menusConvert")
	private MenusConvert mc;

	private Message m;

	public MenuCabanaModel addMenuCabaña(MenuCabanaModel cm) {
	
		return 	cc.EntityToModel(cr.saveAndFlush(cc.ModelToEntity(cm)));
	}

	public Message deleteMenuCabaña(MenuCabanaModel cm) {
		m = new Message();
		cr.delete(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage(" MenuCabaña Eliminado Correctamente..");
		return m;
	}
	public Message deleteMenuCabañaByMenu(MenusModel mm) {
		m = new Message();
		cr.deleteMenuCabanaByMenu(mc.ModelToEntity(mm));
		m.setStatus(HttpStatus.OK);
		m.setMessage(" MenuCabaña Eliminado Correctamente..");
		return m;
	}
	public Message updateMenuCabaña(MenuCabanaModel cm) {
		m = new Message();
		cr.save(cc.ModelToEntity(cm));
		m.setStatus(HttpStatus.OK);
		m.setMessage(" MenuCabaña Update Correctamente..");
		return m;
	}

	public List<MenuCabanaModel> listaMenuCabaña() {

		List<MenuCabanaModel> lcpm = new ArrayList<>();
		cr.findAll().forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}
	public List<MenuCabanaModel> listaMenuCabañaByMenu(MenusModel mm) {

		List<MenuCabanaModel> lcpm = new ArrayList<>();
		cr.findMenuCabañaByMenu(mc.ModelToEntity(mm)).forEach(c -> lcpm.add(cc.EntityToModel(c)));

		return lcpm;
	}

	public MenuCabanaModel findCompraById(int id) {

		return cc.EntityToModel(cr.findMenuCabanaByIdCabanaMenu(id));
	}

}
