/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Components;

import Classes.Automovel;
import Classes.Categoria;
import Classes.Cliente;
import Classes.Locacao;
import Classes.Marca;
import Classes.ModeloAutomovel;
import Classes.ModeloMotocicleta;
import Classes.ModeloVan;
import Classes.Motocicleta;
import Classes.Van;
import Classes.VeiculoI;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.OverlayLayout;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author beatr
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form Page
     */
    public MainPage() {
        initComponents();
    }
    public ArrayList<Cliente> clientsArrayList = new ArrayList<Cliente>();
    public ArrayList<VeiculoI> vehicleArrayList = new ArrayList<VeiculoI>();
    public ArrayList<Locacao> rentArrayList = new ArrayList<Locacao>();
    
    private String selected = "Select a Tab";

    public javax.swing.JTable ClienteList = new javax.swing.JTable();
    public javax.swing.JTable VehicleList = new javax.swing.JTable();   
    public javax.swing.JTable rentList = new javax.swing.JTable();

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ClientNav = new javax.swing.JButton();
        VahicleNav = new javax.swing.JButton();
        RentNav = new javax.swing.JButton();
        SellNav = new javax.swing.JButton();
        Label = new javax.swing.JLabel();
        Forms = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 86));

        ClientNav.setIcon(new javax.swing.ImageIcon("C:\\Users\\beatr\\Documents\\NetBeansProjects\\AluguelDeCarros\\src\\main\\java\\icons\\person.png")); // NOI18N
        ClientNav.setPreferredSize(new java.awt.Dimension(72, 72));
        ClientNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientNavActionPerformed(evt);
            }
        });

        VahicleNav.setIcon(new javax.swing.ImageIcon("C:\\Users\\beatr\\Documents\\NetBeansProjects\\AluguelDeCarros\\src\\main\\java\\icons\\car.png")); // NOI18N
        VahicleNav.setPreferredSize(new java.awt.Dimension(72, 72));
        VahicleNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VahicleNavActionPerformed(evt);
            }
        });

        RentNav.setIcon(new javax.swing.ImageIcon("C:\\Users\\beatr\\Documents\\NetBeansProjects\\AluguelDeCarros\\src\\main\\java\\icons\\deal.png")); // NOI18N
        RentNav.setPreferredSize(new java.awt.Dimension(72, 72));
        RentNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentNavActionPerformed(evt);
            }
        });

        SellNav.setIcon(new javax.swing.ImageIcon("C:\\Users\\beatr\\Documents\\NetBeansProjects\\AluguelDeCarros\\src\\main\\java\\icons\\loan.png")); // NOI18N
        SellNav.setPreferredSize(new java.awt.Dimension(72, 72));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(ClientNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(VahicleNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(RentNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(SellNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VahicleNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RentNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Label.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Forms)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Forms, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label.setText(selected);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void updateClientList() {
        Object Columns[] = {"Nome", "CPF"};
        Object Rows[][] = new Object[clientsArrayList.size()][2];
        for (int i = 0; i < clientsArrayList.size(); i++) {
            Rows[i][0] = clientsArrayList.get(i).getNome();
            Rows[i][1] = clientsArrayList.get(i).getCPF();
        }
        DefaultTableModel model = new DefaultTableModel(Rows, Columns);
        ClienteList.setModel(model);
        jScrollPane2.setViewportView(ClienteList);
    }
     public boolean findClientRent(Cliente c){
        for (Locacao rentArrayList1 : rentArrayList) {
            if (rentArrayList1.getCliente().getCPF().equals(c.getCPF())){
                return true;
            }
        }
        return false;
     }
    public void updateVehicleList() {
        Object Columns[] = {"Placa", "Ano", "Marca", "Tipo", "Estado"};
        Object Rows[][] = new Object[vehicleArrayList.size()][5];
        for (int i = 0; i < vehicleArrayList.size(); i++) {
            Rows[i][0] = vehicleArrayList.get(i).getPlaca();
            Rows[i][1] = vehicleArrayList.get(i).getAno();
            Rows[i][2] = vehicleArrayList.get(i).getMarca();
            Rows[i][3] = vehicleArrayList.get(i).getClass().getSimpleName();
            Rows[i][4] = vehicleArrayList.get(i).getEstado().getAtual();
        }
        DefaultTableModel model = new DefaultTableModel(Rows, Columns);
        VehicleList.setModel(model);
        jScrollPane2.setViewportView(VehicleList);
    }
    public void updateRentList (){
        Object Columns[] = {"Cliente", "Placa", "Valor"};
        Object Rows[][] = new Object[rentArrayList.size()][4];
        for(int i=0; i< rentArrayList.size(); i++){
            VeiculoI v = rentArrayList.get(i).getVeiculo();
            Rows[i][0] = rentArrayList.get(i).getCliente().getNome();
            Rows[i][1] = v.getPlaca();
            Rows[i][2] = rentArrayList.get(i).getValor();
        }
        DefaultTableModel model = new DefaultTableModel(Rows, Columns);
        rentList.setModel(model);
        jScrollPane2.setViewportView(rentList);
    }

    public void createClient(String Nome, String Sobrenome, String RG, String CPF, String Endereco) {
        Cliente c = new Cliente(Nome, Sobrenome, CPF, RG, Endereco);
        clientsArrayList.add(c);
        updateClientList();
    }
    
    public void createAutomovel(int ano, String placa, Categoria categoria, double valorDeVenda, Marca marca, ModeloAutomovel modelo){
        Automovel a = new Automovel( ano,  placa, categoria, valorDeVenda, marca, modelo);
        vehicleArrayList.add(a);
        updateVehicleList();
    }
    public void createMoto(int ano, String placa, Categoria categoria, double valorDeVenda, Marca marca, ModeloMotocicleta modelo){
        Motocicleta m = new Motocicleta(ano, placa, categoria, valorDeVenda, marca, modelo);
        vehicleArrayList.add(m);
        updateVehicleList();
    }
    public void createVan(int ano, String placa, Categoria categoria, double valorDeVenda, Marca marca, ModeloVan modelo){
        Van v = new Van(ano, placa,categoria, valorDeVenda, marca, modelo);
        vehicleArrayList.add(v);
        updateVehicleList();
    }

    public void DeleteClient() {
        Integer i = ClienteList.getSelectedRow();
        if (i != -1 ) {
            Cliente c = clientsArrayList.get(i);
            if(!findClientRent(c)){
            clientsArrayList.remove(c);
            }
        }
        updateClientList();
    }

    public void DeleteVehicle() {
        Integer i = VehicleList.getSelectedRow();
        if (i != -1) {
            vehicleArrayList.remove(vehicleArrayList.get(i));
        }
        updateClientList();
    }

    public void Delete() {
        switch (selected) {
            default:
                return;
            case "Clients":
                DeleteClient();
            case "Vehicles":
                DeleteVehicle();
        }
    }
    private void ClientNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientNavActionPerformed
        this.selected = "Clients";
        Label.setText(selected);
        updateClientList();
        ClienteForm cp = new ClienteForm(this);
        Forms.removeAll();
        Forms.add(cp);
    }//GEN-LAST:event_ClientNavActionPerformed

    private void VahicleNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VahicleNavActionPerformed
        this.selected = "Vehicles";
        Label.setText(selected);
        updateVehicleList();
        VehicleForm vf = new VehicleForm(this);
        Forms.removeAll();
        Forms.add(vf);
    }//GEN-LAST:event_VahicleNavActionPerformed

    private void RentNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentNavActionPerformed
        this.selected = "Rents";
        Label.setText(selected);
        RentForm rf = new RentForm(this);
        updateRentList();
        Forms.removeAll();
        Forms.add(rf);
    }//GEN-LAST:event_RentNavActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClientNav;
    private javax.swing.JTabbedPane Forms;
    private javax.swing.JLabel Label;
    private javax.swing.JButton RentNav;
    private javax.swing.JButton SellNav;
    private javax.swing.JButton VahicleNav;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
