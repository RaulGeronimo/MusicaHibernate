package Model;
// Generated 6/09/2021 07:08:19 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Disquera generated by hbm2java
 */
public class Disquera  implements java.io.Serializable {


     private Integer idDisquera;
     private String nombre;
     private String correo;
     private String direccion;
     private Long telefono;
     private Date fundacion;
     private Set<Grupo> grupos = new HashSet<Grupo>(0);

    public Disquera() {
    }

    public Disquera(String nombre, String correo, String direccion, Long telefono, Date fundacion, Set<Grupo> grupos) {
       this.nombre = nombre;
       this.correo = correo;
       this.direccion = direccion;
       this.telefono = telefono;
       this.fundacion = fundacion;
       this.grupos = grupos;
    }
   
    public Integer getIdDisquera() {
        return this.idDisquera;
    }
    
    public void setIdDisquera(Integer idDisquera) {
        this.idDisquera = idDisquera;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Long getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    public Date getFundacion() {
        return this.fundacion;
    }
    
    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }
    public Set<Grupo> getGrupos() {
        return this.grupos;
    }
    
    public void setGrupos(Set<Grupo> grupos) {
        this.grupos = grupos;
    }




}


