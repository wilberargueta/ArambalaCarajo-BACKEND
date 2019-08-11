package com.arambalacarajo.entity;


public enum Medidas {

	LIBRA("Libra"), KILOGRAMO("Kilogramo"), ONZA("Onza"), GRAMO("Gramo"), LITRO("Litro"), MILILITRO("Mililitro"),
	UNIDAD("Unidada");

	private String name;

	private Medidas(String name) {
		this.name = name;
	}

	public static Medidas getMedida(String value) {
		switch (value) {
		case "Libra":
			return Medidas.LIBRA;
		case "Kilogramo":
			return Medidas.KILOGRAMO;
		case "Onza":
			return Medidas.ONZA;
		case "Gramo":
			return Medidas.GRAMO;
		case "Litro":
			return Medidas.LITRO;
		case "Mililitro":
			return Medidas.MILILITRO;
		case "Unidad":
			return Medidas.UNIDAD;
		default:
			return null;

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
