/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Disquera;
import java.util.List;

/**
 *
 * @author luis manuel
 */
public interface DisquerasDAO {
    public void insertarDisquera(Disquera disquera);
    public void modificarDisquera(Disquera disquera);
    public void eliminarDisquera(Disquera disquera);
    public List<Disquera> mostrarDisquera();
}
