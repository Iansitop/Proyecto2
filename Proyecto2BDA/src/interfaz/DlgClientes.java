/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import repositorios.Control;

/**
 *
 * @author crist
 */
public class DlgClientes extends javax.swing.JFrame {

    /**
     * Creates new form DlgClientes
     */
    public DlgClientes() {
        initComponents();
        setLocationRelativeTo(null);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        actualizarTabla(c.getClientesRepository().buscarTodos());
        botonMenuClientes.setEnabled(false);
    }
    Control c = new Control();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonMenuClientes = new javax.swing.JButton();
        botonMenuProductos = new javax.swing.JButton();
        botonMenuVentas = new javax.swing.JButton();
        botonMenuCategorias = new javax.swing.JButton();
        botonMenuProveedores = new javax.swing.JButton();
        botonMenuCompra = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        id_cliente = new javax.swing.JTextField();
        nombre_cliente = new javax.swing.JTextField();
        rfc_cliente = new javax.swing.JTextField();
        telefono2_cli = new javax.swing.JTextField();
        direccion_cliente = new javax.swing.JTextField();
        telefono1_cli = new javax.swing.JTextField();
        boton_agregar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        campoTextoBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        boton_eliminar = new javax.swing.JButton();
        boton_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú clientes");

        botonMenuClientes.setBackground(new java.awt.Color(102, 102, 255));
        botonMenuClientes.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuClientes.setText("Clientes");
        botonMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuClientesActionPerformed(evt);
            }
        });

        botonMenuProductos.setBackground(new java.awt.Color(102, 102, 255));
        botonMenuProductos.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuProductos.setText("Productos");
        botonMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuProductosActionPerformed(evt);
            }
        });

        botonMenuVentas.setBackground(new java.awt.Color(102, 102, 255));
        botonMenuVentas.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuVentas.setText("Ventas");
        botonMenuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuVentasActionPerformed(evt);
            }
        });

        botonMenuCategorias.setBackground(new java.awt.Color(102, 102, 255));
        botonMenuCategorias.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuCategorias.setText("Categorías");
        botonMenuCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuCategoriasActionPerformed(evt);
            }
        });

        botonMenuProveedores.setBackground(new java.awt.Color(102, 102, 255));
        botonMenuProveedores.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuProveedores.setText("Proveedores");
        botonMenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuProveedoresActionPerformed(evt);
            }
        });

        botonMenuCompra.setBackground(new java.awt.Color(102, 102, 255));
        botonMenuCompra.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuCompra.setText("Compra");
        botonMenuCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonMenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonMenuProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonMenuProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonMenuCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonMenuCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(botonMenuVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMenuProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMenuCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMenuProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMenuCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMenuVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        id_cliente.setEditable(false);
        id_cliente.setText("ID");
        id_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_clienteActionPerformed(evt);
            }
        });

        nombre_cliente.setText("Nombre");
        nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_clienteActionPerformed(evt);
            }
        });
        nombre_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombre_clienteKeyPressed(evt);
            }
        });

        rfc_cliente.setText("RFC");
        rfc_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfc_clienteActionPerformed(evt);
            }
        });
        rfc_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rfc_clienteKeyPressed(evt);
            }
        });

        telefono2_cli.setText("Teléfono 2");
        telefono2_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono2_cliActionPerformed(evt);
            }
        });
        telefono2_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefono2_cliKeyPressed(evt);
            }
        });

        direccion_cliente.setText("Dirección");
        direccion_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion_clienteActionPerformed(evt);
            }
        });
        direccion_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direccion_clienteKeyPressed(evt);
            }
        });

        telefono1_cli.setText("Teléfono 1");
        telefono1_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono1_cliActionPerformed(evt);
            }
        });
        telefono1_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefono1_cliKeyPressed(evt);
            }
        });

        boton_agregar.setBackground(new java.awt.Color(102, 102, 255));
        boton_agregar.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar.setText("Agregar");
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        boton_limpiar.setBackground(new java.awt.Color(102, 102, 255));
        boton_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        boton_limpiar.setText("Cancelar");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(boton_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_cliente)
                    .addComponent(nombre_cliente)
                    .addComponent(rfc_cliente)
                    .addComponent(telefono2_cli)
                    .addComponent(direccion_cliente)
                    .addComponent(telefono1_cli))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rfc_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(direccion_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(telefono1_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(telefono2_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(boton_limpiar)
                .addGap(73, 73, 73))
        );

        campoTextoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoBuscarActionPerformed(evt);
            }
        });

        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "RFC", "Nombre", "Dirección", "Teléfono 1", "Teléfono 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_clientes);

        boton_eliminar.setBackground(new java.awt.Color(102, 102, 255));
        boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        boton_actualizar.setBackground(new java.awt.Color(102, 102, 255));
        boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        boton_actualizar.setText("Actualizar");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addComponent(jScrollPane1)
                    .addComponent(campoTextoBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(campoTextoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_eliminar)
                            .addComponent(boton_actualizar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoBuscarActionPerformed

    private void tabla_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clientesMouseClicked
        id_cliente.setText(tabla_clientes.getValueAt(tabla_clientes.getSelectedRow(), 0).toString());
        rfc_cliente.setText(tabla_clientes.getValueAt(tabla_clientes.getSelectedRow(), 1).toString());
        nombre_cliente.setText(tabla_clientes.getValueAt(tabla_clientes.getSelectedRow(), 2).toString());
        direccion_cliente.setText(tabla_clientes.getValueAt(tabla_clientes.getSelectedRow(), 3).toString());
        telefono1_cli.setText(tabla_clientes.getValueAt(tabla_clientes.getSelectedRow(), 4).toString());
        telefono2_cli.setText(tabla_clientes.getValueAt(tabla_clientes.getSelectedRow(), 5).toString());

        boton_actualizar.setVisible(true);
        boton_eliminar.setVisible(true);
        boton_agregar.setEnabled(false);
        boton_limpiar.setEnabled(false);
    }//GEN-LAST:event_tabla_clientesMouseClicked

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed

        int idCliente = Integer.valueOf(id_cliente.getText());
        c.getClientesRepository().eliminar(idCliente);

        id_cliente.setText("ID");
        nombre_cliente.setText("Nombre");
        rfc_cliente.setText("RFC");
        direccion_cliente.setText("Dirección");
        telefono1_cli.setText("Teléfono 1");
        telefono2_cli.setText("Teléfono 2");

        actualizarTabla(c.getClientesRepository().buscarTodos());

        boton_eliminar.setVisible(false);
        boton_actualizar.setVisible(false);
        boton_agregar.setVisible(true);
        boton_limpiar.setVisible(true);
        tabla_clientes.setFocusable(false);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        boton_agregar.setEnabled(true);
        boton_limpiar.setEnabled(true);
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        if (nombre_cliente.getText().equals("Nombre")
                || rfc_cliente.getText().equals("RFC") || direccion_cliente.getText().equals("Dirección")) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vacíos");
        }else{
        Cliente cliente = new Cliente();
        int idCliente = Integer.valueOf(id_cliente.getText());
        String rfc = rfc_cliente.getText();
        String nombre = nombre_cliente.getText();
        String direccion = direccion_cliente.getText();

        cliente.setId(idCliente);
        cliente.setRfc(rfc);
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        
        if (!telefono1_cli.getText().equals("Teléfono 1")) {
            String tel1 = telefono1_cli.getText();
            cliente.setTelefono1(tel1);
        }else{
            cliente.setTelefono1("");
        }
        if (!telefono2_cli.getText().equals("Teléfono 2")) {
            String tel2 = telefono2_cli.getText();
            cliente.setTelefono2(tel2);
        }else{
            cliente.setTelefono2("");
        }
        c.getClientesRepository().actualizar(cliente);
        }
        id_cliente.setText("ID");
        nombre_cliente.setText("Nombre");
        rfc_cliente.setText("RFC");
        direccion_cliente.setText("Dirección");
        telefono1_cli.setText("Teléfono 1");
        telefono2_cli.setText("Teléfono 2");
        actualizarTabla(c.getClientesRepository().buscarTodos());
        tabla_clientes.setFocusable(false);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        boton_agregar.setEnabled(true);
        boton_limpiar.setEnabled(true);
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void botonMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuClientesActionPerformed
        
    }//GEN-LAST:event_botonMenuClientesActionPerformed

    private void botonMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuProductosActionPerformed
        new DlgProductos().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuProductosActionPerformed

    private void botonMenuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuVentasActionPerformed
        new DlgVentas().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuVentasActionPerformed

    private void botonMenuCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCategoriasActionPerformed
        new DlgCategorias().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuCategoriasActionPerformed

    private void botonMenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuProveedoresActionPerformed
        new DlgProveedor().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuProveedoresActionPerformed

    private void botonMenuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCompraActionPerformed
        new DlgCompra().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuCompraActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        id_cliente.setText("ID");
        nombre_cliente.setText("Nombre");
        rfc_cliente.setText("RFC");
        direccion_cliente.setText("Dirección");
        telefono1_cli.setText("Teléfono 1");
        telefono2_cli.setText("Teléfono 2");
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        if (nombre_cliente.getText().equals("Nombre")
            || rfc_cliente.getText().equals("RFC") || direccion_cliente.getText().equals("Dirección")) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vacíos");
        }else{
            Cliente cliente = new Cliente();
            String rfc = rfc_cliente.getText();
            String nombre = nombre_cliente.getText();
            String direccion = direccion_cliente.getText();

            cliente.setRfc(rfc);
            cliente.setNombre(nombre);
            cliente.setDireccion(direccion);

            if (!telefono1_cli.getText().equals("Teléfono 1")) {
                String tel1 = telefono1_cli.getText();
                cliente.setTelefono1(tel1);
            }else{
                cliente.setTelefono1("");
            }
            if (!telefono2_cli.getText().equals("Teléfono 2")) {
                String tel2 = telefono2_cli.getText();
                cliente.setTelefono1(tel2);
            }else{
                cliente.setTelefono2("");
            }
            c.getClientesRepository().guardar(cliente);
            boton_limpiarActionPerformed(evt);
        }
        actualizarTabla(c.getClientesRepository().buscarTodos());
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void telefono1_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono1_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono1_cliActionPerformed

    private void direccion_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion_clienteActionPerformed

    private void telefono2_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono2_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono2_cliActionPerformed

    private void rfc_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfc_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfc_clienteActionPerformed

    private void nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_clienteActionPerformed

    private void id_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_clienteActionPerformed

    private void rfc_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfc_clienteKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (rfc_cliente.getText().length() > 14) {
            try {
                rfc_cliente.setText(rfc_cliente.getText(0, 14));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rfc_clienteKeyPressed

    private void nombre_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_clienteKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (nombre_cliente.getText().length() > 44) {
            try {
                nombre_cliente.setText(nombre_cliente.getText(0, 44));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_nombre_clienteKeyPressed

    private void direccion_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccion_clienteKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (direccion_cliente.getText().length() > 99) {
            try {
                direccion_cliente.setText(direccion_cliente.getText(0, 99));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_direccion_clienteKeyPressed

    private void telefono1_cliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono1_cliKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (telefono1_cli.getText().length() > 14) {
            try {
                telefono1_cli.setText(telefono1_cli.getText(0, 14));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_telefono1_cliKeyPressed

    private void telefono2_cliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono2_cliKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (telefono2_cli.getText().length() > 14) {
            try {
                telefono2_cli.setText(telefono2_cli.getText(0, 14));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_telefono2_cliKeyPressed
    
    
    public void actualizarTabla(ArrayList<Cliente> listaTabla) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID cliente", "RFC", "Nombre", "Dirección", "Teléfono 1", "Teléfono 2"});
        tabla_clientes.setModel(model);
        Object[] row = new Object[listaTabla.size()*6];
        for (int i = 0; i < listaTabla.size(); i++) {
                Cliente cliente=listaTabla.get(i);
                row[0] = cliente.getId();
                row[1] = cliente.getRfc();
                row[2] = cliente.getNombre();
                row[3] = cliente.getDireccion();
                row[4] = cliente.getTelefono1();
                row[5] = cliente.getTelefono2();
            model.addRow(row);
        }
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DlgClientes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMenuCategorias;
    private javax.swing.JButton botonMenuClientes;
    private javax.swing.JButton botonMenuCompra;
    private javax.swing.JButton botonMenuProductos;
    private javax.swing.JButton botonMenuProveedores;
    private javax.swing.JButton botonMenuVentas;
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JTextField campoTextoBuscar;
    private javax.swing.JTextField direccion_cliente;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombre_cliente;
    private javax.swing.JTextField rfc_cliente;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTextField telefono1_cli;
    private javax.swing.JTextField telefono2_cli;
    // End of variables declaration//GEN-END:variables
}
