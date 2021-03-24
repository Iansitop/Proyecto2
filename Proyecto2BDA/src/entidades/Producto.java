/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table (name="Producto")
public class Producto implements Serializable {

    public Producto(int id, String nombre, float precioactual, int stock, Categoria categoria, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precioactual = precioactual;
        this.stock = stock;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }

    public Producto(String nombre, float precioactual, int stock, Categoria categoria, Proveedor proveedor) {
        this.nombre = nombre;
        this.precioactual = precioactual;
        this.stock = stock;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }

    public Producto() {
    }
    
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproducto")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name="nombre")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Column(name="precioactual")
    private float precioactual;

    public float getPrecioactual() {
        return precioactual;
    }

    public void setPrecioactual(float precioactual) {
        this.precioactual = precioactual;
    }
    
    @Column(name="stock")
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @ManyToOne
    @JoinColumn(name="idcategoria")
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    @ManyToOne
    @JoinColumn(name="idproveedor")
    private Proveedor proveedor;

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    @OneToMany(mappedBy="Producto",cascade=CascadeType.ALL)
    private List<VentaProducto> ventaProducto;

    public List<VentaProducto> getVentaProducto() {
        return ventaProducto;
    }

    public void setVentaProducto(List<VentaProducto> ventaProducto) {
        this.ventaProducto = ventaProducto;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", nombre=" + nombre + ", precioactual=" + precioactual + ", stock=" + stock + ", categoria=" + categoria + ", proveedor=" + proveedor + '}';
    }

    
    
}
