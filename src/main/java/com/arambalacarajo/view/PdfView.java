package com.arambalacarajo.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.arambalacarajo.model.VentasModel;
import com.arambalacarajo.service.VentasService;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;

import com.lowagie.text.Chunk;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;


public class PdfView extends AbstractPdfView {

	@Autowired
	@Qualifier("ventasService")
	private VentasService vs;

	@Override
	protected void buildPdfDocument(Map<String, Object> model, 
			Document document, 
			PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

	
		@SuppressWarnings("unchecked")
		List<VentasModel> ventasList = (List<VentasModel>) model.get("ventasList");
		
		PdfPTable table = new PdfPTable(3);

		Paragraph header = new Paragraph();
		header.add(new Phrase("Hola Mundo"));
		header.add(new Phrase(Chunk.NEWLINE));
		header.add(new Phrase("Hello WOrd"));
		header.add(new Phrase(Chunk.NEWLINE));
		header.add(new Phrase(Chunk.NEWLINE));
		table.addCell("Registro");
		table.addCell("Detalle");
		table.addCell("Fecha");
		
		
		ventasList.forEach(v -> {
			//table.completeRow();
			table.addCell(v.getRegistroVenta());
			table.addCell(v.getDetalle());
			table.addCell(v.getFecha().toString());

		});

		document.add(table);
	}
}
