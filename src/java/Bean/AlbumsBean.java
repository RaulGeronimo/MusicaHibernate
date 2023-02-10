/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.AlbumsDAO;
import DAO.AlbumsDaoImplement;
import Model.Album;
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
public class AlbumsBean {
    private Album album;
    private List<Album> albums;
    private int clave;

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Album> getAlbums() {//Es el unico que se modifica
        AlbumsDAO dao = new AlbumsDaoImplement();
        albums = dao.mostrarAlbum();
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
    
    
    /**
     * Creates a new instance of AlbumsBean
     */
    public AlbumsBean() {
        album = new Album();
    }
    
    public void addMessage(String summary){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);//Instancia
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void insertar(){
        AlbumsDAO dao = new AlbumsDaoImplement();
        Grupo grupo = new Grupo();
        grupo.setIdGrupo(clave);
        album.setGrupo(grupo);
        dao.insertarAlbum(album);
        album = new Album();
        addMessage("Album Insertado");
    }
    
    public void eliminar(){
        AlbumsDAO dao = new AlbumsDaoImplement();
        dao.eliminarAlbum(album);
        album = new Album();
        addMessage("Album Eliminado");
    }
    
    public void modificar(){
        AlbumsDAO dao = new AlbumsDaoImplement();
        Grupo grupo = new Grupo();
        grupo.setIdGrupo(clave);
        album.setGrupo(grupo);
        dao.modificarAlbum(album);
        album = new Album();
        addMessage("Album Actualizado");
    }
}
