/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Venta;
import entidades.VentaProducto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Usuario
 */
public class VentaProductoRepository extends BaseRepository<VentaProducto>{
    
    private final ArrayList<VentaProducto> ventaProducto;

    public VentaProductoRepository() {
        this.ventaProducto = new ArrayList();
    }
    
    @Override
    public void guardar(VentaProducto entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();

        VentaProducto ventaP = em.find(VentaProducto.class, id);
        if (ventaP != null) {
            em.remove(ventaP);
        }
        em.getTransaction().commit();
    }

    @Override
    public void actualizar(VentaProducto entidad) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        VentaProducto ventaP = em.find(VentaProducto.class, entidad.getId());
        if (ventaP != null) {
            ventaP.setCantidad(entidad.getCantidad());
            ventaP.setMontoTotal(entidad.getMontoTotal());
            ventaP.setPrecio(entidad.getPrecio());
            ventaP.setProducto(entidad.getProducto());
            ventaP.setVenta(entidad.getVenta());
        }

        em.getTransaction().commit();
    }

    @Override
    public VentaProducto buscarPorId(int id) {
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        
        VentaProducto ventaP = em.find(VentaProducto.class, id);
        if (ventaP == null) {
            System.out.println("No se ha encontrado la relación venta producto");

        }
        em.getTransaction().commit();
        return ventaP;
    }

    @Override
    public ArrayList<VentaProducto> buscarTodos() {
        ArrayList<VentaProducto> ventaP;
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(VentaProducto.class));
        Query q = em.createQuery(criteria);
        List<VentaProducto> listaVentaProducto = q.getResultList();
        em.getTransaction().commit();
        return ventaP = new ArrayList(listaVentaProducto);
    }
    
     public ArrayList<VentaProducto> buscarPorVenta(Venta venta) {
         ArrayList<VentaProducto> ventaP;
        EntityManager em = createEntityManager();
        em.getTransaction().begin();
        int id = venta.getId();
//      SELECT p FROM Producto p JOIN p.categoria c WHERE c.id = :idcategoria
        String query = "SELECT vp FROM VentaProducto vp JOIN vp.venta v WHERE v.id  = :idVenta";
        TypedQuery<VentaProducto> q = em.createQuery(query, VentaProducto.class);
        q.setParameter("idVenta", id);
        List<VentaProducto> listaVentaProducto = (List<VentaProducto>) q.getResultList();
        em.getTransaction().commit();
        return ventaP = new ArrayList(listaVentaProducto);

    }

    
}
