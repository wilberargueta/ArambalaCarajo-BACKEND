package com.arambalacarajo.component;

import org.springframework.stereotype.Component;
import com.arambalacarajo.entity.RecetaProductos;

@Component("convertMedidas")
public class ConvertirMedidas {

	public double convertir(RecetaProductos rp) {
		switch (rp.getMedida().toString()) {
		case "Libra":
			return ofLibraTo(rp);

		case "Gramo":
			return ofGramoTo(rp);

		case "Kilogramo":
			return ofKilogramoTo(rp);

		case "Onza":
			return ofOnzaTo(rp);

		case "Litro":
			return ofLitroTo(rp);

		case "Mililitro":
			return ofMililitroTo(rp);

		case "Unidad":
			return rp.getCantidad();
		default:
			return 0.0;
		}

	}

	private double ofMililitroTo(RecetaProductos rp) {
		if (rp.getMedida() == rp.getProducto().getMedida()) {
			return rp.getCantidad();
		} else {
			return ConversorDeMedidas.ofMililitroToLitro(rp.getCantidad());
		}

	}

	private double ofLitroTo(RecetaProductos rp) {
		if (rp.getMedida() == rp.getProducto().getMedida()) {
			return rp.getCantidad();
		} else {
			return ConversorDeMedidas.ofLitroToMililitro(rp.getCantidad());
		}

	}

	private double ofOnzaTo(RecetaProductos rp) {

		switch (rp.getProducto().getMedida().toString()) {
		case "Gramo":
			return ConversorDeMedidas.ofOnzaToGramo(rp.getCantidad());
		case "Libra":
			return ConversorDeMedidas.ofOnzaToLibra(rp.getCantidad());
		case "Kilogramo":
			return ConversorDeMedidas.ofOnzaToKilogramo(rp.getCantidad());
		default:
			return rp.getCantidad();

		}

	}

	private double ofKilogramoTo(RecetaProductos rp) {

		switch (rp.getProducto().getMedida().toString()) {
		case "Gramo":
			return ConversorDeMedidas.ofKilogramoToGramo(rp.getCantidad());
		case "Libra":
			return ConversorDeMedidas.ofKilogramoToLibra(rp.getCantidad());
		case "Onza":
			return ConversorDeMedidas.ofKilogramoToOnza(rp.getCantidad());
		default:
			return rp.getCantidad();

		}

	}

	private double ofLibraTo(RecetaProductos rp) {

		switch (rp.getProducto().getMedida().toString()) {
		case "Gramo":
			return ConversorDeMedidas.ofLibraToGramo(rp.getCantidad());
		case "Kilogramo":
			return ConversorDeMedidas.ofLibraToKilogramo(rp.getCantidad());
		case "Onza":
			return ConversorDeMedidas.ofLibraToOnza(rp.getCantidad());
		default:
			return rp.getCantidad();

		}

	}

	private double ofGramoTo(RecetaProductos rp) {

		switch (rp.getProducto().getMedida().toString()) {
		case "Libra":
			return ConversorDeMedidas.ofGramoToLibra(rp.getCantidad());
		case "Kilogramo":
			return ConversorDeMedidas.ofGramoToKilogramo(rp.getCantidad());
		case "Onza":
			return ConversorDeMedidas.ofGramoToOnza(rp.getCantidad());
		default:
			return rp.getCantidad();

		}

	}
}
