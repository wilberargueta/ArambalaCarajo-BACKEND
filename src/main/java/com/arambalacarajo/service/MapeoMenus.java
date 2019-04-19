package com.arambalacarajo.service;

import java.util.HashMap;
import java.util.Map;

public class MapeoMenus {

	private Map<Integer, Double> listaMenus;
	private Map<Integer, Integer> listaCantidades;
	private Map<Integer, String> listaNombres;

	public MapeoMenus() {
		listaMenus = new HashMap<Integer, Double>();
		listaCantidades = new HashMap<Integer, Integer>();
		listaNombres = new HashMap<Integer, String>();
	}

	public void addMenuToMap(int key, double value, int cantidad, String nombre) {
		if (this.listaMenus.containsKey(key))
			update(key, value, cantidad, nombre);
		else
			add(key, value, cantidad, nombre);

	}

	private void update(int key, double value, int cantidad, String nombre) {
		int tmpCantidad = getCantidades(key);
		this.listaCantidades.replace(key, tmpCantidad + cantidad);
	}

	private void add(int key, double value, int cantidad, String nombre) {
		this.listaMenus.put(key, value);
		this.listaCantidades.put(key, cantidad);
		this.listaNombres.put(key, nombre);
	}

	public double getMenu(int key) {
		return this.listaMenus.get(key);
	}

	public int getCantidades(int key) {
		return this.listaCantidades.get(key);
	}

	public String getNombre(int key) {
		return this.listaNombres.get(key);
	}

	public Map<Integer, Double> getMapMenu() {
		return this.listaMenus;
	}

	public void setMapMenus(Map<Integer, Double> listaMenus) {
		this.listaMenus = listaMenus;
	}

	public Map<Integer, Integer> getMapCantidades() {
		return this.listaCantidades;
	}

	public void setMapCantidades(Map<Integer, Integer> listaCantidades) {
		this.listaCantidades = listaCantidades;
	}

	public void setMapNombres(Map<Integer, String> nombres) {
		this.listaNombres = nombres;
	};

	public Map<Integer, String> getMapNombres() {
		return this.listaNombres;
	};

	public double total(int key) {
		return this.getCantidades(key) * this.getMenu(key);
	}
}
