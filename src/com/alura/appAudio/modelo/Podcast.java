package com.alura.appAudio.modelo;

public class Podcast extends Audio{

    private String presentador;
    private String descripcion;
    private String fecha;

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPresentador() {
        return presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }
}

