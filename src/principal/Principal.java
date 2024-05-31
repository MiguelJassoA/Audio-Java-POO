package principal;
import com.alura.appAudio.modelo.Cancion;
import com.alura.appAudio.modelo.Favorito;
import com.alura.appAudio.modelo.Podcast;

public class Principal {

    public static void main(String[] args) {

        Cancion primerCancion= new Cancion();

                primerCancion.setTitulo("Snow (Hey Oh)");
                primerCancion.setDuracion(5.35);
                primerCancion.setGenero("Rock alternativo");
                primerCancion.setAlbum("Stadium Arcadium");
                primerCancion.setBanda("Red Hod Chili Peppers");


       Podcast primerPodcast = new Podcast();

               primerPodcast.setTitulo("Los Amos Del Universo-Cosas de la tienda");
               primerPodcast.setDuracion(95);
               primerPodcast.setGenero("Comedia");
               primerPodcast.setPresentador("Franco Escamilla");
               primerPodcast.setDescripcion("Podcast con mi compadre Ivan Fematt (La mole Chida)");
               primerPodcast.setFecha("feb,2021");

//número de me gusta y reproduciones de canciones
        for (int i = 0; i < 1300; i++) {
            primerCancion.meGusta();
        }
        for (int i = 0; i < 600; i++) {
            primerCancion.reproduciones();
        }

//número de me gusta y reproduciones de podcast
        for (int i = 0; i < 1256; i++) {
            primerPodcast.meGusta();
        }
        for (int i = 0; i < 4560; i++) {
            primerPodcast.reproduciones();
        }

// muestra los datos de primer cancion
        System.out.println(primerCancion.getTitulo());
        System.out.println("Duración: "+primerCancion.getDuracion()+" minutos");
        System.out.println(primerCancion.getGenero());
        System.out.println(primerCancion.getAlbum());
        System.out.println(primerCancion.getBanda());
        System.out.println("Me gusta: "+primerCancion.getTotalDemMeGusta());
        System.out.println("Número de reproduciones: "+primerCancion.getTotalDeReproduciones());
        System.out.println("****************************"); // espacio

        // muestra los datos de primer podcast
        System.out.println(primerPodcast.getTitulo());
        System.out.println("Duracion: "+primerPodcast.getDuracion()+" minutos");
        System.out.println(primerPodcast.getGenero());
        System.out.println(primerPodcast.getPresentador());
        System.out.println(primerPodcast.getDescripcion());
        System.out.println("Publicado: "+primerPodcast.getFecha());
        System.out.println("Me gusta: "+primerPodcast.getTotalDemMeGusta());
        System.out.println("Número de reproduciones: "+primerPodcast.getTotalDeReproduciones());
        System.out.println("****************************"); // espacio

        Favorito mejormomento= new Favorito();
        mejormomento.agregar(primerCancion);
        mejormomento.agregar(primerPodcast);


    }
}
