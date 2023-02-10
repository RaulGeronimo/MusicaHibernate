/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.ArtistasDAO;
import DAO.ArtistasDaoImplement;
import Model.Artista;
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
public class ArtistasBean {
    private Artista artista;
    private List<Artista> artistas;

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public List<Artista> getArtistas() {
        ArtistasDAO dao = new ArtistasDaoImplement();
        artistas = dao.mostrarArtista();
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }
    
    
    /**
     * Creates a new instance of ArtistasBean
     */
    public ArtistasBean() {
        artista = new Artista();
    }
    
     public void addMessage(String summary){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
      public void insertar(){
        ArtistasDAO dao = new ArtistasDaoImplement();
        dao.insertarArtista(artista);
        artista = new Artista();
        addMessage("Artista agregado");
    }
      
      public void modificar(){
        ArtistasDAO dao = new ArtistasDaoImplement();
        dao.modificarArtista(artista);
        artista = new Artista();
        addMessage("Artista modificado");
    }
      
      public void eliminar(){
        ArtistasDAO dao = new ArtistasDaoImplement();
        dao.eliminarArtista(artista);
        artista = new Artista();
        addMessage("Artista eliminado");
    }
}
