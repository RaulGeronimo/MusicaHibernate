/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Grupo;
import java.util.List;

/**
 *
 * @author Raúl
 */
public interface GruposDAO {
    public void insertarGrupo(Grupo grupo);
    public void modificarGrupo(Grupo grupo);
    public void eliminarGrupo(Grupo grupo);
    public List<Grupo> mostrarGrupo();
}
