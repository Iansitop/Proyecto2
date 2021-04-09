/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
            System.out.println("No se ha encontrado la producto");
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
    
    public ArrayList<Producto> buscarProductoPorId(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        String query = "SELECT p FROM Producto p WHERE p.id  LIKE :id";
        TypedQuery<Producto> q = em.createQuery(query, Producto.class);
        q.setParameter("id", id);
        List<Producto> listaP = (List<Producto>) q.getResultList();
        em.getTransaction().commit();
        return (ArrayList<Producto>) listaP;

    }
    
    public ArrayList<Producto> buscarProductoPorNombre(String nombre) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        String query = "SELECT p FROM Producto p WHERE p.nombre  LIKE :nombre";
        TypedQuery<Producto> q = em.createQuery(query, Producto.class);
        q.setParameter("nombre", nombre);
        List<Producto> listaP = (List<Producto>) q.getResultList();
        em.getTransaction().commit();
        Collection<Producto> col=new HashSet();
        for (int i = 0; i < listaP.size(); i++) {
            col.add(listaP.get(i));
        }
        ArrayList<Producto> ar=new ArrayList(col);
        return ar;

    }
}
