/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2bda;

import entidades.*;
import java.sql.Date;
import repositorios.*;

/**
 *
 * @author Usuario
 */
public class Proyecto2BDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria categoria=new Categoria(1,"Frutas y Verdutas", "IDM");
        Cliente cliente=new Cliente(1,"6189553486ASG", "Jose Alberto Nieblas", "Zaragoza y niños Heores", "6441641525", "6441681861");
        Proveedor proveedor=new Proveedor(1,"GRW1573124123", "Frutilandia", "QuintanaRoo y 200", "frutilandia.com.mx", "6441898785");
        Producto producto=new Producto(1,"Pera", 10, 90, categoria, proveedor);
        Venta venta=new Venta(1,new Date(2020-1900, 02, 15), 10, 130, cliente);
        VentaProducto ventaproducto=new VentaProducto(1,producto, venta, producto.getPrecioactual(), 13, 117);
        CategoriaRepository categoriaRepo=new CategoriaRepository();
        ClientesRepository clienteRepo=new ClientesRepository();
        ProveedoresRepository proveedorRepo=new ProveedoresRepository();
        ProductoRepository productoRepo=new ProductoRepository();
        VentasRepository ventaRepo=new VentasRepository();
        VentaProductoRepository ventaProductoRepo=new VentaProductoRepository();
        
        
        
        
    }
    
}
