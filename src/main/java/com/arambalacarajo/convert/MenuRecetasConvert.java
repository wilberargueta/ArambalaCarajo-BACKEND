package com.arambalacarajo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.MenuRecetas;
import com.arambalacarajo.model.MenuRecetasModel;

@Component("menuRecetasConvert")
public class MenuRecetasConvert {

	@Autowired
	private MenusConvert mv;

	@Autowired
	private RecetasConvert rv;

	public MenuRecetas ModelToEntity(MenuRecetasModel mrm) {
		MenuRecetas mr = new MenuRecetas();
		mr.setIdMenuReceta(mrm.getIdMenuReceta());
		mr.setMenu(mv.ModelToEntity(mrm.getMenu()));
		mr.setReceta(rv.ModelToEntity(mrm.getReceta()));

		return mr;

	}

	public MenuRecetasModel EntityToModel(MenuRecetas mrm) {
		MenuRecetasModel mr = new MenuRecetasModel();
		mr.setIdMenuReceta(mrm.getIdMenuReceta());
		mr.setMenu(mv.EntityToModel(mrm.getMenu()));
		mr.setReceta(rv.EntityToModel(mrm.getReceta()));

		return mr;

	}

}
