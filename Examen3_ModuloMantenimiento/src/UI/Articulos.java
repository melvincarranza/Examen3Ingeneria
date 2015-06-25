
package UI;

public class Articulos extends javax.swing.JDialog {
  
    Mantenimiento mantenimiento = Mantenimiento.getInstanciaMantenimiento();
    
    public Articulos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_editarArticulo = new javax.swing.JButton();
        lb_articulos = new javax.swing.JLabel();
        cb_articulos = new javax.swing.JComboBox();
        bt_cancelar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        bt_editarArticulo.setText("Editar Artículo");
        bt_editarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarArticuloActionPerformed(evt);
            }
        });

        lb_articulos.setText("Escoja el articulo a editar");

        cb_articulos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        bt_eliminar.setText("Eliminar Artículo");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_articulos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_articulos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bt_editarArticulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lb_articulos)
                .addGap(34, 34, 34)
                .addComponent(cb_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(bt_editarArticulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_eliminar)
                    .addComponent(bt_cancelar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_editarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarArticuloActionPerformed
        String nombreArticuloEscogido = cb_articulos.getSelectedItem() + "";
        for (int i = 0; i < cb_articulos.getItemCount(); i++) {
            if (nombreArticuloEscogido.equals(mantenimiento.getListaArticulos().get(i).getNombreArticulo())) {
                mantenimiento.nuevoRegistro();
                mantenimiento.mostrarDatosArticulo(i);
                this.dispose();
            }
        }
    }//GEN-LAST:event_bt_editarArticuloActionPerformed

    private void insertarArticulos() {
        cb_articulos.removeAllItems();
        for (int i = 0; i < mantenimiento.getListaArticulos().size(); i++) {
           String nombreArticulo = mantenimiento.getListaArticulos().get(i).getNombreArticulo();
           cb_articulos.addItem(nombreArticulo);
        }
    }
    
    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        insertarArticulos();
    }//GEN-LAST:event_formWindowActivated

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        if (cb_articulos.getItemCount() > 0) {
            mantenimiento.getListaArticulos().remove(cb_articulos.getSelectedIndex());
            insertarArticulos();
            mantenimiento.nuevoRegistro();
            GestorIO.mostrarString("Articulo eliminado correctamente");
        }
    }//GEN-LAST:event_bt_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_editarArticulo;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JComboBox cb_articulos;
    private javax.swing.JLabel lb_articulos;
    // End of variables declaration//GEN-END:variables
}
