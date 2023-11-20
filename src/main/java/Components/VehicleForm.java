/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

import Classes.Categoria;
import Classes.Marca;
import Classes.ModeloAutomovel;
import Classes.ModeloMotocicleta;
import Classes.ModeloVan;
import Classes.VeiculoI;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author beatr
 */
public class VehicleForm extends javax.swing.JPanel {

    private MainPage main;
    
    public VehicleForm(MainPage main) {
        initComponents();
        this.main = main;
        DefaultComboBoxModel modelM = new DefaultComboBoxModel();
        DefaultComboBoxModel modelCat = new DefaultComboBoxModel();
        for (Marca marca : marcas) {
            modelM.addElement(marca.getAtual());
        }
        for (Categoria categoria : categorias) {
            modelCat.addElement(categoria.getAtual());
        }
        VMarcaCombo.setModel(modelM);
        VCategoriaCombo.setModel(modelCat);
        main.updateVehicleList();
    }
    public Marca[] marcas = Marca.values();
    public Categoria[] categorias = Categoria.values();
    ModeloAutomovel[] opt = ModeloAutomovel.values();
    ModeloMotocicleta[] optMT = ModeloMotocicleta.values();
    ModeloVan[] optV = ModeloVan.values();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VAno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VPlaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        VVenda = new javax.swing.JTextField();
        Create = new javax.swing.JButton();
        Load = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        VModelCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        VMarcaCombo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        VCategoriaCombo = new javax.swing.JComboBox<>();
        VValorL = new javax.swing.JLabel();
        VLocaCliente = new javax.swing.JLabel();
        VEstado = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        VTipoCombo = new javax.swing.JComboBox<>();

        jPanel1.setPreferredSize(new java.awt.Dimension(530, 645));

        jLabel1.setText("Marca:");

        jLabel2.setText("Ano:");

        VAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VAnoActionPerformed(evt);
            }
        });

        jLabel3.setText("Placa:");

        VPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VPlacaActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado:");

        jLabel5.setText("Valor de Venda:");

        VVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VVendaActionPerformed(evt);
            }
        });

        Create.setText("Save New");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        Load.setText("Load");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Modelo:");

        VModelCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VModelComboActionPerformed(evt);
            }
        });

        jLabel8.setText("Ultima Locacao:");

        jLabel10.setText("Valor Locacao:");

        VMarcaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VMarcaComboActionPerformed(evt);
            }
        });

        jLabel12.setText("Categoria:");

        VCategoriaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VCategoriaComboActionPerformed(evt);
            }
        });

        VValorL.setText("N/A");

        VLocaCliente.setText("N/A");

        VEstado.setText("N/A");

        jLabel13.setText("Tipo:");

        VTipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Van", "Automovel", "Moto" }));
        VTipoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VTipoComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(VVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(VAno)
                                    .addComponent(VPlaca)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VMarcaCombo, 0, 140, Short.MAX_VALUE)
                                    .addComponent(VEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VValorL, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VModelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VCategoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VTipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                        .addComponent(VLocaCliente)
                                        .addGap(42, 42, 42)))
                                .addGap(40, 40, 40)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(VMarcaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(VAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VTipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VModelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(VCategoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(VEstado)
                            .addComponent(jLabel10)
                            .addComponent(VValorL))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(VVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VLocaCliente)
                    .addComponent(jLabel8))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(332, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VAnoActionPerformed

    private void VPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VPlacaActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        int modeloIndex = VModelCombo.getSelectedIndex();
        int marcaIndex = VMarcaCombo.getSelectedIndex();
        int categoriaIndex = VCategoriaCombo.getSelectedIndex();
        int tipoIndex = VTipoCombo.getSelectedIndex();
        Marca marca = marcas[marcaIndex];
        Categoria categoria = categorias[categoriaIndex];
        String Placa = VPlaca.getText();
        int Ano = Integer.parseInt(VAno.getText());
        double valorDeVenda = Double.parseDouble(VVenda.getText());
        switch(tipoIndex){
            default:
                return;
            case 1:
                ModeloVan mv = optV[modeloIndex];
                this.main.createVan(Ano, Placa, categoria, valorDeVenda, marca, mv);
                return;
            case 2:
                ModeloAutomovel ma = opt[modeloIndex];
                this.main.createAutomovel(Ano, Placa, categoria, valorDeVenda, marca, ma);
                return;
            case 3:
                ModeloMotocicleta mmt = optMT[modeloIndex];
                this.main.createMoto(Ano, Placa, categoria, valorDeVenda, marca, mmt);
                return;
        }
    }//GEN-LAST:event_CreateActionPerformed

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
       int i = main.VehicleList.getSelectedRow();
       VeiculoI v = main.vehicleArrayList.get(i);
       VAno.setText(String.valueOf(v.getAno()));
       VPlaca.setText(v.getPlaca());
       VVenda.setText(String.valueOf(v.getValorParaVenda()));
       VValorL.setText(String.valueOf(v.getValorDiariaLocacao()));
       VEstado.setText(v.getEstado().getAtual());
       VLocaCliente.setText(v.getLocacao() == null ? "Não Locado" : v.getLocacao().getCliente().getNome());
       
    }//GEN-LAST:event_LoadActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        this.main.Delete();
    }//GEN-LAST:event_DeleteActionPerformed

    private void VVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VVendaActionPerformed

    private void VModelComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VModelComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VModelComboActionPerformed

    private void VMarcaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VMarcaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VMarcaComboActionPerformed

    private void VTipoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VTipoComboActionPerformed
       switch(VTipoCombo.getSelectedIndex()){
           case 0:
               DefaultComboBoxModel model = new DefaultComboBoxModel();
               VModelCombo.setModel(model);
               return;
           case 1:
               
               DefaultComboBoxModel modelVan = new DefaultComboBoxModel();
               for(ModeloVan optV1: optV){
                   modelVan.addElement(optV1.getModelo());
               }
               VModelCombo.setModel(modelVan);
               return;
           case 2:
               
               DefaultComboBoxModel modelAM = new DefaultComboBoxModel();
           for (ModeloAutomovel opt1 : opt) {
               modelAM.addElement(opt1.getModelo());
           }
               VModelCombo.setModel(modelAM);
               return;
           case 3:
               DefaultComboBoxModel modelMT = new DefaultComboBoxModel();
           for (ModeloMotocicleta optMT1 : optMT) {
               modelMT.addElement(optMT1.getModelo());
           }
               VModelCombo.setModel(modelMT);
               return; 
       }
    }//GEN-LAST:event_VTipoComboActionPerformed

    private void VCategoriaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VCategoriaComboActionPerformed
        
    }//GEN-LAST:event_VCategoriaComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Load;
    private javax.swing.JTextField VAno;
    private javax.swing.JComboBox<String> VCategoriaCombo;
    private javax.swing.JLabel VEstado;
    private javax.swing.JLabel VLocaCliente;
    private javax.swing.JComboBox<String> VMarcaCombo;
    private javax.swing.JComboBox<String> VModelCombo;
    private javax.swing.JTextField VPlaca;
    private javax.swing.JComboBox<String> VTipoCombo;
    private javax.swing.JLabel VValorL;
    private javax.swing.JTextField VVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
