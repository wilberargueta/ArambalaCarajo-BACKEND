package com.arambalacarajo.model;

import java.time.LocalDate;

public class MenusModel {

    private int idMenu;

    private String nombre;

    private String detalles;

    private String precio;

    private Boolean activo;

    private LocalDate creado;

    private LocalDate actualizado;

    private LocalDate eliminado;

    private boolean IVA;

    private boolean IT;

    public MenusModel() {

    }

    public MenusModel(int idMenu, String nombre, String detalles, String precio, Boolean activo, LocalDate creado, LocalDate actualizado, LocalDate eliminado, boolean IVA, boolean IT) {
        this.idMenu = idMenu;
        this.nombre = nombre;
        this.detalles = detalles;
        this.precio = precio;
        this.activo = activo;
        this.creado = creado;
        this.actualizado = actualizado;
        this.eliminado = eliminado;
        this.IVA = IVA;
        this.IT = IT;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public LocalDate getCreado() {
        return creado;
    }

    public void setCreado(LocalDate creado) {
        this.creado = creado;
    }

    public LocalDate getActualizado() {
        return actualizado;
    }

    public void setActualizado(LocalDate actualizado) {
        this.actualizado = actualizado;
    }

    public LocalDate getEliminado() {
        return eliminado;
    }

    public void setEliminado(LocalDate eliminado) {
        this.eliminado = eliminado;
    }

    public boolean getIVA() {
        return IVA;
    }

    public void setIVA(boolean IVA) {
        this.IVA = IVA;
    }

    public boolean getIT() {
        return IT;
    }

    public void setIT(boolean IT) {
        this.IT = IT;
    }

    @Override
    public String toString() {
        return "MenusModel{" +
                "idMenu=" + idMenu +
                ", nombre='" + nombre + '\'' +
                ", detalles='" + detalles + '\'' +
                ", precio='" + precio + '\'' +
                ", activo=" + activo +
                ", creado=" + creado +
                ", actualizado=" + actualizado +
                ", eliminado=" + eliminado +
                ", IVA=" + IVA +
                ", IT=" + IT +
                '}';
    }
}
