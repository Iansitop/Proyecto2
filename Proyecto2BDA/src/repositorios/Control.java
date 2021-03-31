/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

/**
 *
 * @author crist
 */
public class Control {

    CategoriaRepository cr;
    ClientesRepository clr;
    ProveedoresRepository pvr;
    ProductoRepository pdr;
    VentasRepository vnr;
    VentaProductoRepository vpr;
    
    public CategoriaRepository getCategoriaRepository() {
        if (this.cr != null) {
            return this.cr;
        } else {
            this.cr = new CategoriaRepository();
            return this.cr;
        }
    }
    
    public ClientesRepository getClientesRepository() {
        if (this.clr != null) {
            return this.clr;
        } else {
            this.clr = new ClientesRepository();
            return this.clr;
        }
    }
    
    public ProveedoresRepository getProveedoresRepository() {
        if (this.clr != null) {
            return this.pvr;
        } else {
            this.pvr = new ProveedoresRepository();
            return this.pvr;
        }
    }
    
    public ProductoRepository getProductoRepository() {
        if (this.pdr != null) {
            return this.pdr;
        } else {
            this.pdr = new ProductoRepository();
            return this.pdr;
        }
    }
    
    public VentasRepository getVentasRepository() {
        if (this.vnr != null) {
            return this.vnr;
        } else {
            this.vnr = new VentasRepository();
            return this.vnr;
        }
    }
    
    public VentaProductoRepository getVentaProductoRepository() {
        if (this.vpr != null) {
            return this.vpr;
        } else {
            this.vpr = new VentaProductoRepository();
            return this.vpr;
        }
    }
    
}
