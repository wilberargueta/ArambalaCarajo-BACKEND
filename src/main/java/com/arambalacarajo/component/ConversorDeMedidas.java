package com.arambalacarajo.component;

public class ConversorDeMedidas {

	private final static double LIBRA_TO_GRAMO = 453.59237;
	private final static double LIBRA_TO_KILOGRAMO = 0.453592;
	private final static double LIBRA_TO_ONZA = 16;
	private final static double GRAMO_TO_LIBRA = 0.00220462;
	private final static double GRAMO_TO_KILOGRAMO = 0.001;
	private final static double GRAMO_TO_ONZA = 0.035274;
	private final static double KILOGRAMO_TO_LIBRA = 2.20462;
	private final static double KILOGRAMO_TO_GRAMO = 1000;
	private final static double KILOGRAMO_TO_ONZA = 35.274;
	private final static double ONZA_TO_LIBRA = 0.0625;
	private final static double ONZA_TO_GRAMO = 28.3495;
	private final static double ONZA_TO_KILOGRAMO = 0.0283495;
	private final static double LITRO_TO_MILILITRO = 1000;
	private final static double MILILITRO_TO_LITRO = 0.001;

	public static double ofMililitroToLitro(double mililitro) {
		return mililitro * MILILITRO_TO_LITRO;
	}

	public static double ofLitroToMililitro(double litro) {
		return litro * LITRO_TO_MILILITRO;
	}

	public static double ofOnzaToKilogramo(double onza) {
		return onza * ONZA_TO_KILOGRAMO;
	}

	public static double ofOnzaToGramo(double onza) {
		return onza * ONZA_TO_GRAMO;
	}

	public static double ofOnzaToLibra(double onza) {
		return onza * ONZA_TO_LIBRA;
	}

	public static double ofKilogramoToOnza(double kilogramo) {
		return kilogramo * KILOGRAMO_TO_ONZA;
	}

	public static double ofKilogramoToGramo(double kilogramo) {
		return kilogramo * KILOGRAMO_TO_GRAMO;
	}

	public static double ofKilogramoToLibra(double kilogramo) {
		return kilogramo * KILOGRAMO_TO_LIBRA;
	}

	public static double ofGramoToOnza(double gramo) {
		return gramo * GRAMO_TO_ONZA;
	}

	public static double ofGramoToKilogramo(double gramo) {
		return gramo * GRAMO_TO_KILOGRAMO;
	}

	public static double ofGramoToLibra(double gramo) {
		return gramo * GRAMO_TO_LIBRA;
	}

	public static double ofLibraToGramo(double libra) {
		return libra * LIBRA_TO_GRAMO;
	}

	public static double ofLibraToKilogramo(double libra) {
		return libra * LIBRA_TO_KILOGRAMO;
	}

	public static double ofLibraToOnza(double libra) {
		return libra * LIBRA_TO_ONZA;
	}

}
