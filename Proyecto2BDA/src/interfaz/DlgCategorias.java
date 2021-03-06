/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Categoria;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.paint.Color.rgb;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import repositorios.Control;

/**
 *
 * @author crist
 */
public class DlgCategorias extends javax.swing.JFrame {

    /**
     * Creates new form DlgCategorias
     */
    public DlgCategorias() {
        initComponents();
        setLocationRelativeTo(null);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        actualizarTabla(c.getCategoriaRepository().buscarTodos());
        botonMenuCategorias.setEnabled(false);

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
        panel_izq = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        id_cat = new javax.swing.JTextField();
        nombre_categoria = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        boton_agregar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_categorias = new javax.swing.JTable();
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
        campoTextoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoTextoBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoBuscarKeyTyped(evt);
            }
        });

        panel_izq.setBackground(new java.awt.Color(150, 198, 112));

        id_cat.setEditable(false);
        id_cat.setText("ID");
        id_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_catActionPerformed(evt);
            }
        });

        nombre_categoria.setText("Nombre");
        nombre_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_categoriaActionPerformed(evt);
            }
        });
        nombre_categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_categoriaKeyTyped(evt);
            }
        });

        descripcion.setText("Descripci??n");
        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });
        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionKeyTyped(evt);
            }
        });

        boton_agregar.setBackground(new java.awt.Color(123, 183, 70));
        boton_agregar.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar.setText("Agregar");
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        boton_limpiar.setBackground(new java.awt.Color(123, 183, 70));
        boton_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        boton_limpiar.setText("Cancelar");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_izqLayout = new javax.swing.GroupLayout(panel_izq);
        panel_izq.setLayout(panel_izqLayout);
        panel_izqLayout.setHorizontalGroup(
            panel_izqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panel_izqLayout.createSequentialGroup()
                .addGroup(panel_izqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_izqLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(id_cat))
                    .addGroup(panel_izqLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                    .addGroup(panel_izqLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombre_categoria)))
                .addContainerGap())
            .addGroup(panel_izqLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panel_izqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_izqLayout.setVerticalGroup(
            panel_izqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_izqLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(id_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombre_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(boton_limpiar)
                .addGap(53, 53, 53))
        );

        tabla_categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Categor??a", "Nombre", "Descripci??n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_categoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_categorias);

        boton_eliminar.setBackground(new java.awt.Color(123, 183, 70));
        boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(150, 198, 112));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Men?? categor??as");

        botonMenuClientes.setBackground(new java.awt.Color(123, 183, 70));
        botonMenuClientes.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuClientes.setText("Clientes");
        botonMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuClientesActionPerformed(evt);
            }
        });

        botonMenuProductos.setBackground(new java.awt.Color(123, 183, 70));
        botonMenuProductos.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuProductos.setText("Productos");
        botonMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuProductosActionPerformed(evt);
            }
        });

        botonMenuVentas.setBackground(new java.awt.Color(123, 183, 70));
        botonMenuVentas.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuVentas.setText("Ventas");
        botonMenuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuVentasActionPerformed(evt);
            }
        });

        botonMenuCategorias.setBackground(new java.awt.Color(123, 183, 70));
        botonMenuCategorias.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuCategorias.setText("Categor??as");
        botonMenuCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuCategoriasActionPerformed(evt);
            }
        });

        botonMenuProveedores.setBackground(new java.awt.Color(123, 183, 70));
        botonMenuProveedores.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuProveedores.setText("Proveedores");
        botonMenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuProveedoresActionPerformed(evt);
            }
        });

        botonMenuCompra.setBackground(new java.awt.Color(123, 183, 70));
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

        boton_actualizar.setBackground(new java.awt.Color(123, 183, 70));
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
                .addComponent(panel_izq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_izq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(campoTextoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_eliminar)
                            .addComponent(boton_actualizar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoBuscarActionPerformed

    private void id_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_catActionPerformed

    private void nombre_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_categoriaActionPerformed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        if (nombre_categoria.getText().equals("Nombre")
                || descripcion.getText().equals("Descripci??n")) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vac??os");
        } else {
            Categoria cat = new Categoria();
            String des = descripcion.getText();
            String nombre = nombre_categoria.getText();

            cat.setDescripcion(des);
            cat.setNombre(nombre);

            c.getCategoriaRepository().guardar(cat);
            boton_limpiarActionPerformed(evt);
        }
        actualizarTabla(c.getCategoriaRepository().buscarTodos());
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        id_cat.setText("ID");
        nombre_categoria.setText("Nombre");
        descripcion.setText("Descripci??n");
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void tabla_categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_categoriasMouseClicked
        id_cat.setText(tabla_categorias.getValueAt(tabla_categorias.getSelectedRow(), 0).toString());
        nombre_categoria.setText(tabla_categorias.getValueAt(tabla_categorias.getSelectedRow(), 1).toString());
        descripcion.setText(tabla_categorias.getValueAt(tabla_categorias.getSelectedRow(), 2).toString());

        boton_actualizar.setVisible(true);
        boton_eliminar.setVisible(true);
        boton_agregar.setEnabled(false);
        boton_limpiar.setEnabled(false);
    }//GEN-LAST:event_tabla_categoriasMouseClicked

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed

        int id = Integer.valueOf(id_cat.getText());
        c.getClientesRepository().eliminar(id);

        boton_limpiarActionPerformed(evt);

        actualizarTabla(c.getCategoriaRepository().buscarTodos());

        boton_eliminar.setVisible(false);
        boton_actualizar.setVisible(false);
        boton_agregar.setVisible(true);
        boton_limpiar.setVisible(true);
        tabla_categorias.setFocusable(false);
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

    }//GEN-LAST:event_botonMenuCategoriasActionPerformed

    private void botonMenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuProveedoresActionPerformed
        new DlgProveedor().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuProveedoresActionPerformed

    private void botonMenuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCompraActionPerformed
        new DlgCompra().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuCompraActionPerformed

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        if (nombre_categoria.getText().equals("Nombre")
                || descripcion.getText().equals("Descripci??n")) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vac??os");
        } else {
            Categoria cat = new Categoria();
            int id = Integer.valueOf(id_cat.getText());
            String des = descripcion.getText();
            String nombre = nombre_categoria.getText();

            cat.setId(id);
            cat.setNombre(nombre);
            cat.setDescripcion(des);

            c.getCategoriaRepository().actualizar(cat);
        }
        boton_limpiarActionPerformed(evt);
        actualizarTabla(c.getCategoriaRepository().buscarTodos());
        tabla_categorias.setFocusable(false);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        boton_agregar.setEnabled(true);
        boton_limpiar.setEnabled(true);
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void nombre_categoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_categoriaKeyTyped
        if (evt.getKeyCode() == 8) {
        } else if (nombre_categoria.getText().length() > 44) {
            try {
                nombre_categoria.setText(nombre_categoria.getText(0, 44));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_nombre_categoriaKeyTyped

    private void descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyTyped
        if (evt.getKeyCode() == 8) {
        } else if (nombre_categoria.getText().length() > 99) {
            try {
                nombre_categoria.setText(nombre_categoria.getText(0, 99));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_descripcionKeyTyped

    private void campoTextoBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoBuscarKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)
                && !(Character.isDigit(evt.getKeyChar()))) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese s??lo letras y n??meros");
        }

    }//GEN-LAST:event_campoTextoBuscarKeyTyped

    private void campoTextoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoBuscarKeyReleased
        if (!campoTextoBuscar.getText().isEmpty()) {
            if (campoTextoBuscar.getText().matches("[A-Za-z]+")) {
                actualizarTabla(c.getCategoriaRepository().buscarCategoriaPorNombre(campoTextoBuscar.getText()));
            } else if (campoTextoBuscar.getText().matches("[0-9]+")) {
                int id = Integer.valueOf(campoTextoBuscar.getText());
                actualizarTabla(c.getCategoriaRepository().buscarCategoriaPorId(id));
            }
        }else if(campoTextoBuscar.getText().equalsIgnoreCase("")){
            actualizarTabla(c.getCategoriaRepository().buscarTodos());
        }
    }//GEN-LAST:event_campoTextoBuscarKeyReleased

    public void actualizarTabla(ArrayList<Categoria> listaTabla) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID categor??a", "Nombre", "Descripci??n"});
        tabla_categorias.setModel(model);
        Object[] row = new Object[listaTabla.size() * 3];
        for (int i = 0; i < listaTabla.size(); i++) {
            Categoria cat = listaTabla.get(i);
            row[0] = cat.getId();
            row[1] = cat.getNombre();
            row[2] = cat.getDescripcion();

            model.addRow(row);
        }
    }
    /**
     * @param args the command line arguments
     */


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
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField id_cat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombre_categoria;
    private javax.swing.JPanel panel_izq;
    private javax.swing.JTable tabla_categorias;
    // End of variables declaration//GEN-END:variables
}
