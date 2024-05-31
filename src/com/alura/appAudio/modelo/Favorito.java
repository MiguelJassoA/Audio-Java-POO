package com.alura.appAudio.modelo;

public class Favorito {

    public void agregar(Audio audio){

        if (audio.getTotalDemMeGusta()>=50) {
            System.out.println(audio.getTitulo()+" es uno de los mejores del momento");
        }else {
            System.out.println(audio.getTitulo()+"este es otro de los mejores del momento");
        }
    }

}


