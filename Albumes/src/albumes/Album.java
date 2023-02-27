
package albumes;

import java.util.List;


public class Album {
    
    private int id;
    private String nombreAlbum;
    private int duracion;

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
    private List<Cancion> canciones;

    /**
     *
     * @return
     */
    @Override
    public String toString (){
        return "Album " + "ID:" +id+ "Nombre del Album:" +nombreAlbum+ "Duracion:"+duracion + " ";
    }
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
    }

    
    
    
    
    
