/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Venta;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author crist
 */
public class VentasRepository extends BaseRepository<Venta> {

    private final ArrayList<Venta> ventas;

    public VentasRepository() {
        this.ventas = new ArrayList<>();
    }

    @Override
    public void guardar(Venta entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Venta proveedor = em.find(Venta.class, id);

        if (proveedor != null) {

            em.remove(proveedor);
        }

        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Venta entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        Venta venta = em.find(Venta.class, entidad.getId());
        if (venta != null) {
            venta.setCliente(entidad.getCliente());
            venta.setFecha(entidad.getFecha());
            venta.setDescuento(entidad.getDescuento());
            venta.setMontoFinal(entidad.getMontoFinal());
        }

        em.getTransaction().commit();
    }

    @Override
    public Venta buscarPorId(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        Venta venta = em.find(Venta.class, id);
        if (venta == null) {
            System.out.println("No se ha encontrado la venta");

        }
        em.getTransaction().commit();
        return venta;
    }

    @Override
    public ArrayList<Venta> buscarTodos() {
        ArrayList<Venta> venta;
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Venta.class));
        Query q = em.createQuery(criteria);
        List<Venta> listaVentas = q.getResultList();
        em.getTransaction().commit();
        return venta = new ArrayList(listaVentas);
    }

    public ArrayList<Venta> buscarPorfecha(Date fecha1, Date fecha2){
       Query query = createEntityManager().createQuery("Select v " + "from ventas " + "where v.fecha " + "Between "+fecha1+" and "+fecha2+"");
            List<Venta> list = (List<Venta>) query.getResultList();
            return (ArrayList<Venta>) list;
   }
}
