package com.arambalacarajo.model;

public class Respuesta {
	
	private Message message;
	private Object valor;
	public Respuesta() {
		
	}
	public Respuesta(Message message, Object valor) {
		this.message = message;
		this.valor = valor;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	

}