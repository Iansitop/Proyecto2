/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author crist
 */
public abstract class BaseRepository <T> {
     public abstract void guardar(T entidad);

    public abstract void eliminar(int id);

    public abstract void actualizar(T entidad);

    public abstract T buscarPorId(int id);

    public abstract ArrayList<T> buscarTodos();
    
    public EntityManager createEntityManager(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proyecto2BDAPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
