package com.arambalacarajo.service;

import java.text.DecimalFormat;

public class CalculoDeIVA {

	private static DecimalFormat decimalFormat = new DecimalFormat(".##");

	public static String calacularMontoConIVA(double monto) {

		return decimalFormat.format(monto - calcularIVAIncluido(monto));
	}

	public static String calcularValorSinIVA(double monto) {

		return decimalFormat.format(monto + calcularIVANoIncluido(monto));
	}

	public static double calcularIVANoIncluido(double monto) {
		return monto * 0.13;
	}

	public static double calcularIVAIncluido(double monto) {
		return monto - (monto / 1.13);
	}

	public static String calcularIVANoIncluidoS(double monto) {
		return decimalFormat.format(monto * 0.13);
	}

	public static String calcularIVAIncluidoS(double monto) {
		return decimalFormat.format(monto - (monto / 1.13));
	}

}
