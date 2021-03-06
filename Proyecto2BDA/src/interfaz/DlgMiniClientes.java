/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import entidades.Cliente;
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
 * @author crist
 */
public class DlgMiniClientes extends javax.swing.JFrame {

    /**
     * Creates new form DlgClientes
     */
    public DlgMiniClientes() {
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

        jPanel5 = new javax.swing.JPanel();
        nombre_cliente = new javax.swing.JTextField();
        rfc_cliente = new javax.swing.JTextField();
        telefono2_cli = new javax.swing.JTextField();
        direccion_cliente = new javax.swing.JTextField();
        telefono1_cli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        boton_agregar = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(59, 166, 222));

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

        telefono2_cli.setText("Tel??fono 2");
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

        direccion_cliente.setText("Direcci??n");
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

        telefono1_cli.setText("Tel??fono 1");
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Men?? clientes");

        boton_agregar.setBackground(new java.awt.Color(13, 123, 186));
        boton_agregar.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar.setText("Agregar");
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        boton_limpiar.setBackground(new java.awt.Color(13, 123, 186));
        boton_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        boton_limpiar.setText("Salir");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_cliente)
                            .addComponent(rfc_cliente)
                            .addComponent(telefono2_cli)
                            .addComponent(direccion_cliente)
                            .addComponent(telefono1_cli)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(boton_agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_limpiar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        dispose();
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        if (nombre_cliente.getText().equals("Nombre")
            || rfc_cliente.getText().equals("RFC") || direccion_cliente.getText().equals("Direcci??n")) {
            JOptionPane.showMessageDialog(rootPane, "No deje campos vac??os");
        }else{
            Cliente cliente = new Cliente();
            String rfc = rfc_cliente.getText();
            String nombre = nombre_cliente.getText();
            String direccion = direccion_cliente.getText();

            cliente.setRfc(rfc);
            cliente.setNombre(nombre);
            cliente.setDireccion(direccion);

            if (!telefono1_cli.getText().equals("Tel??fono 1")) {
                String tel1 = telefono1_cli.getText();
                cliente.setTelefono1(tel1);
            }else{
                cliente.setTelefono1("");
            }
            if (!telefono2_cli.getText().equals("Tel??fono 2")) {
                String tel2 = telefono2_cli.getText();
                cliente.setTelefono1(tel2);
            }else{
                cliente.setTelefono2("");
            }
            c.getClientesRepository().guardar(cliente);
            boton_limpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_boton_agregarActionPerformed

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

    private void telefono1_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono1_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono1_cliActionPerformed

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

    private void direccion_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion_clienteActionPerformed

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

    private void telefono2_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono2_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefono2_cliActionPerformed

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

    private void rfc_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfc_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfc_clienteActionPerformed

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

    private void nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_clienteActionPerformed

    
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
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JTextField direccion_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nombre_cliente;
    private javax.swing.JTextField rfc_cliente;
    private javax.swing.JTextField telefono1_cli;
    private javax.swing.JTextField telefono2_cli;
    // End of variables declaration//GEN-END:variables
}
