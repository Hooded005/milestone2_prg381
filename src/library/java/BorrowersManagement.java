/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.java;

import javax.swing.table.DefaultTableModel;
import library.database.DBConnection;
import static library.java.BooksManagement.db;

/**
 *
 * @author seanb
 */
public class BorrowersManagement extends javax.swing.JFrame {

    /**
     * Creates new form BorrowersManagement
     */
    public static DBConnection db = new DBConnection();
    
    public BorrowersManagement() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btn_dashboard4 = new javax.swing.JButton();
        btn_view4 = new javax.swing.JButton();
        btn_add4 = new javax.swing.JButton();
        btn_delete4 = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        txt_bid = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        lbl_surname = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        lbl_return = new javax.swing.JLabel();
        txt_returned = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Borrower Management");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BorrowerID", "Name", "Surname", "Returned"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        btn_dashboard4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_dashboard4.setText("Dashboard");
        btn_dashboard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboard4ActionPerformed(evt);
            }
        });

        btn_view4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_view4.setText("Display");
        btn_view4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view4ActionPerformed(evt);
            }
        });

        btn_add4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_add4.setText("Add");
        btn_add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add4ActionPerformed(evt);
            }
        });

        btn_delete4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_delete4.setText("Delete");
        btn_delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete4ActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        txt_bid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbl_id.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_id.setText("BorrowerID");

        lbl_name.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_name.setText("Name");

        txt_name.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbl_surname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_surname.setText("Surname");

        txt_surname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbl_return.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_return.setText("Returned");

        txt_returned.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btn_clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btn_view4)
                        .addGap(41, 41, 41)
                        .addComponent(btn_add4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id)
                            .addComponent(txt_bid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_name))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_delete4)
                    .addComponent(lbl_surname)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_return)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_update)
                            .addComponent(txt_returned, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_clear)
                            .addComponent(btn_dashboard4))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(lbl_name)
                    .addComponent(lbl_surname)
                    .addComponent(lbl_return))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_returned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dashboard4)
                    .addComponent(btn_view4)
                    .addComponent(btn_add4)
                    .addComponent(btn_delete4)
                    .addComponent(btn_update))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboard4ActionPerformed
        Dashboard db = new Dashboard();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_dashboard4ActionPerformed

    private void btn_view4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
        for (String[] row: db.displayBorrowers())
        {
            model.addRow(row);
        }
    }//GEN-LAST:event_btn_view4ActionPerformed

    private void btn_add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add4ActionPerformed
        // TODO add your handling code here:
        String id = txt_bid.getText();
        String name = txt_name.getText();
        String surname = txt_surname.getText();
        String returned = txt_returned.getText();
        
        db.addBorrower(id, name, surname, returned);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[] {id, name, surname, returned});
    }//GEN-LAST:event_btn_add4ActionPerformed

    private void btn_delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete4ActionPerformed
        // TODO add your handling code here:
        int rIndex = jTable1.getSelectedRow();        
        String id = jTable1.getValueAt(rIndex, 0).toString();
        
        db.deleteBorrower(id);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.removeRow(rIndex);
    }//GEN-LAST:event_btn_delete4ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String id = txt_bid.getText();
        String name = txt_name.getText();
        String surname = txt_surname.getText();
        String returned =txt_returned.getText();
        
        db.updateBorrower(id, name, surname, returned);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rIndex = -1;
        
        for (int i=0; i < model.getRowCount(); i++)
        {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(id))
            {
                rIndex = i;
            }
        }
        model.removeRow(rIndex);
        model.addRow(new Object[] {id, name, surname, returned});
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_bid.setText("");
        txt_name.setText("");
        txt_surname.setText("");
        txt_returned.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try
                {
                    db.connect();
                    //db.createBooksTable();
                }
                catch (ClassNotFoundException ex)
                {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(BorrowersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowersManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add4;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_dashboard4;
    private javax.swing.JButton btn_delete4;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_return;
    private javax.swing.JLabel lbl_surname;
    private javax.swing.JTextField txt_bid;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_returned;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
