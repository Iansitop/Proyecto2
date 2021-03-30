/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Usuario
 */
public class ProductoRepository extends BaseRepository<Producto> {
    
    private final ArrayList<Producto> producto;

    public ProductoRepository() {
        this.producto = new ArrayList<>();
    }
    
    @Override
    public void guardar(Producto entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Producto prod = em.find(Producto.class, id);
        if (prod != null) {
            em.remove(prod);
        }
        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Producto entidad) {
         EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Producto prod = em.find(Producto.class, entidad.getId());
        if (prod != null) {
            prod.setCategoria(entidad.getCategoria());
            prod.setNombre(entidad.getNombre());
            prod.setPrecioactual(entidad.getPrecioactual());
            prod.setProveedor(entidad.getProveedor());
            prod.setStock(entidad.getStock());
        }

        em.getTransaction().commit();
    }

    @Override
    public Producto buscarPorId(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        Producto prod = em.find(Producto.class, id);
        if (prod == null) {
            System.out.println("No se ha encontrado la categoría");

        }
        em.getTransaction().commit();
        return prod;
    }

    @Override
    public ArrayList<Producto> buscarTodos() {
         ArrayList<Producto> productos;
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Producto.class));
        Query q = em.createQuery(criteria);
        List<Producto> listaProductos = q.getResultList();
        em.getTransaction().commit();
        return productos = new ArrayList(listaProductos);
    }
    
}
