/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Categoria;
import entidades.Cliente;
import entidades.Producto;
import entidades.Venta;
import entidades.VentaProducto;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import repositorios.Control;

/**
 *
 * @author Usuario
 */
public class DlgCompra extends javax.swing.JFrame {

    /**
     * Creates new form DlgCompra
     */
    public DlgCompra() {
        initComponents();
        setLocationRelativeTo(null);
        boton_eliminar.setVisible(false);
        //actualizarTabla(c.getVentaProductoRepository().buscarTodos());
        //AutoCompleteDecorator.decorate(comboBoxProductos);
        //comboBoxProductos.setSelectedItem(null);
    }
    Control c = new Control();
    ArrayList<Producto> carrito=new ArrayList();
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
        campoTextoDescuento = new javax.swing.JTextField();
        campoTextoSubTotal = new javax.swing.JTextField();
        campoTextoTotal = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        comboBoxClientes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaCompra = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonMenuClientes = new javax.swing.JButton();
        botonMenuProductos = new javax.swing.JButton();
        botonMenuVentas = new javax.swing.JButton();
        botonMenuCategorias = new javax.swing.JButton();
        botonMenuProveedores = new javax.swing.JButton();
        botonMenuCompra = new javax.swing.JButton();
        botonMas = new javax.swing.JButton();
        botonMenos = new javax.swing.JButton();
        campoTextoCantidadVentanilla = new javax.swing.JTextField();
        boton_eliminar = new javax.swing.JButton();
        botonAgregarProducto = new javax.swing.JButton();
        campoTextoSubTotalVentanilla = new javax.swing.JTextField();
        comboBoxProductos = new javax.swing.JComboBox<>();
        comboBoxCategorias = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        campoTextoDescuento.setText("Descuento");
        campoTextoDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoDescuentoActionPerformed(evt);
            }
        });
        campoTextoDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoDescuentoKeyPressed(evt);
            }
        });

        campoTextoSubTotal.setEditable(false);
        campoTextoSubTotal.setText("SubTotal");
        campoTextoSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoSubTotalActionPerformed(evt);
            }
        });
        campoTextoSubTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoSubTotalKeyPressed(evt);
            }
        });

        campoTextoTotal.setEditable(false);
        campoTextoTotal.setText("Total");
        campoTextoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoTotalActionPerformed(evt);
            }
        });
        campoTextoTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoTotalKeyPressed(evt);
            }
        });

        botonRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Pagar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
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

        Cliente[] clientes=new Cliente[c.getClientesRepository().buscarTodos().size()];
        for (int i = 0; i < c.getClientesRepository().buscarTodos().size(); i++) {
            clientes[i]=c.getClientesRepository().buscarTodos().get(i);
        }
        comboBoxClientes.setModel(new javax.swing.DefaultComboBoxModel<Cliente>(clientes));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTextoTotal)
                            .addComponent(campoTextoDescuento)
                            .addComponent(comboBoxClientes, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoTextoSubTotal)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(boton_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(campoTextoSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(campoTextoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(campoTextoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(boton_limpiar)
                .addGap(107, 107, 107))
        );

        tablaListaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaListaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListaCompraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaListaCompra);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú compras");

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
        botonMenuCompra.setEnabled(false);
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

        botonMas.setText("+");
        botonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasActionPerformed(evt);
            }
        });

        botonMenos.setText("-");
        botonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosActionPerformed(evt);
            }
        });

        campoTextoCantidadVentanilla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        campoTextoCantidadVentanilla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTextoCantidadVentanilla.setText("0");
        campoTextoCantidadVentanilla.setEnabled(false);
        campoTextoCantidadVentanilla.setFocusable(false);

        boton_eliminar.setBackground(new java.awt.Color(102, 102, 255));
        boton_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        botonAgregarProducto.setText("Agregar Producto");
        botonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductoActionPerformed(evt);
            }
        });

        campoTextoSubTotalVentanilla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        campoTextoSubTotalVentanilla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTextoSubTotalVentanilla.setText("0");
        campoTextoSubTotalVentanilla.setEnabled(false);

        Producto[] productos=new Producto[c.getProductoRepository().buscarTodos().size()];
        for (int i = 0; i < c.getProductoRepository().buscarTodos().size(); i++) {
            productos[i]=c.getProductoRepository().buscarTodos().get(i);
        }
        comboBoxProductos.setModel(new javax.swing.DefaultComboBoxModel<Producto>(productos));
        comboBoxProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxProductosItemStateChanged(evt);
            }
        });

        Categoria[] categorias=new Categoria[c.getCategoriaRepository().buscarTodos().size()+1];
        categorias[0]=new Categoria("Todos","");
        for (int i = 0; i < c.getCategoriaRepository().buscarTodos().size(); i++) {
            categorias[i+1]=c.getCategoriaRepository().buscarTodos().get(i);
        }
        comboBoxCategorias.setModel(new javax.swing.DefaultComboBoxModel<Categoria>(categorias));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoTextoCantidadVentanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(comboBoxCategorias, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBoxProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoTextoSubTotalVentanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(198, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(comboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(botonMenos))
                            .addComponent(campoTextoCantidadVentanilla)
                            .addComponent(campoTextoSubTotalVentanilla)
                            .addComponent(comboBoxProductos))
                        .addGap(29, 29, 29)
                        .addComponent(botonAgregarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_eliminar)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoDescuentoActionPerformed

    private void campoTextoDescuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoDescuentoKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoDescuento.getText().length() > 44) {
            try {
                campoTextoDescuento.setText(campoTextoDescuento.getText(0, 44));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoDescuentoKeyPressed

    private void campoTextoSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoSubTotalActionPerformed

    private void campoTextoSubTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoSubTotalKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoSubTotal.getText().length() > 14) {
            try {
                campoTextoSubTotal.setText(campoTextoSubTotal.getText(0, 14));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoSubTotalKeyPressed

    private void campoTextoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoTotalActionPerformed

    private void campoTextoTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoTotalKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoTotal.getText().length() > 99) {
            try {
                campoTextoTotal.setText(campoTextoTotal.getText(0, 99));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoTotalKeyPressed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        if (campoTextoDescuento.getText().equals("Descuento")
            || campoTextoSubTotal.getText().equals("SubTotal") || campoTextoTotal.getText().equals("Total")) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vacíos");
        }else{
            Venta venta = new Venta();
            String desc = campoTextoSubTotal.getText();
            String total = campoTextoTotal.getText();
            
            venta.setDescuento(Integer.parseInt(desc));
            venta.setMontoFinal(Integer.parseInt(total));
            Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            venta.setFecha(date);
            venta.setCliente(c.getClientesRepository().buscarPorId(((Cliente)comboBoxClientes.getSelectedItem()).getId()));
            
            c.getVentasRepository().guardar(venta);
            boton_limpiarActionPerformed(evt);
        }
        actualizarTabla(carrito);
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        
        campoTextoDescuento.setText("Descuento");
        campoTextoSubTotal.setText("SubTotal");
        campoTextoTotal.setText("Total");
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void tablaListaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListaCompraMouseClicked
        botonRegistrar.setEnabled(false);
        boton_limpiar.setEnabled(false);
    }//GEN-LAST:event_tablaListaCompraMouseClicked

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
        new DlgProveedor().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuProveedoresActionPerformed

    private void botonMenuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCompraActionPerformed
        
    }//GEN-LAST:event_botonMenuCompraActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed

        //int idVentaProducto = Integer.valueOf(id_cliente.getText());
        //Aquí va un Inner join que busque un nombre y regrese un ID
        //c.getVentaProductoRepository().eliminar(idVentaProducto);

        boton_limpiarActionPerformed(evt);

        actualizarTabla(carrito);

        boton_eliminar.setVisible(false);
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed
        float descuento;
        try{
            descuento=Float.parseFloat(campoTextoDescuento.getText())/100;
            Producto posicion=c.getProductoRepository().buscarPorId(comboBoxProductos.getItemAt(comboBoxProductos.getSelectedIndex()).getId());
            posicion.setPrecioactual(Float.parseFloat(campoTextoSubTotalVentanilla.getText()));
            posicion.setStock(Integer.parseInt(campoTextoCantidadVentanilla.getText()));
            carrito.add(posicion);
            actualizarTabla(carrito);
            actualizarPantalla();
            double subtotal=0;
            for (int i = 0; i < carrito.size(); i++) {
                subtotal+=carrito.get(i).getPrecioactual();
            }
            campoTextoSubTotal.setText(String.valueOf(subtotal));
            subtotal=subtotal-Math.floor((subtotal*descuento));
            campoTextoTotal.setText(String.valueOf(subtotal));
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane, "El descuento tiene que ser modificado a un valor numérico");
        }
    }//GEN-LAST:event_botonAgregarProductoActionPerformed

    private void botonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasActionPerformed
        String cantidad=String.valueOf(Integer.parseInt(campoTextoCantidadVentanilla.getText())+1);
        Producto posicion=c.getProductoRepository().buscarPorId(comboBoxProductos.getItemAt(comboBoxProductos.getSelectedIndex()).getId());
        //Aquí va un if cantidad > stock que no cambie
        if(posicion.getStock()-1<Integer.parseInt(campoTextoCantidadVentanilla.getText())){
            
        }else{
        campoTextoCantidadVentanilla.setText(cantidad);
        }
        actualizarPantalla();
    }//GEN-LAST:event_botonMasActionPerformed

    private void botonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenosActionPerformed
        if((Integer.parseInt(campoTextoCantidadVentanilla.getText())-1)<0){
        }else{
            String cantidad=String.valueOf(Integer.parseInt(campoTextoCantidadVentanilla.getText())-1);
            campoTextoCantidadVentanilla.setText(cantidad);
        }
        actualizarPantalla();
    }//GEN-LAST:event_botonMenosActionPerformed

    private void comboBoxProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxProductosItemStateChanged
        Producto posicion=c.getProductoRepository().buscarPorId(comboBoxProductos.getItemAt(comboBoxProductos.getSelectedIndex()).getId());
        if(posicion.getStock()<Integer.parseInt(campoTextoCantidadVentanilla.getText())){
            campoTextoCantidadVentanilla.setText(String.valueOf(posicion.getStock()));
        }
        actualizarPantalla();
    }//GEN-LAST:event_comboBoxProductosItemStateChanged

    public void actualizarTabla(ArrayList<Producto>listaTabla) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Cantidad", "Producto", "Precio"});
        tablaListaCompra.setModel(model);
        Object[] row = new Object[listaTabla.size()*3];
        for (int i = 0; i < listaTabla.size(); i++) {
                Producto producto=listaTabla.get(i);
                row[0] = producto.getStock();
                row[1] = producto.getNombre();
                row[2] = producto.getPrecioactual();
            model.addRow(row);
        }
    }
    
    public void actualizarPantalla(){
            Producto posicion=c.getProductoRepository().buscarPorId(comboBoxProductos.getItemAt(comboBoxProductos.getSelectedIndex()).getId());
        int cantidad=Integer.parseInt(campoTextoCantidadVentanilla.getText());
        float precio=posicion.getPrecioactual();
        double resultado=cantidad*precio;
        campoTextoSubTotalVentanilla.setText(String.valueOf(resultado));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonMas;
    private javax.swing.JButton botonMenos;
    private javax.swing.JButton botonMenuCategorias;
    private javax.swing.JButton botonMenuClientes;
    private javax.swing.JButton botonMenuCompra;
    private javax.swing.JButton botonMenuProductos;
    private javax.swing.JButton botonMenuProveedores;
    private javax.swing.JButton botonMenuVentas;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JTextField campoTextoCantidadVentanilla;
    private javax.swing.JTextField campoTextoDescuento;
    private javax.swing.JTextField campoTextoSubTotal;
    private javax.swing.JTextField campoTextoSubTotalVentanilla;
    private javax.swing.JTextField campoTextoTotal;
    private javax.swing.JComboBox<Categoria> comboBoxCategorias;
    private javax.swing.JComboBox<Cliente> comboBoxClientes;
    private javax.swing.JComboBox<Producto> comboBoxProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaListaCompra;
    // End of variables declaration//GEN-END:variables
}
