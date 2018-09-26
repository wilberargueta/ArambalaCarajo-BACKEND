package com.arambalacarajo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.MenuCabana;
import com.arambalacarajo.model.MenuCabanaModel;

@Component("menuCabanaConvert")
public class MenuCabanaConvert {

	@Autowired
	@Qualifier("cabanasConvert")
	private CabanasConvert cc;

	@Autowired
	@Qualifier("menusConvert")
	private MenusConvert m;

	public MenuCabana ModelToEntity(MenuCabanaModel mcm) {
		MenuCabana mc = new MenuCabana();
		mc.setIdCabanaMenu(mcm.getIdCabanaMenu());
		mc.setCabana(cc.ModelToEntity(mcm.getCabana()));
		mc.setMenu(m.ModelToEntity(mcm.getMenu()));
		mc.setFechaInicio(mcm.getFechaInicio());
		mc.setFechaFinal(mcm.getFechaFinal());

		return mc;
	}

	public MenuCabanaModel EntityToModel(MenuCabana mcm) {
		MenuCabanaModel mc = new MenuCabanaModel();
		mc.setIdCabanaMenu(mcm.getIdCabanaMenu());
		mc.setCabana(cc.EntityToModel(mcm.getCabana()));
		mc.setMenu(m.EntityToModel(mcm.getMenu()));
		mc.setFechaInicio(mcm.getFechaInicio());
		mc.setFechaFinal(mcm.getFechaFinal());

		return mc;
	}

}
