package Model;
// Generated 6/09/2021 07:08:19 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Canciones generated by hbm2java
 */
public class Canciones  implements java.io.Serializable {


     private Integer idCancion;
     private Album album;
     private Artista artista;
     private Grupo grupo;
     private String nombre;
     private Date duracion;
     private Date lanzamiento;
     private String idioma;
     private String genero;

    public Canciones() {
        album = new Album();
        artista = new Artista();
        grupo = new Grupo();
    }

    public Canciones(Album album, Artista artista, Grupo grupo, String nombre, Date duracion, Date lanzamiento, String idioma, String genero) {
       this.album = album;
       this.artista = artista;
       this.grupo = grupo;
       this.nombre = nombre;
       this.duracion = duracion;
       this.lanzamiento = lanzamiento;
       this.idioma = idioma;
       this.genero = genero;
    }
   
    public Integer getIdCancion() {
        return this.idCancion;
    }
    
    public void setIdCancion(Integer idCancion) {
        this.idCancion = idCancion;
    }
    public Album getAlbum() {
        return this.album;
    }
    
    public void setAlbum(Album album) {
        this.album = album;
    }
    public Artista getArtista() {
        return this.artista;
    }
    
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    public Grupo getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }
    public Date getLanzamiento() {
        return this.lanzamiento;
    }
    
    public void setLanzamiento(Date lanzamiento) {
        this.lanzamiento = lanzamiento;
    }
    public String getIdioma() {
        return this.idioma;
    }
    
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }




}


