/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Cliente;
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
public class ClientesRepository extends BaseRepository<Cliente> {

    private final ArrayList<Cliente> clientes;

    public ClientesRepository() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void guardar(Cliente entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Cliente cliente = em.find(Cliente.class, id);

        if (cliente != null) {

            em.remove(cliente);
        }

        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Cliente entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Cliente cliente = em.find(Cliente.class, entidad.getId());
        if (cliente != null) {
            cliente.setNombre(entidad.getNombre());
            cliente.setRfc(entidad.getRfc());
            cliente.setDireccion(entidad.getDireccion());
            if (entidad.getTelefono1() != null) {
                cliente.setTelefono1(entidad.getTelefono1());
            }
            if (entidad.getTelefono2() != null) {
                cliente.setTelefono2(entidad.getTelefono2());
            }

        }

        em.getTransaction().commit();
    }

    @Override
    public Cliente buscarPorId(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        Cliente cliente = em.find(Cliente.class, id);
        if (cliente == null) {
            System.out.println("No se ha encontrado al cliente");

        }
        em.getTransaction().commit();
        return cliente;
    }

    @Override
    public ArrayList<Cliente> buscarTodos() {
        ArrayList<Cliente> clientes;
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Cliente.class));
        Query q = em.createQuery(criteria);
        List<Cliente> listaClientes = q.getResultList();
        em.getTransaction().commit();
        return clientes = new ArrayList(listaClientes);
    }
    public ArrayList<Cliente> buscarClientePorId(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        String query = "Select c FROM Cliente c WHERE c.id  LIKE '%:id%'";
        TypedQuery<Cliente> q = em.createQuery(query, Cliente.class);
        q.setParameter("id", id);
        List<Cliente> listaP = (List<Cliente>) q.getResultList();
        em.getTransaction().commit();
        return (ArrayList<Cliente>) listaP;

    }

    public ArrayList<Cliente> buscarClientePorNombre(String nombre) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        String query = "Select c FROM Cliente c WHERE c.nombre  LIKE '%:nombre%'";
        TypedQuery<Cliente> q = em.createQuery(query, Cliente.class);
        q.setParameter("nombre", nombre);
        List<Cliente> listaP = (List<Cliente>) q.getResultList();
        em.getTransaction().commit();
        return (ArrayList<Cliente>) listaP;

    }
}
