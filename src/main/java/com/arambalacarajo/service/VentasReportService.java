package com.arambalacarajo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.arambalacarajo.entity.Empleados;
import com.arambalacarajo.entity.Menus;

public interface VentasReportService {

	public List<Map<String, Object>> obtenerVentas(LocalDate date1, LocalDate date2);

	public List<Map<String, Object>> obtenerVentas(LocalDate date, LocalDate date2, Menus menu);

	public List<Map<String, Object>> obtenerVentas(LocalDate date, LocalDate date2, Empleados empleado);

	public List<Map<String, Object>> obtenerVentas(LocalDate date, LocalDate date2, Empleados empleado, Menus menu);

}
