/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Categoria;
import entidades.Producto;
import entidades.Proveedor;
import java.awt.event.KeyEvent;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

import repositorios.Control;

/**
 *
 * @author Usuario
 */
public class DlgProductos extends javax.swing.JFrame {

    /**
     * Creates new form DlgProductos
     */
    public DlgProductos() {
        initComponents();
        setLocationRelativeTo(null);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        actualizarTabla(c.getProductoRepository().buscarTodos());
        botonMenuProductos.setEnabled(false);
        comboBoxCategoria.setToolTipText("Categorias");
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

        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        id_producto = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        nombre_producto = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        boton_agregar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        comboBoxProveedor = new javax.swing.JComboBox<>();
        botonRedireccionaCategorias = new javax.swing.JButton();
        botonRedireccionaProveedores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
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
        campoTextoBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(150, 198, 112));

        id_producto.setEditable(false);
        id_producto.setText("ID");
        id_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_productoActionPerformed(evt);
            }
        });

        precio.setText("Precio");
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });

        nombre_producto.setText("Nombre");
        nombre_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_productoActionPerformed(evt);
            }
        });
        nombre_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombre_productoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_productoKeyTyped(evt);
            }
        });

        stock.setText("Stock");
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stockKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockKeyTyped(evt);
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

        Categoria[] categorias=new Categoria[c.getCategoriaRepository().buscarTodos().size()];
        for (int i = 0; i < c.getCategoriaRepository().buscarTodos().size(); i++) {
            categorias[i]=c.getCategoriaRepository().buscarTodos().get(i);
        }
        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<Categoria>(categorias));

        Proveedor[] proveedores=new Proveedor[c.getProveedoresRepository().buscarTodos().size()];
        for (int i = 0; i < c.getProveedoresRepository().buscarTodos().size(); i++) {
            proveedores[i]=c.getProveedoresRepository().buscarTodos().get(i);
        }
        comboBoxProveedor.setModel(new javax.swing.DefaultComboBoxModel<Proveedor>(proveedores));

        botonRedireccionaCategorias.setText("+");
        botonRedireccionaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRedireccionaCategoriasActionPerformed(evt);
            }
        });

        botonRedireccionaProveedores.setText("+");
        botonRedireccionaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRedireccionaProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(boton_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_producto)
                            .addComponent(precio)
                            .addComponent(nombre_producto)
                            .addComponent(stock)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboBoxProveedor, 0, 133, Short.MAX_VALUE)
                                    .addComponent(comboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(botonRedireccionaCategorias)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(botonRedireccionaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(id_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxCategoria)
                    .addComponent(botonRedireccionaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRedireccionaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(boton_limpiar)
                .addGap(73, 73, 73))
        );

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID producto", "Nombre", "Precio", "Stock", "Categoría", "Proveedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_productos);

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
        jLabel1.setText("Menú productos");

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
        botonMenuCategorias.setText("Categorías");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
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
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void id_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_productoActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyPressed

    }//GEN-LAST:event_precioKeyPressed

    private void nombre_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_productoActionPerformed

    private void nombre_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_productoKeyPressed

    }//GEN-LAST:event_nombre_productoKeyPressed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void stockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyPressed

    }//GEN-LAST:event_stockKeyPressed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        if (precio.getText().equals("Precio")
                || nombre_producto.getText().equals("Nombre") || stock.getText().equals("Stock")
                || comboBoxCategoria.getSelectedIndex() == -1 || comboBoxProveedor.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vacíos");
        } else {
            Producto producto = new Producto();
            int stockP = Integer.valueOf(stock.getText());
            float precioP = Float.parseFloat(precio.getText());
            String nombre = nombre_producto.getText();
            Categoria cat = (Categoria) comboBoxCategoria.getSelectedItem();
            Proveedor prov = (Proveedor) comboBoxProveedor.getSelectedItem();

            producto.setNombre(nombre);
            producto.setPrecioactual(precioP);
            producto.setStock(stockP);
            producto.setCategoria(cat);
            producto.setProveedor(prov);

            c.getProductoRepository().guardar(producto);
            boton_limpiarActionPerformed(evt);
        }
        actualizarTabla(c.getProductoRepository().buscarTodos());

    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        id_producto.setText("ID");
        precio.setText("Precio");
        nombre_producto.setText("Nombre");
        stock.setText("Stock");
        comboBoxCategoria.setSelectedIndex(-1);
        comboBoxProveedor.setSelectedIndex(-1);

    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void tabla_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_productosMouseClicked
        id_producto.setText(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 0).toString());
        nombre_producto.setText(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 1).toString());
        precio.setText(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 2).toString());
        stock.setText(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 3).toString());

        Categoria[] categorias = new Categoria[c.getCategoriaRepository().buscarTodos().size()];
        for (int i = 0; i < c.getCategoriaRepository().buscarTodos().size(); i++) {
            if (c.getCategoriaRepository().buscarTodos().get(i).equals(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 4))) {
                comboBoxCategoria.setSelectedIndex(i);

            }
        }

        Proveedor[] proveedores = new Proveedor[c.getProveedoresRepository().buscarTodos().size()];
        for (int i = 0; i < c.getProveedoresRepository().buscarTodos().size(); i++) {
            if (c.getProveedoresRepository().buscarTodos().get(i).equals(tabla_productos.getValueAt(tabla_productos.getSelectedRow(), 5))) {
                comboBoxProveedor.setSelectedIndex(i);
            }

        }
        boton_actualizar.setVisible(true);
        boton_eliminar.setVisible(true);
        boton_agregar.setEnabled(false);
        boton_limpiar.setEnabled(false);
    }//GEN-LAST:event_tabla_productosMouseClicked

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed

        int id = Integer.valueOf(id_producto.getText());
        c.getProductoRepository().eliminar(id);

        boton_limpiarActionPerformed(evt);

        actualizarTabla(c.getProductoRepository().buscarTodos());

        boton_eliminar.setVisible(false);
        boton_actualizar.setVisible(false);
        boton_agregar.setVisible(true);
        boton_limpiar.setVisible(true);
        tabla_productos.setFocusable(false);
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

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        if (precio.getText().equals("Precio")
                || nombre_producto.getText().equals("Nombre") || stock.getText().equals("Stock")
                || comboBoxCategoria.getSelectedIndex() == -1 || comboBoxProveedor.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vacíos");
        } else {
            Producto cliente = new Producto();
            int id = Integer.valueOf(id_producto.getText());
            Producto producto = new Producto();
            int stockP = Integer.valueOf(stock.getText());
            float precioP = Float.parseFloat(precio.getText());
            String nombre = nombre_producto.getText();
            Categoria cat = (Categoria) comboBoxCategoria.getSelectedItem();
            Proveedor prov = (Proveedor) comboBoxProveedor.getSelectedItem();

            producto.setNombre(nombre);
            producto.setPrecioactual(precioP);
            producto.setStock(stockP);
            producto.setCategoria(cat);
            producto.setProveedor(prov);
            producto.setId(id);

            c.getProductoRepository().actualizar(producto);
            boton_limpiarActionPerformed(evt);

        }

        actualizarTabla(c.getProductoRepository().buscarTodos());
        tabla_productos.setFocusable(false);
        boton_actualizar.setVisible(false);
        boton_eliminar.setVisible(false);
        boton_agregar.setEnabled(true);
        boton_limpiar.setEnabled(true);
    }//GEN-LAST:event_boton_actualizarActionPerformed
    public void actualizarTabla(ArrayList<Producto> listaTabla) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID producto", "Nombre", "Precio", "Stock", "Categoria", "Proveedor"});
        tabla_productos.setModel(model);
        Object[] row = new Object[listaTabla.size() * 6];
        for (int i = 0; i < listaTabla.size(); i++) {
            Producto producto = listaTabla.get(i);
            row[0] = producto.getId();
            row[1] = producto.getNombre();
            row[2] = producto.getPrecioactual();
            row[3] = producto.getStock();
            row[4] = producto.getCategoria().getNombre();
            row[5] = producto.getProveedor().getNombre();
            model.addRow(row);
        }
    }


    private void campoTextoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoBuscarActionPerformed

    }//GEN-LAST:event_campoTextoBuscarActionPerformed

    private void nombre_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_productoKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo letras");
        }

        if (evt.getKeyCode() == 8) {
        } else if (nombre_producto.getText().length() > 99) {
            try {
                nombre_producto.setText(nombre_producto.getText(0, 99));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_nombre_productoKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
        if (!Character.isDigit(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números");
        }

        if (evt.getKeyCode() == 8) {
        } else if (precio.getText().length() > 8) {
            try {
                precio.setText(precio.getText(0, 8));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_precioKeyTyped

    private void stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyTyped
        if (!Character.isDigit(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números");
        }

        if (evt.getKeyCode() == 8) {
        } else if (stock.getText().length() > 5) {
            try {
                stock.setText(stock.getText(0, 5));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_stockKeyTyped

    private void campoTextoBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoBuscarKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)
                && !(Character.isDigit(evt.getKeyChar()))) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo letras y números");
        }

    }//GEN-LAST:event_campoTextoBuscarKeyTyped

    private void campoTextoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoBuscarKeyReleased
        if(!campoTextoBuscar.getText().isEmpty()){
            if(campoTextoBuscar.getText().matches("[A-Za-z]+")){
                actualizarTabla(c.getProductoRepository().buscarProductoPorNombre(campoTextoBuscar.getText()));
            }else if(campoTextoBuscar.getText().matches("[0-9]+")){
                int id = Integer.valueOf(campoTextoBuscar.getText());
                actualizarTabla(c.getProductoRepository().buscarProductoPorId(id));
            }
        }else if(campoTextoBuscar.getText().equalsIgnoreCase("")){
            actualizarTabla(c.getProductoRepository().buscarTodos());
        }
    }//GEN-LAST:event_campoTextoBuscarKeyReleased

    private void botonRedireccionaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRedireccionaCategoriasActionPerformed
        new DlgMiniCategorias().setVisible(true);
    }//GEN-LAST:event_botonRedireccionaCategoriasActionPerformed

    private void botonRedireccionaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRedireccionaProveedoresActionPerformed
        new DlgMiniProveedor().setVisible(true);
    }//GEN-LAST:event_botonRedireccionaProveedoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMenuCategorias;
    private javax.swing.JButton botonMenuClientes;
    private javax.swing.JButton botonMenuCompra;
    private javax.swing.JButton botonMenuProductos;
    private javax.swing.JButton botonMenuProveedores;
    private javax.swing.JButton botonMenuVentas;
    private javax.swing.JButton botonRedireccionaCategorias;
    private javax.swing.JButton botonRedireccionaProveedores;
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JTextField campoTextoBuscar;
    private javax.swing.JComboBox<Categoria> comboBoxCategoria;
    private javax.swing.JComboBox<Proveedor> comboBoxProveedor;
    private javax.swing.JTextField id_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombre_producto;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField stock;
    private javax.swing.JTable tabla_productos;
    // End of variables declaration//GEN-END:variables
}
