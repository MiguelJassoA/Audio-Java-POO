package com.alura.appAudio.modelo;

public class Cancion extends Audio {
    private String album;
    private String banda;


    public void setAlbum(String album) {
        this.album = album;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }


    public String getAlbum() {
        return album;
    }

    public String getBanda() {
        return banda;
    }


}
