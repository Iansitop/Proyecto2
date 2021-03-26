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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "proveedores")
public class Proveedor implements Serializable {

    public Proveedor() {
    }

    public Proveedor(int id, String rfc, String nombre, String direccion, String paginaWeb, String telefono) {
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.paginaWeb = paginaWeb;
        this.telefono = telefono;
    }

    public Proveedor(String rfc, String nombre, String direccion, String paginaWeb, String telefono) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.paginaWeb = paginaWeb;
        this.telefono = telefono;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idproveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "rfc",unique=true)
    private String rfc;

    public String getRfc() {
        return rfc;
    }

    @Column(name = "nombre")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "direccion")
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name = "paginaWeb")
    private String paginaWeb;

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    @Column(name = "telefono")
    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono1(String telefono) {
        this.telefono = telefono;
    }

    @OneToMany(mappedBy = "proveedor",cascade=CascadeType.ALL)
    private List<Producto> listaProducto;

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
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
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", rfc=" + rfc + ", nombre=" + nombre + ", direccion=" + direccion + ", paginaWeb=" + paginaWeb + ", telefono=" + telefono + '}';
    }

}
