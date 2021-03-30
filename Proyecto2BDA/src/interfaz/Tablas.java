/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class Tablas {

    private String nombresColumnasCliente[] = {"ID cliente", "RFC", "Nombre", "Dirección", "Teléfono 1", "Teléfono 2"};

    public DefaultTableModel clientesTableModel(ArrayList<Cliente> listaClientes) {
        Object tabla[][];
        if (listaClientes != null) {
            tabla = new Object[listaClientes.size()][5];
            for (int i = 0; i < listaClientes.size(); i++) {

                Cliente clientes = listaClientes.get(i);

                tabla[i][0] = clientes.getId();
                tabla[i][1] = clientes.getRfc();
                tabla[i][2] = clientes.getNombre();
                tabla[i][3] = clientes.getDireccion();
                tabla[i][4] = clientes.getTelefono1();
                tabla[i][5] = clientes.getTelefono2();
                
            }
            return new DefaultTableModel(tabla, nombresColumnasCliente);
        }
        return null;
    }
}
