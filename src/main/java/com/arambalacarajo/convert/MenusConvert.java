package com.arambalacarajo.convert;

import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.Menus;
import com.arambalacarajo.model.MenusModel;

@Component("menusConvert")
public class MenusConvert {

	public Menus ModelToEntity(MenusModel mm) {
		Menus m = new Menus();
		m.setIdMenu(mm.getIdMenu());
		m.setNombre(mm.getNombre());
		m.setDetalles(mm.getDetalles());
		m.setPrecio(mm.getPrecio());
		m.setActivo(mm.getActivo());
		m.setCreado(mm.getCreado());
		m.setActualizado(mm.getActualizado());
		m.setEliminado(mm.getEliminado());
		m.setIVA(mm.getIVA());
		m.setIT(mm.getIT());

		return m;
	}

	public MenusModel EntityToModel(Menus mm) {
		MenusModel m = new MenusModel();
		m.setIdMenu(mm.getIdMenu());
		m.setNombre(mm.getNombre());
		m.setDetalles(mm.getDetalles());
		m.setPrecio(mm.getPrecio());
		m.setActivo(mm.getActivo());
		m.setCreado(mm.getCreado());
		m.setActualizado(mm.getActualizado());
		m.setEliminado(mm.getEliminado());
		m.setIVA(mm.getIVA());
		m.setIT(mm.getIT());

		return m;
	}
}
