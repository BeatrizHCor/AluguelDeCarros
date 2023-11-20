/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

import Classes.VeiculoI;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author beatr
 */
public final class SellForm extends javax.swing.JPanel {

    /**
     * Creates new form SellForm
     */
    MainPage main;
    public SellForm(MainPage main) {
        initComponents();
        this.main = main;
        this.FilteredvehicleArrayList = filterVehicles();
        updateTables();
    }
    public ArrayList<VeiculoI> filterVehicles(){
        Stream<VeiculoI> fv = main.vehicleArrayList.stream().filter(v -> "Disponivel".equals(v.getEstado().getAtual()) || "Novo".equals(v.getEstado().getAtual()) );
        ArrayList<VeiculoI> lv = new ArrayList(fv.collect(Collectors.toList()));
        return lv;
    }
    
    public ArrayList<VeiculoI> FilteredvehicleArrayList = new ArrayList<VeiculoI>();
    public javax.swing.JTable FilteredVehicleList = new javax.swing.JTable(); 
    public void updateTables(){
        this.FilteredvehicleArrayList = filterVehicles();
        Object ColumnsVeiculo[] = {"Placa", "Valor Diário"};
        Object RowsVeiculo[][] = new Object[this.FilteredvehicleArrayList.size()][2];
        for(int i = 0; i< this.FilteredvehicleArrayList.size(); i++){
            RowsVeiculo[i][0] = this.FilteredvehicleArrayList.get(i).getPlaca();
            RowsVeiculo[i][1] = this.FilteredvehicleArrayList.get(i).getValorDiariaLocacao();
        }
        DefaultTableModel modelVeiculos = new DefaultTableModel(RowsVeiculo, ColumnsVeiculo);
        FilteredVehicleList.setModel(modelVeiculos);
        jScrollPane1.setViewportView(FilteredVehicleList);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Sell = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Sell.setText("Sell");
        Sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Sell)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellActionPerformed
        int vehicleindex = FilteredVehicleList.getSelectedRow();
        VeiculoI v = FilteredvehicleArrayList.get(vehicleindex);
        v.vender();
        updateTables();
        main.updateSalesList();
    }//GEN-LAST:event_SellActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sell;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
