/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Canciones;
import java.util.List;

/**
 *
 * @author Raúl
 */
public interface CancionesDAO {
    public void insertarCancion(Canciones cancion);
    public void modificarCancion(Canciones cancion);
    public void eliminarCancion(Canciones cancion);
    public List<Canciones> mostrarCancion();
}
