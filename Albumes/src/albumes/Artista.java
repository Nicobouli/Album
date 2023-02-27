
package albumes;


public class Artista extends Persona {
    
    private int id;
    private String nombreArtista;
    private String Alias;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    @Override
    public String toString() {
        return "Artista{"+ "id=" + id + ", nombreArtista=" + nombreArtista + ", Alias=" + Alias + '}';
    }

    
    
    
}
