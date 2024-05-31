package com.alura.appAudio.modelo;

public class Audio {
    private String titulo;
    private double duracion;
    private int totalDeReproduciones;
    private int totalDemMeGusta;
    private String genero;


    public void meGusta() {
        this.totalDemMeGusta++;
    }

    public void reproduciones() {
        this.totalDeReproduciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproduciones() {
        return totalDeReproduciones;
    }


    public int getTotalDemMeGusta() {
        return totalDemMeGusta;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
