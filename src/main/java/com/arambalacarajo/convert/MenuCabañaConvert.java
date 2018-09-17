package com.arambalacarajo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.MenuCabaña;
import com.arambalacarajo.model.MenuCabañaModel;

@Component("menuCabañaConvert")
public class MenuCabañaConvert {

	@Autowired
	@Qualifier("cabañasConvert")
	private CabañasConvert cc;

	@Autowired
	@Qualifier("menusConvert")
	private MenusConvert m;

	public MenuCabaña ModelToEntity(MenuCabañaModel mcm) {
		MenuCabaña mc = new MenuCabaña();
		mc.setIdCabañaMenu(mcm.getIdCabañaMenu());
		mc.setCabaña(cc.ModelToEntity(mcm.getCabaña()));
		mc.setMenu(m.ModelToEntity(mcm.getMenu()));
		mc.setFechaInicio(mcm.getFechaInicio());
		mc.setFechaFinal(mcm.getFechaFinal());

		return mc;
	}

	public MenuCabañaModel EntityToModel(MenuCabaña mcm) {
		MenuCabañaModel mc = new MenuCabañaModel();
		mc.setIdCabañaMenu(mcm.getIdCabañaMenu());
		mc.setCabaña(cc.EntityToModel(mcm.getCabaña()));
		mc.setMenu(m.EntityToModel(mcm.getMenu()));
		mc.setFechaInicio(mcm.getFechaInicio());
		mc.setFechaFinal(mcm.getFechaFinal());

		return mc;
	}

}
