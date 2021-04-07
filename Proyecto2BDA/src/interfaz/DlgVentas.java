/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Cliente;
import entidades.Producto;
import entidades.Venta;
import entidades.VentaProducto;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import repositorios.Control;

/**
 *
 * @author Usuario
 */
public class DlgVentas extends javax.swing.JFrame {

    /**
     * Creates new form DlgVentas
     */
    public DlgVentas() {
        initComponents();
        botonMenuVentas.setEnabled(false);
        Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String fechaParaSQL = df.format(date);
        fecha1.setText(fechaParaSQL);
        fecha2.setText(fechaParaSQL);
        centraVentana();
    }
    Control c = new Control();
    
    private void centraVentana() {
    //Obtiene el tamaño de la pantalla
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    // Obtiene el tamaño de la ventana de la aplicación
    Dimension frameSize = getSize();
    // Se asegura que el tamaño de la ventana de la aplicación
    // no exceda el tamaño de la pantalla
    if (frameSize.height > screenSize.height) {
    frameSize.height = screenSize.height;
    }
    if (frameSize.width > screenSize.width) {
    frameSize.width = screenSize.width;
    }
    // Centra la ventana de la aplicación sobre la pantalla
    setLocation((screenSize.width - frameSize.width) / 2,
    (screenSize.height - frameSize.height) / 2);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JFormattedTextField();
        fecha2 = new javax.swing.JFormattedTextField();
        botonBuscar = new javax.swing.JButton();
        comboBoxClientes = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonMenuClientes = new javax.swing.JButton();
        botonMenuProductos = new javax.swing.JButton();
        botonMenuVentas = new javax.swing.JButton();
        botonMenuCategorias = new javax.swing.JButton();
        botonMenuProveedores = new javax.swing.JButton();
        botonMenuCompra = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_listaproductos = new javax.swing.JTable();
        campoId = new javax.swing.JTextField();
        campoCliente = new javax.swing.JTextField();
        campoSubtotal = new javax.swing.JTextField();
        campoDesc = new javax.swing.JTextField();
        campoTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        tabla_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID venta", "Cliente", "Fecha", "Subtotal", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ventasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_ventas);

        jLabel2.setText("Cliente");

        jLabel3.setText("Fechas(AAAA-MM-DD)");

        fecha1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        fecha2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        botonBuscar.setBackground(new java.awt.Color(102, 102, 255));
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        Cliente[] clientes=new Cliente[c.getClientesRepository().buscarTodos().size()+1];
        clientes[0]=new Cliente("RFC","Todos","123","","");
        for (int i = 0; i < c.getClientesRepository().buscarTodos().size(); i++) {
            clientes[i+1]=c.getClientesRepository().buscarTodos().get(i);
        }
        comboBoxClientes.setModel(new javax.swing.DefaultComboBoxModel<Cliente>(clientes));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBoxClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú ventas");

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
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        tabla_listaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID producto", "Nombre", "Precio", "Cantidad", "Monto total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_listaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_listaproductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_listaproductos);

        campoId.setEditable(false);

        campoCliente.setEditable(false);

        campoSubtotal.setEditable(false);

        campoDesc.setEditable(false);

        campoTotal.setEditable(false);

        jLabel4.setText("ID");

        jLabel5.setText("Cliente");

        jLabel6.setText("Subtotal");

        jLabel7.setText("Descuento");

        jLabel8.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuClientesActionPerformed
        new DlgClientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuClientesActionPerformed

    private void botonMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuProductosActionPerformed
        new DlgProductos().setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuProductosActionPerformed

    private void botonMenuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuVentasActionPerformed

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

    private void tabla_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ventasMouseClicked
        campoId.setText(tabla_ventas.getValueAt(tabla_ventas.getSelectedRow(), 0).toString());
        campoCliente.setText(tabla_ventas.getValueAt(tabla_ventas.getSelectedRow(), 1).toString());
        campoSubtotal.setText(tabla_ventas.getValueAt(tabla_ventas.getSelectedRow(), 3).toString());
        campoDesc.setText(tabla_ventas.getValueAt(tabla_ventas.getSelectedRow(), 4).toString());
        campoTotal.setText(tabla_ventas.getValueAt(tabla_ventas.getSelectedRow(), 5).toString());
        
