/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Artista;
import java.util.List;

/**
 *
 * @author luis manuel
 */
public interface ArtistasDAO {
    public void insertarArtista(Artista artista);
    public void modificarArtista(Artista artista);
    public void eliminarArtista(Artista artista);
    public List<Artista> mostrarArtista();
}
