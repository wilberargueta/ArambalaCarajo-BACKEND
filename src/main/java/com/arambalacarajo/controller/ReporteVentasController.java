package com.arambalacarajo.controller;

import java.io.InputStream;
import java.time.LocalDate;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arambalacarajo.repository.VentasRepository;
import com.arambalacarajo.service.VentasReportService;

import net.sf.jasperreports.engine.DefaultJasperReportsContext;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.HtmlExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleHtmlExporterOutput;

@Controller
@RestController
public class ReporteVentasController {

	@Autowired
	private VentasReportService ventasReport;


	

	@RequestMapping(path = "/report/ventas/diarias", method = RequestMethod.GET)
	public void VentaDiariaReporte(HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(
				this.ventasReport.obtenerVentas(LocalDate.of(2019, 04, 01), LocalDate.of(2019, 04, 10)));
		InputStream stream = this.getClass().getResourceAsStream("/reportes/ventas_diarias_report.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(stream);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);
		java.io.OutputStream outputStream = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
		HtmlExporter exporter = new HtmlExporter(DefaultJasperReportsContext.getInstance());
		exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
		exporter.setExporterOutput(new SimpleHtmlExporterOutput(response.getWriter()));
		exporter.exportReport();
	
	}
}
