package com.arambalacarajo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.MenuServicio;
import com.arambalacarajo.model.MenuServicioModel;

@Component("menuServicioConvert")
public class MenuServicioConvert {

	@Autowired
	@Qualifier("menusConvert")
	private MenusConvert mc;

	@Autowired
	@Qualifier("serviciosConvert")
	private ServiciosConvert sc;

	public MenuServicio ModelToEntity(MenuServicioModel msm) {

		MenuServicio ms = new MenuServicio();

		ms.setIdMenuServicio(msm.getIdMenuServicio());
		ms.setMenu(mc.ModelToEntity(msm.getMenu()));
		ms.setServicio(sc.ModelToEntity(msm.getServicio()));
		ms.setCantidad(msm.getCantidad());

		return ms;
	}

	public MenuServicioModel EntityToModel(MenuServicio msm) {

		MenuServicioModel ms = new MenuServicioModel();

		ms.setIdMenuServicio(msm.getIdMenuServicio());
		ms.setMenu(mc.EntityToModel(msm.getMenu()));
		ms.setServicio(sc.EntityToModel(msm.getServicio()));
		ms.setCantidad(msm.getCantidad());

		return ms;
	}

}
