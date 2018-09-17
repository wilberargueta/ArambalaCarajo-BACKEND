package com.arambalacarajo.convert;

import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.Ventas;
import com.arambalacarajo.model.VentasModel;

@Component("ventasConvert")
public class VentasConvert {

	public Ventas ModelToEntity(VentasModel vm) {
		Ventas v = new Ventas();

		v.setIdVenta(vm.getIdVenta());
		v.setNumRegistro(vm.getNumRegistro());
		v.setFecha(vm.getFecha());
		v.setDetalle(vm.getDetalle());

		return v;
	}

	public VentasModel EntityToModel(Ventas vm) {
		VentasModel v = new VentasModel();

		v.setIdVenta(vm.getIdVenta());
		v.setNumRegistro(vm.getNumRegistro());
		v.setFecha(vm.getFecha());
		v.setDetalle(vm.getDetalle());

		return v;
	}
}