        int id = Integer.valueOf(campoId.getText());
        Venta venta = c.getVentasRepository().buscarPorId(id);
        actualizarTablaListaProductos(c.getVentaProductoRepository().buscarPorVenta(venta));
        
    }//GEN-LAST:event_tabla_ventasMouseClicked

    private void tabla_listaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_listaproductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_listaproductosMouseClicked

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        if (comboBoxClientes.getSelectedIndex() == 0) {
            actualizarTablaVentas(c.getVentasRepository().buscarPorfecha(obtenerFecha1(), obtenerFecha2()));
        } else{
            Cliente cliente = (Cliente) comboBoxClientes.getSelectedItem();
            actualizarTablaVentas(c.getVentasRepository().buscarPorCliente(cliente, obtenerFecha1(), obtenerFecha2()));
        }

    }//GEN-LAST:event_botonBuscarActionPerformed
    //Cambiar el formato de la fecha
    public Date obtenerFecha1() {
        String f = fecha1.getText();
        String d = f.substring(0, 1);
        String m = f.substring(3, 4);
        String a = f.substring(6, 9);
        int dia = Integer.valueOf(d);
        int mes = Integer.valueOf(m);
        int anio = Integer.valueOf(a);
        return new Date(dia, mes, anio);
    }
    //Cambiar el formato de la fecha
    public Date obtenerFecha2() {
        String f = fecha2.getText();
        String d = f.substring(0, 1);
        String m = f.substring(3, 4);
        String a = f.substring(6, 9);
        int dia = Integer.valueOf(d);
        int mes = Integer.valueOf(m);
        int anio = Integer.valueOf(a);
        return new Date(dia, mes, anio);
    }

    public void actualizarTablaVentas(ArrayList<Venta> listaTabla) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID venta", "Cliente", "Fecha", "Subtotal", "Descuento", "Total"});
        tabla_ventas.setModel(model);
        Object[] row = new Object[listaTabla.size() * 6];
        for (int i = 0; i < listaTabla.size(); i++) {
            Venta venta = listaTabla.get(i);
            float desc = 100 - venta.getDescuento();
            float total = venta.getMontoFinal();
            float subtotal = total * 100 / desc;
            row[0] = venta.getId();
            row[1] = venta.getCliente().getNombre();
            row[2] = venta.getFecha();
            row[3] = subtotal;
            row[4] = venta.getDescuento();
            row[5] = venta.getMontoFinal();
            model.addRow(row);
        }
    }

    public void actualizarTablaListaProductos(ArrayList<VentaProducto> listaTabla) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID producto", "Nombre", "Precio", "Cantidad", "Monto total"});
        tabla_listaproductos.setModel(model);
        Object[] row = new Object[listaTabla.size() * 5];
        for (int i = 0; i < listaTabla.size(); i++) {
            VentaProducto vp = listaTabla.get(i);
            int cant = vp.getCantidad();
            float precioP = vp.getProducto().getPrecioactual();
            float total = cant * precioP;

            row[0] = vp.getId();
            row[1] = vp.getProducto().getNombre();
            row[2] = precioP;
            row[3] = cant;
            row[4] = total;

            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonMenuCategorias;
    private javax.swing.JButton botonMenuClientes;
    private javax.swing.JButton botonMenuCompra;
    private javax.swing.JButton botonMenuProductos;
    private javax.swing.JButton botonMenuProveedores;
    private javax.swing.JButton botonMenuVentas;
    private javax.swing.JTextField campoCliente;
    private javax.swing.JTextField campoDesc;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoSubtotal;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JComboBox<Cliente> comboBoxClientes;
    private javax.swing.JFormattedTextField fecha1;
    private javax.swing.JFormattedTextField fecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla_listaproductos;
    private javax.swing.JTable tabla_ventas;
    // End of variables declaration//GEN-END:variables
}
