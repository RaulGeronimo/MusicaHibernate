/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.CancionesDAO;
import DAO.CancionesDaoImplement;
import Model.Album;
import Model.Artista;
import Model.Canciones;
import Model.Grupo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;



/**
 *
 * @author Raúl
 */
@ManagedBean
@ViewScoped
public class CancionesBean {
    private Canciones cancion;
    private List<Canciones> canciones;
    private int idGrupo;
    private int idInterprete;
    private int idAlbum;
    
    public Canciones getCancion() {
        return cancion;
    }

    public void setCancion(Canciones cancion) {
        this.cancion = cancion;
    }

    public List<Canciones> getCanciones() {
        CancionesDAO dao = new CancionesDaoImplement();
        canciones = dao.mostrarCancion();
        return canciones;
    }

    public void setCanciones(List<Canciones> canciones) {
        this.canciones = canciones;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public int getIdInterprete() {
        return idInterprete;
    }

    public void setIdInterprete(int idInterprete) {
        this.idInterprete = idInterprete;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }
    
    
    
    /**
     * Creates a new instance of CancionesBean
     */
    public CancionesBean() {
        cancion = new Canciones();
    }
    
    public void addMessage(String summary){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void insertar(){
        CancionesDAO dao = new CancionesDaoImplement();
        Artista artista = new Artista();
        artista.setIdArtista(idInterprete);
        cancion.setArtista(artista);
        
        Grupo grupo = new Grupo();
        grupo.setIdGrupo(idGrupo);
        cancion.setGrupo(grupo);
        
        Album album = new Album();
        album.setIdAlbum(idAlbum);
        cancion.setAlbum(album);
        
        dao.insertarCancion(cancion);
        cancion = new Canciones();
        addMessage("Cancion agregada");
    }
    
    public void modificar(){
                CancionesDAO dao = new CancionesDaoImplement();
        Artista artista = new Artista();
        artista.setIdArtista(idInterprete);
        cancion.setArtista(artista);
        
        Grupo grupo = new Grupo();
        grupo.setIdGrupo(idGrupo);
        cancion.setGrupo(grupo);
        
        Album album = new Album();
        album.setIdAlbum(idAlbum);
        cancion.setAlbum(album);
        
        dao.modificarCancion(cancion);
        cancion = new Canciones();
        addMessage("Cancion modificada");
    }
    
    public void eliminar(){
        CancionesDAO dao = (CancionesDAO) new CancionesDaoImplement();
        dao.eliminarCancion(cancion);
        cancion = new Canciones();
        addMessage("Cancion eliminada");
    }
}
