/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Klient;
import model.Towar;

/**
 *
 * @author lreplin
 */
public class ViewClients extends javax.swing.JFrame {

    /**
     * Creates new form ViewWarehouse
     */
    DefaultTableModel model;
    NewTransaction nt;
    AddNewClient anc;
    
    public ViewClients(NewTransaction nt) {
        initComponents();
        this.nt = nt;
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) clientsTable.getModel();
        showExampleData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        addSelectedClient = new javax.swing.JButton();
        addNewClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista klientów");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Wybór klienta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        clientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imię", "Nazwisko / Nazwa", "Ulica i Nr", "Kod pocztowy", "Miejscowość", "NIP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clientsTable);

        addSelectedClient.setText("Dodaj zaznaczonego klienta");
        addSelectedClient.setActionCommand("");
        addSelectedClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSelectedClientActionPerformed(evt);
            }
        });

        addNewClient.setText("Rejestracja nowego klienta");
        addNewClient.setActionCommand("");
        addNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addNewClient)
                        .addGap(18, 18, 18)
                        .addComponent(addSelectedClient)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSelectedClient, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNewClient, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSelectedClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSelectedClientActionPerformed
        if (clientsTable.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Aby coś dodać, musisz to zaznaczyć!", "Ostrzeżenie", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (clientsTable.getSelectedRow() != -1) {
                int row = clientsTable.getSelectedRow();
                nt.setClient(new Klient(model.getValueAt(row, 0).toString(), model.getValueAt(row, 1).toString(), model.getValueAt(row, 3).toString(), model.getValueAt(row, 4).toString(), model.getValueAt(row, 2).toString(), model.getValueAt(row, 5).toString()));
                this.setVisible(false);
        }
    }//GEN-LAST:event_addSelectedClientActionPerformed

    private void addNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewClientActionPerformed
        anc = new AddNewClient(this);
        anc.setVisible(true);
    }//GEN-LAST:event_addNewClientActionPerformed
    
    private void showExampleData() {
        model.setRowCount(0);
        Object[] row = new Object[7];
            row[0] = "Jan";
            row[1] = "Kowalski";
            row[2] = "Warszawska 105";
            row[3] = "07-000";
            row[4] = "Łuków";
            row[5] = "8201581000";
            model.addRow(row);
            row[0] = "Adam";
            row[1] = "Nowak";
            row[2] = "Siedlecka 15";
            row[3] = "01-200";
            row[4] = "Warszawa";
            row[5] = "5002987192";
            model.addRow(row);
            row[0] = "Janusz";
            row[1] = "Kowalski";
            row[2] = "Testowa 1";
            row[3] = "02-100";
            row[4] = "Kraków";
            row[5] = "1238200987";
            model.addRow(row);
            row[0] = "Stefan";
            row[1] = "Kowalski";
            row[2] = "Warszawska 43";
            row[3] = "08-110";
            row[4] = "Siedlce";
            row[5] = "8211098111";
            model.addRow(row);

    }
    
    public void addToTable(Klient klient) {
        model.addRow(new Object[]{klient.getImie(), klient.getNazwisko(), klient.getUlicaINr(), klient.getKodPocztowy(), klient.getMiasto(), klient.getNip()});
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewClient;
    private javax.swing.JButton addSelectedClient;
    private javax.swing.JTable clientsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
