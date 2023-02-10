/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.DisquerasDAO;
import DAO.DisquerasDaoImplement;
import Model.Disquera;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;



/**
 *
 * @author luis manuel
 */
@ManagedBean
@ViewScoped
public class DisquerasBean {
    private Disquera disquera;
    private List<Disquera> disqueras;

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }

    public List<Disquera> getDisqueras() {
        DisquerasDAO dao = new DisquerasDaoImplement();
        disqueras = dao.mostrarDisquera();
        return disqueras;
    }

    public void setDisqueras(List<Disquera> disqueras) {
        this.disqueras = disqueras;
    }
    
    
    /**
     * Creates a new instance of DisquerasBean
     */
    public DisquerasBean() {
        disquera = new Disquera();
    }
    
    public void addMessage(String summary){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);//Instancia
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void insertar(){
        DisquerasDAO dao = new DisquerasDaoImplement();
        dao.insertarDisquera(disquera);
        disquera = new Disquera();
        addMessage("Disquera agregada");
    }
    
    public void modificar(){
        DisquerasDAO dao = new DisquerasDaoImplement();
        dao.modificarDisquera(disquera);
        disquera = new Disquera();
        addMessage("Disquera modificada");
    }
      
      public void eliminar(){
        DisquerasDAO dao = new DisquerasDaoImplement();
        dao.eliminarDisquera(disquera);
        disquera = new Disquera();
        addMessage("Disquera eliminada");
    }
}
