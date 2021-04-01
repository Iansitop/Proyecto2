/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Cliente;
import entidades.Proveedor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import repositorios.Control;

/**
 *
 * @author Usuario
 */
public class DlgProveedor extends javax.swing.JFrame {

    /**
     * Creates new form DlgProveedor
     */
    public DlgProveedor() {
        initComponents();
        setLocationRelativeTo(null);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        actualizarTabla(c.getProveedoresRepository().buscarTodos());
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

        campoTextoBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        campoTextoProveedor = new javax.swing.JTextField();
        campoTextoNombre = new javax.swing.JTextField();
        campoTextoRFC = new javax.swing.JTextField();
        campoTextoTelefono = new javax.swing.JTextField();
        campoTextoDireccion = new javax.swing.JTextField();
        campoTextoPaginaWeb = new javax.swing.JTextField();
        boton_agregar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_proveedores = new javax.swing.JTable();
        boton_eliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonMenuClientes = new javax.swing.JButton();
        botonMenuProductos = new javax.swing.JButton();
        botonMenuVentas = new javax.swing.JButton();
        botonMenuCategorias = new javax.swing.JButton();
        botonMenuProveedores = new javax.swing.JButton();
        botonMenuCompra = new javax.swing.JButton();
        boton_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoTextoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoBuscarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        campoTextoProveedor.setEditable(false);
        campoTextoProveedor.setText("ID");
        campoTextoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoProveedorActionPerformed(evt);
            }
        });

        campoTextoNombre.setText("Nombre");
        campoTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNombreActionPerformed(evt);
            }
        });
        campoTextoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoNombreKeyPressed(evt);
            }
        });

        campoTextoRFC.setText("RFC");
        campoTextoRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoRFCActionPerformed(evt);
            }
        });
        campoTextoRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoRFCKeyPressed(evt);
            }
        });

        campoTextoTelefono.setText("Teléfono");
        campoTextoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoTelefonoActionPerformed(evt);
            }
        });
        campoTextoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoTelefonoKeyPressed(evt);
            }
        });

        campoTextoDireccion.setText("Dirección");
        campoTextoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoDireccionActionPerformed(evt);
            }
        });
        campoTextoDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoDireccionKeyPressed(evt);
            }
        });

        campoTextoPaginaWeb.setText("Página Web");
        campoTextoPaginaWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoPaginaWebActionPerformed(evt);
            }
        });
        campoTextoPaginaWeb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoPaginaWebKeyPressed(evt);
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
                    .addComponent(campoTextoProveedor)
                    .addComponent(campoTextoNombre)
                    .addComponent(campoTextoRFC)
                    .addComponent(campoTextoTelefono)
                    .addComponent(campoTextoDireccion)
                    .addComponent(campoTextoPaginaWeb))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(campoTextoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTextoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTextoPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(boton_limpiar)
                .addGap(73, 73, 73))
        );

        tabla_proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Proveedor", "RFC", "Nombre", "Dirección", "Página Web", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_proveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_proveedores);

        boton_eliminar.setBackground(new java.awt.Color(102, 102, 255));
        boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú proveedores");

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
        botonMenuProveedores.setEnabled(false);
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

        boton_actualizar.setBackground(new java.awt.Color(102, 102, 255));
        boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        boton_actualizar.setText("Actualizar");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(campoTextoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_eliminar)
                            .addComponent(boton_actualizar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoBuscarActionPerformed

    private void campoTextoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoProveedorActionPerformed

    private void campoTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoNombreActionPerformed

    private void campoTextoRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoRFCActionPerformed

    private void campoTextoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoTelefonoActionPerformed

    private void campoTextoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoDireccionActionPerformed

    private void campoTextoPaginaWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoPaginaWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoPaginaWebActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        if (campoTextoNombre.getText().equals("Nombre")
            || campoTextoRFC.getText().equals("RFC") || campoTextoDireccion.getText().equals("Dirección")) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vacíos");
        }else{
            Proveedor proveedor = new Proveedor();
            String rfc = campoTextoRFC.getText();
            String nombre = campoTextoNombre.getText();
            String direccion = campoTextoDireccion.getText();

            proveedor.setRfc(rfc);
            proveedor.setNombre(nombre);
            proveedor.setDireccion(direccion);

            if (!campoTextoPaginaWeb.getText().equals("Página Web")) {
                String paginaW = campoTextoPaginaWeb.getText();
                proveedor.setPaginaWeb(paginaW);
            }else{
                proveedor.setPaginaWeb("");
            }
            if (!campoTextoTelefono.getText().equals("Teléfono")) {
                String tel = campoTextoTelefono.getText();
                proveedor.setTelefono(tel);
            }else{
                proveedor.setTelefono("");
            }
            c.getProveedoresRepository().guardar(proveedor);
            boton_limpiarActionPerformed(evt);
        }
        actualizarTabla(c.getProveedoresRepository().buscarTodos());
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        campoTextoProveedor.setText("ID");
        campoTextoNombre.setText("Nombre");
        campoTextoRFC.setText("RFC");
        campoTextoDireccion.setText("Dirección");
        campoTextoPaginaWeb.setText("Página Web");
        campoTextoTelefono.setText("Teléfono");
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void tabla_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_proveedoresMouseClicked
        campoTextoProveedor.setText(tabla_proveedores.getValueAt(tabla_proveedores.getSelectedRow(), 0).toString());
        campoTextoRFC.setText(tabla_proveedores.getValueAt(tabla_proveedores.getSelectedRow(), 1).toString());
        campoTextoNombre.setText(tabla_proveedores.getValueAt(tabla_proveedores.getSelectedRow(), 2).toString());
        campoTextoDireccion.setText(tabla_proveedores.getValueAt(tabla_proveedores.getSelectedRow(), 3).toString());
        campoTextoPaginaWeb.setText(tabla_proveedores.getValueAt(tabla_proveedores.getSelectedRow(), 4).toString());
        campoTextoTelefono.setText(tabla_proveedores.getValueAt(tabla_proveedores.getSelectedRow(), 5).toString());

        boton_actualizar.setVisible(true);
        boton_eliminar.setVisible(true);
        boton_agregar.setEnabled(false);
        boton_limpiar.setEnabled(false);
    }//GEN-LAST:event_tabla_proveedoresMouseClicked

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed

        int idProveedor = Integer.valueOf(campoTextoProveedor.getText());
        c.getProveedoresRepository().eliminar(idProveedor);

        boton_limpiarActionPerformed(evt);

        actualizarTabla(c.getProveedoresRepository().buscarTodos());

        boton_eliminar.setVisible(false);
        boton_actualizar.setVisible(false);
        boton_agregar.setVisible(true);
        boton_limpiar.setVisible(true);
        tabla_proveedores.setFocusable(false);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        boton_agregar.setEnabled(true);
        boton_limpiar.setEnabled(true);
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void botonMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuClientesActionPerformed
        new DlgClientes().setVisible(true);
        dispose();
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
        
    }//GEN-LAST:event_botonMenuProveedoresActionPerformed

    private void botonMenuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCompraActionPerformed
        new DlgCompra().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuCompraActionPerformed

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        if (campoTextoNombre.getText().equals("Nombre")
            || campoTextoRFC.getText().equals("RFC") || campoTextoDireccion.getText().equals("Dirección")) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vacíos");
        }else{
            Proveedor proveedor = new Proveedor();
            int idProveedor = Integer.valueOf(campoTextoProveedor.getText());
            String rfc = campoTextoRFC.getText();
            String nombre = campoTextoNombre.getText();
            String direccion = campoTextoDireccion.getText();

            proveedor.setId(idProveedor);
            proveedor.setRfc(rfc);
            proveedor.setNombre(nombre);
            proveedor.setDireccion(direccion);

            if (!campoTextoPaginaWeb.getText().equals("Página Web")) {
                String paginaW = campoTextoPaginaWeb.getText();
                proveedor.setPaginaWeb(paginaW);
            }else{
                proveedor.setPaginaWeb("");
            }
            if (!campoTextoTelefono.getText().equals("Teléfono")) {
                String tel = campoTextoTelefono.getText();
                proveedor.setTelefono(tel);
            }else{
                proveedor.setTelefono("");
            }
            c.getProveedoresRepository().actualizar(proveedor);
        }
        boton_limpiarActionPerformed(evt);
        actualizarTabla(c.getProveedoresRepository().buscarTodos());
        tabla_proveedores.setFocusable(false);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        boton_agregar.setEnabled(true);
        boton_limpiar.setEnabled(true);
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void campoTextoRFCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoRFCKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoRFC.getText().length() > 14) {
            try {
                campoTextoRFC.setText(campoTextoRFC.getText(0, 14));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoRFCKeyPressed

    private void campoTextoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoNombreKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoNombre.getText().length() > 44) {
            try {
                campoTextoNombre.setText(campoTextoNombre.getText(0, 44));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoNombreKeyPressed

    private void campoTextoDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoDireccionKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoDireccion.getText().length() > 44) {
            try {
                campoTextoDireccion.setText(campoTextoDireccion.getText(0, 44));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoDireccionKeyPressed

    private void campoTextoPaginaWebKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoPaginaWebKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoPaginaWeb.getText().length() > 499) {
            try {
                campoTextoPaginaWeb.setText(campoTextoPaginaWeb.getText(0, 499));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoPaginaWebKeyPressed

    private void campoTextoTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoTelefonoKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoTelefono.getText().length() > 19) {
            try {
                campoTextoTelefono.setText(campoTextoTelefono.getText(0, 19));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoTelefonoKeyPressed

    public void actualizarTabla(ArrayList<Proveedor> listaTabla) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID proveedor", "RFC", "Nombre", "Dirección", "Página Web", "Teléfono"});
        tabla_proveedores.setModel(model);
        Object[] row = new Object[listaTabla.size()*6];
        for (int i = 0; i < listaTabla.size(); i++) {
                Proveedor proveedor=listaTabla.get(i);
                row[0] = proveedor.getId();
                row[1] = proveedor.getRfc();
                row[2] = proveedor.getNombre();
                row[3] = proveedor.getDireccion();
                row[4] = proveedor.getPaginaWeb();
                row[5] = proveedor.getTelefono();
            model.addRow(row);
        }
    }

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
    private javax.swing.JTextField campoTextoDireccion;
    private javax.swing.JTextField campoTextoNombre;
    private javax.swing.JTextField campoTextoPaginaWeb;
    private javax.swing.JTextField campoTextoProveedor;
    private javax.swing.JTextField campoTextoRFC;
    private javax.swing.JTextField campoTextoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_proveedores;
    // End of variables declaration//GEN-END:variables
}
