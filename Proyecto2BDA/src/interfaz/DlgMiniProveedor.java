/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Cliente;
import entidades.Proveedor;
import java.awt.event.KeyEvent;
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
public class DlgMiniProveedor extends javax.swing.JFrame {

    /**
     * Creates new form DlgProveedor
     */
    public DlgMiniProveedor() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        campoTextoNombre = new javax.swing.JTextField();
        campoTextoRFC = new javax.swing.JTextField();
        campoTextoTelefono = new javax.swing.JTextField();
        campoTextoDireccion = new javax.swing.JTextField();
        campoTextoPaginaWeb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boton_agregar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(150, 198, 112));

        jPanel3.setBackground(new java.awt.Color(150, 198, 112));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú proveedores");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(campoTextoPaginaWeb)
                .addComponent(campoTextoDireccion)
                .addComponent(campoTextoNombre)
                .addComponent(campoTextoRFC))
            .addComponent(campoTextoTelefono)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(campoTextoRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoTextoPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(campoTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

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
        boton_limpiar.setText("Salir");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_limpiar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        dispose();
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void campoTextoPaginaWebKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoPaginaWebKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoPaginaWeb.getText().length() > 499) {
            try {
                campoTextoPaginaWeb.setText(campoTextoPaginaWeb.getText(0, 499));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgMiniProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoPaginaWebKeyPressed

    private void campoTextoPaginaWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoPaginaWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoPaginaWebActionPerformed

    private void campoTextoDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoDireccionKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoDireccion.getText().length() > 44) {
            try {
                campoTextoDireccion.setText(campoTextoDireccion.getText(0, 44));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgMiniProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoDireccionKeyPressed

    private void campoTextoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoDireccionActionPerformed

    private void campoTextoTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoTelefonoKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoTelefono.getText().length() > 19) {
            try {
                campoTextoTelefono.setText(campoTextoTelefono.getText(0, 19));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgMiniProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoTelefonoKeyPressed

    private void campoTextoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoTelefonoActionPerformed

    private void campoTextoRFCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoRFCKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoRFC.getText().length() > 14) {
            try {
                campoTextoRFC.setText(campoTextoRFC.getText(0, 14));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgMiniProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoRFCKeyPressed

    private void campoTextoRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoRFCActionPerformed

    private void campoTextoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoNombreKeyPressed
        if (evt.getKeyCode() == 8) {
        } else if (campoTextoNombre.getText().length() > 44) {
            try {
                campoTextoNombre.setText(campoTextoNombre.getText(0, 44));
            } catch (BadLocationException ex) {
                Logger.getLogger(DlgMiniProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_campoTextoNombreKeyPressed

    private void campoTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JTextField campoTextoDireccion;
    private javax.swing.JTextField campoTextoNombre;
    private javax.swing.JTextField campoTextoPaginaWeb;
    private javax.swing.JTextField campoTextoRFC;
    private javax.swing.JTextField campoTextoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
