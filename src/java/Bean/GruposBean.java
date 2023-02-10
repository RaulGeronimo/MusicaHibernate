/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.GruposDAO;
import DAO.GruposDaoImplement;
import Model.Disquera;
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
public class GruposBean {
    private Grupo grupo;
    private List<Grupo> grupos;
    private int idGrupo;
    
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public List<Grupo> getGrupos() {
        GruposDAO dao = new GruposDaoImplement();
        grupos = dao.mostrarGrupo();
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
    
    
    /**
     * Creates a new instance of GruposBean
     */
    public GruposBean() {
        grupo = new Grupo();
    }
    
    public void addMessage(String summary){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
      public void insertar(){
        GruposDAO dao = new GruposDaoImplement();
        Disquera disquera = new Disquera();
        disquera.setIdDisquera(idGrupo);
        grupo.setDisquera(disquera);
        dao.insertarGrupo(grupo);
        grupo = new Grupo();
        addMessage("Grupo agregado");
    }
      
      public void modificar(){
        GruposDAO dao = new GruposDaoImplement();
        Disquera disquera = new Disquera();
        disquera.setIdDisquera(idGrupo);
        grupo.setDisquera(disquera);
        dao.modificarGrupo(grupo);
        grupo = new Grupo();
        addMessage("Grupo agregado");
    }
      
      public void eliminar(){
        GruposDAO dao = new GruposDaoImplement();
        dao.eliminarGrupo(grupo);
        grupo = new Grupo();
        addMessage("Grupo eliminado");
    }
}
