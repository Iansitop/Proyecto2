/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author crist
 */
public class CategoriaRepository extends BaseRepository<Categoria> {

    private final ArrayList<Categoria> categoria;

    public CategoriaRepository() {
        this.categoria = new ArrayList<>();
    }

    @Override
    public void guardar(Categoria entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Categoria cat = em.find(Categoria.class, id);

        if (cat != null) {

            em.remove(cat);
        }

        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Categoria entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Categoria cat = em.find(Categoria.class, entidad.getId());
        if (cat != null) {
            cat.setNombre(entidad.getNombre());
            cat.setDescripcion(entidad.getDescripcion());
        }

        em.getTransaction().commit();
    }

    @Override
    public Categoria buscarPorId(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        Categoria cat = em.find(Categoria.class, id);
        if (cat == null) {
            System.out.println("No se ha encontrado la categoría");

        }
        em.getTransaction().commit();
        return cat;
    }

    @Override
    public ArrayList<Categoria> buscarTodos() {
        ArrayList<Categoria> categorias;
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Categoria.class));
        Query q = em.createQuery(criteria);
        List<Categoria> listaCategorias = q.getResultList();
        em.getTransaction().commit();
        return categorias = new ArrayList(listaCategorias);
    }
     public ArrayList<Categoria> buscarCategoriaPorId(int id) {
         ArrayList<Categoria> categorias;
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        String query = "SELECT c FROM Categoria c WHERE c.id  LIKE :id";
        TypedQuery<Categoria> q = em.createQuery(query, Categoria.class);
        q.setParameter("id", id);
        List<Categoria> listaCategorias = (List<Categoria>) q.getResultList();
        em.getTransaction().commit();
        return categorias = new ArrayList(listaCategorias);

    }

    public ArrayList<Categoria> buscarCategoriaPorNombre(String nombre) {
        ArrayList<Categoria> categorias;
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        String query = "SELECT c FROM Categoria c WHERE c.nombre  LIKE :nombre";
        TypedQuery<Categoria> q = em.createQuery(query, Categoria.class);
        q.setParameter("nombre", "%"+nombre+"%");
        List<Categoria> listaCategorias = (List<Categoria>) q.getResultList();
        em.getTransaction().commit();
        return categorias = new ArrayList(listaCategorias);

    }
}
