
package albumes;

import java.util.ArrayList;
import java.util.List;


public class Albumes {


    public static void main(String[] args) {
        
        Artista artista1 = new Artista();
        artista1.setId(4);
        artista1.setNombreArtista("Josè Madero");
        artista1.setAlias("Jose Madero");
        
        Artista artista2 = new Artista();
        artista2.setId(3);
        artista2.setNombreArtista("Fredd");
        artista2.setAlias("Freddie Mercurie");
        
        Cancion cancion1 = new Cancion();
        cancion1.setId(34);
        cancion1.setNombreCancion("December");
        cancion1.setDuracion(256);
        cancion1.setNombreArtista(""+artista1+"");
        
        Cancion cancion2 = new Cancion();
        cancion2.setId(38);
        cancion2.setNombreCancion(" Mr Loverman");
        cancion2.setDuracion(257);
        cancion2.setNombreArtista("Ricky Montgeray");
        
        Cancion cancion3 = new Cancion();
        cancion3.setId(39);
        cancion3.setNombreCancion("Sofia");
        cancion3.setDuracion(256);
        cancion3.setNombreArtista(""+artista2+"");
        
        List<Cancion> album = new ArrayList<>();
        album.add(cancion1);
        album.add(cancion2);
        
      
        
        Album albun = new Album();
        albun.setId(3);
        albun.setNombreAlbum("Jungle");
        albun.setCanciones(album);

          List<Cancion> album2 = new ArrayList<>();
        album2.add(cancion3);
        
        System.out.println(album);
        System.out.println(album2);
    }
    
}
