/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Album;
import java.util.List;

/**
 *
 * @author Raúl
 */
public interface AlbumsDAO {
    public void insertarAlbum(Album album);
    public void modificarAlbum(Album album);
    public void eliminarAlbum(Album album);
    public List<Album> mostrarAlbum();
}
