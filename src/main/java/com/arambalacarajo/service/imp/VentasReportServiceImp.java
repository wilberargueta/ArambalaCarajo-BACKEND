package com.arambalacarajo.service.imp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arambalacarajo.entity.CajaVenta;
import com.arambalacarajo.entity.CuentaMenu;
import com.arambalacarajo.entity.Empleados;
import com.arambalacarajo.entity.Menus;
import com.arambalacarajo.entity.Ventas;
import com.arambalacarajo.repository.CajaVentaRepository;
import com.arambalacarajo.repository.CuentaMenuRepository;
import com.arambalacarajo.repository.VentasRepository;
import com.arambalacarajo.service.CalculoDeIVA;
import com.arambalacarajo.service.MapeoMenus;
import com.arambalacarajo.service.VentasReportService;

@Service("ventasReportService")
public class VentasReportServiceImp implements VentasReportService {

	@Autowired
	private VentasRepository ventasDAO;

	@Autowired
	private CajaVentaRepository cajaVentaRepository;

	@Autowired
	private CuentaMenuRepository cuentaMenuRepository;

	private List<Ventas> ventasLista;

	private List<Map<String, Object>> datosReporte;

	private MapeoMenus mapeo;

	@Override
	public List<Map<String, Object>> obtenerVentas(LocalDate date1, LocalDate date2) {
		mapeo = new MapeoMenus();
		this.ventasLista = this.ventasDAO.findVentasBetween(date1, date2);
		this.ventasLista.forEach(v -> {
			this.cuentaMenuRepository
					.findCuentaMenuByCuenta(this.cajaVentaRepository.findCajaVentaByVenta(v).getCuenta())
					.forEach(menu -> {
						this.mapeo.addMenuToMap(menu.getMenu().getIdMenu(),
								Double.parseDouble(menu.getMenu().getPrecio()), menu.getCantidad(),
								menu.getMenu().getNombre());
					});
			;
		});
		// his.ventasLista;
		this.datosReporte = new ArrayList<Map<String, Object>>();

		this.mapeo.getMapNombres().forEach((s, i) -> {
			int count = 0;
			Map<String, Object> tmp = new HashMap<String, Object>();
			if (count == 0) {
				tmp.put("fechaInicial", date1.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
				tmp.put("fechaFinal", date2.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
				count++;
			}
			tmp.put("producto", i);
			tmp.put("precio", "$ " + this.mapeo.getMenu(s));
			tmp.put("cantidad", this.mapeo.getCantidades(s));
			tmp.put("totalMasIva", "$ " + this.mapeo.total(s));
			tmp.put("totalMenosIva", "$ " + CalculoDeIVA.calacularMontoConIVA(this.mapeo.total(s)));
			tmp.put("iva", "$ " + CalculoDeIVA.calcularIVAIncluidoS(this.mapeo.total(s)));
			this.datosReporte.add(tmp);

		});
		return this.datosReporte;
	}

	@Override
	public List<Map<String, Object>> obtenerVentas(LocalDate date, LocalDate date2, Menus menu) {
		
		return null;
	}

	@Override
	public List<Map<String, Object>> obtenerVentas(LocalDate date, LocalDate date2, Empleados empleado) {

		return null;
	}

	@Override
	public List<Map<String, Object>> obtenerVentas(LocalDate date, LocalDate date2, Empleados empleado, Menus menu) {

		return null;
	}

}
