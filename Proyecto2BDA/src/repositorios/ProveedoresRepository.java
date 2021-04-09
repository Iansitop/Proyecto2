/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Proveedor;
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
public class ProveedoresRepository extends BaseRepository<Proveedor> {

    private final ArrayList<Proveedor> proveedores;

    public ProveedoresRepository() {
        this.proveedores = new ArrayList<>();
    }

    @Override
    public void guardar(Proveedor entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Proveedor proveedor = em.find(Proveedor.class, id);

        if (proveedor != null) {

            em.remove(proveedor);
        }

        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Proveedor entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Proveedor prov = em.find(Proveedor.class, entidad.getId());
        if (prov != null) {
            prov.setNombre(entidad.getNombre());
            prov.setPaginaWeb(entidad.getPaginaWeb());
            prov.setDireccion(entidad.getDireccion());
            prov.setTelefono(entidad.getTelefono());
            prov.setRfc(entidad.getRfc());
        }

        em.getTransaction().commit();
    }

    @Override
    public Proveedor buscarPorId(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        Proveedor cliente = em.find(Proveedor.class, id);
        if (cliente == null) {
            System.out.println("No se ha encontrado al proveedor");

        }
        em.getTransaction().commit();
        return cliente;
    }

    @Override
    public ArrayList<Proveedor> buscarTodos() {
        ArrayList<Proveedor> proveedor;
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Proveedor.class));
        Query q = em.createQuery(criteria);
        List<Proveedor> listaProveedor = q.getResultList();
        em.getTransaction().commit();
        return proveedor = new ArrayList(listaProveedor);
    }

    public ArrayList<Proveedor> buscarProveedorPorId(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        String query = "SELECT p FROM Proveedor p WHERE p.id  LIKE :id%";
        TypedQuery<Proveedor> q = em.createQuery(query, Proveedor.class);
        q.setParameter("id", id);
        List<Proveedor> listaP = (List<Proveedor>) q.getResultList();
        em.getTransaction().commit();
        return (ArrayList<Proveedor>) listaP;

    }

    public ArrayList<Proveedor> buscarProveedorPorNombre(String nombre) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        String query = "SELECT p FROM Proveedor p WHERE p.nombre  LIKE :nombre";
        TypedQuery<Proveedor> q = em.createQuery(query, Proveedor.class);
        q.setParameter("nombre", nombre);
        List<Proveedor> listaP = (List<Proveedor>) q.getResultList();
        em.getTransaction().commit();
        return (ArrayList<Proveedor>) listaP;

    }
}
