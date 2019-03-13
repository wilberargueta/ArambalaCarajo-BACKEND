package com.arambalacarajo.service.imp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arambalacarajo.repository.VentasRepository;
import com.arambalacarajo.service.VentasReportService;

@Service("ventasReportService")
public class VentasReportServiceImp implements VentasReportService{
	
	@Autowired 
	private VentasRepository ventasDao;

	@Override
	public List<Map<String, Object>> getVentasDiarias() {
		
		List<Map<String, Object>> listaVentas = new ArrayList<>();
		
		this.ventasDao.findVentasByFecha(LocalDate.now())
		.forEach(e->{
			Map<String, Object> venta = new HashMap<String, Object>();
			venta.put("registroVenta", e.getRegistroVenta());
			venta.put("fecha", e.getFecha());
			venta.put("detalle", e.getDetalle());
			listaVentas.add(venta);
		});
		
		return listaVentas;
	}
	
}
