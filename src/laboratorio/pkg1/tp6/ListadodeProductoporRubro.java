/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg1.tp6;

import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Producto;

/**
 *
 * @author pollo
 */
public class ListadodeProductoporRubro extends javax.swing.JInternalFrame {

  DefaultTableModel tab = new DefaultTableModel();
    public ListadodeProductoporRubro() {
        initComponents();
         String ids [] = {"Codigo" , "Descripcion", "Precio", "Stock"};
        tab.setColumnIdentifiers(ids);
        jTrubro.setModel(tab);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTrubro = new javax.swing.JTable();

        jLabel1.setText("Listado por presio de Rubro");

        jLabel2.setText("Elija un Rubro:");

        rubro.setModel(new javax.swing.DefaultComboBoxModel<>(new Categoria[] { Categoria.COMESTIBLE, Categoria.LIMPIEZA, Categoria.PERFUMERIA }));
        rubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubroActionPerformed(evt);
            }
        });

        jTrubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Presio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTrubro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rubro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubroActionPerformed
        // TODO add your handling code here:
         Categoria encontrao = (Categoria) rubro.getSelectedItem();
        borrarFilas();
        for (Producto encontrar : SuperMercado.productos) {

            if (encontrar.getRubro().equals(encontrao)) {

                tab.addRow(new Object[]{encontrar.getCodigo(), encontrar.getDescripcion(), encontrar.getPrecio(), encontrar.getStock()});

            }
    }//GEN-LAST:event_rubroActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTrubro;
    private javax.swing.JComboBox<Categoria> rubro;
    // End of variables declaration//GEN-END:variables
 private void borrarFilas(){
        int indice = tab.getRowCount() -1;
        
        for (int i = indice;i>=0;i--){
            tab.removeRow(i);
        }
    }
}
