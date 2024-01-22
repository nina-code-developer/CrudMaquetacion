package com.ninacode.crudmaquetacion.ui;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        opRegistrarTienda = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        opRegistrarTrabajadores = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        opRegistrarInformacionTienda = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opRegistrarProductos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        opRealizarVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jMenu2.setText("Supermercados");

        opRegistrarTienda.setText("Cargar Supermercados");
        opRegistrarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistrarTiendaActionPerformed(evt);
            }
        });
        jMenu2.add(opRegistrarTienda);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Trabajadores");

        opRegistrarTrabajadores.setText("Cargar Trabajadores");
        opRegistrarTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistrarTrabajadoresActionPerformed(evt);
            }
        });
        jMenu1.add(opRegistrarTrabajadores);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Informacion Tienda");

        opRegistrarInformacionTienda.setText("Cargar Sistema Tienda");
        opRegistrarInformacionTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistrarInformacionTiendaActionPerformed(evt);
            }
        });
        jMenu5.add(opRegistrarInformacionTienda);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Productos");

        opRegistrarProductos.setText("Cargar Productos");
        opRegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistrarProductosActionPerformed(evt);
            }
        });
        jMenu3.add(opRegistrarProductos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ventas");

        opRealizarVenta.setText("Realizar Venta");
        opRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRealizarVentaActionPerformed(evt);
            }
        });
        jMenu4.add(opRealizarVenta);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opRegistrarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegistrarTiendaActionPerformed
        RegistrarTienda verventana = new RegistrarTienda();
        escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_opRegistrarTiendaActionPerformed

    private void opRegistrarTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegistrarTrabajadoresActionPerformed
        RegistrarTrabajadores ventanaTrabajador = new RegistrarTrabajadores();
        escritorio.add(ventanaTrabajador);
        ventanaTrabajador.show();
    }//GEN-LAST:event_opRegistrarTrabajadoresActionPerformed

    private void opRegistrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegistrarProductosActionPerformed
        RegistrarProductos ventanaProductos = new RegistrarProductos();
        escritorio.add(ventanaProductos);
        ventanaProductos.show();
    }//GEN-LAST:event_opRegistrarProductosActionPerformed

    private void opRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRealizarVentaActionPerformed
        RegistrarVentas1 ventanaVenta = new RegistrarVentas1();
        escritorio.add(ventanaVenta);
        ventanaVenta.show();
    }//GEN-LAST:event_opRealizarVentaActionPerformed

    private void opRegistrarInformacionTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegistrarInformacionTiendaActionPerformed
        InfoTienda ventanaTienda = new InfoTienda();
        escritorio.add(ventanaTienda);
        ventanaTienda.show();
    }//GEN-LAST:event_opRegistrarInformacionTiendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opRealizarVenta;
    private javax.swing.JMenuItem opRegistrarInformacionTienda;
    private javax.swing.JMenuItem opRegistrarProductos;
    private javax.swing.JMenuItem opRegistrarTienda;
    private javax.swing.JMenuItem opRegistrarTrabajadores;
    // End of variables declaration//GEN-END:variables
}
