package com.arambalacarajo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.VentaMenus;
import com.arambalacarajo.model.VentaMenusModel;

@Component("ventaMenusConvert")
public class VentaMenusConvert {
	@Autowired
	private MenusConvert mc;

	@Autowired
	private VentasConvert vc;

	public VentaMenus ModelToEntity(VentaMenusModel vmm) {
		VentaMenus vm = new VentaMenus();
		vm.setIdVentaMenu(vmm.getIdVentaMenu());
		vm.setMenu(mc.ModelToEntity(vmm.getMenu()));
		vm.setVenta(vc.ModelToEntity(vmm.getVenta()));
		vm.setCantidad(vmm.getCantidad());

		return vm;
	}

	public VentaMenusModel EntityToModel(VentaMenus vmm) {
		VentaMenusModel vm = new VentaMenusModel();
		vm.setIdVentaMenu(vmm.getIdVentaMenu());
		vm.setMenu(mc.EntityToModel(vmm.getMenu()));
		vm.setVenta(vc.EntityToModel(vmm.getVenta()));
		vm.setCantidad(vmm.getCantidad());

		return vm;
	}
}
