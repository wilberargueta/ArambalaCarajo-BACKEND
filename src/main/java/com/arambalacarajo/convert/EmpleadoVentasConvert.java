package com.arambalacarajo.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arambalacarajo.entity.EmpleadoVentas;
import com.arambalacarajo.model.EmpleadoVentasModel;

@Component("empleadoVentasConvert")
public class EmpleadoVentasConvert {

	@Autowired
	private EmpleadosConvert ec;

	@Autowired
	private VentasConvert vc;

	public EmpleadoVentas ModelToEntity(EmpleadoVentasModel evm) {
		EmpleadoVentas e = new EmpleadoVentas();

		e.setIdEmpleadoVenta(evm.getIdEmpleadoVenta());
		e.setEmpleado(ec.ModelToEntity(evm.getEmpleado()));
		e.setVenta(vc.ModelToEntity(evm.getVenta()));

		return e;

	}

	public EmpleadoVentasModel EntityToModel(EmpleadoVentas evm) {
		EmpleadoVentasModel e = new EmpleadoVentasModel();

		e.setIdEmpleadoVenta(evm.getIdEmpleadoVenta());
		e.setEmpleado(ec.EntityToModel(evm.getEmpleado()));
		e.setVenta(vc.EntityToModel(evm.getVenta()));

		return e;

	}

}
