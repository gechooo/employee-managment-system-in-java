/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Toolkit;

/**
 *
 * @author Chetan G
 */
public class masterinfohome extends javax.swing.JFrame {

    /**
     * Creates new form masterinfohome
     */
    public masterinfohome() {
        initComponents();
  /*      Toolkit kt = Toolkit.getDefaultToolkit();
        
        int width = (int) kt.getScreenSize().getWidth();
        int height = (int) kt.getScreenSize().getHeight();
        
        this.setSize(width,height);
    */
  
        this.setBounds(250,150,1150,500);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeeinfopanel = new javax.swing.JLabel();
        addnewrecord = new javax.swing.JButton();
        viewrecord = new javax.swing.JButton();
        updaterecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        setLocationByPlatform(true);

        employeeinfopanel.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        employeeinfopanel.setText("               Employee Record Panel");
        employeeinfopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        addnewrecord.setBackground(new java.awt.Color(204, 204, 204));
        addnewrecord.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        addnewrecord.setForeground(new java.awt.Color(51, 51, 51));
        addnewrecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/business_people_01.png"))); // NOI18N
        addnewrecord.setText("Add New Record");
        addnewrecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        addnewrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewrecordActionPerformed(evt);
            }
        });

        viewrecord.setBackground(new java.awt.Color(204, 204, 204));
        viewrecord.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        viewrecord.setForeground(new java.awt.Color(51, 51, 51));
        viewrecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/business_people_01.png"))); // NOI18N
        viewrecord.setText("View Record");
        viewrecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        viewrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewrecordActionPerformed(evt);
            }
        });

        updaterecord.setBackground(new java.awt.Color(204, 204, 204));
        updaterecord.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        updaterecord.setForeground(new java.awt.Color(51, 51, 51));
        updaterecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/business_people_01.png"))); // NOI18N
        updaterecord.setText("Update Record");
        updaterecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        updaterecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updaterecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(addnewrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(viewrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(updaterecord, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(employeeinfopanel, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(employeeinfopanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addnewrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updaterecord, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addnewrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewrecordActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        addmasterinfo addinfoobj = new addmasterinfo();
        addinfoobj.setVisible(true);
        
    }//GEN-LAST:event_addnewrecordActionPerformed

    private void viewrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewrecordActionPerformed
        // TODO add your handling code here:
        this.dispose();
        viewmasterinfo viewinfoobj = new viewmasterinfo();
        viewinfoobj.setVisible(true);
    }//GEN-LAST:event_viewrecordActionPerformed

    private void updaterecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaterecordActionPerformed
        // TODO add your handling code here:
        this.dispose();
        updatemasterinfo updateinfoobj = new updatemasterinfo();
        updateinfoobj.setVisible(true);
    }//GEN-LAST:event_updaterecordActionPerformed

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
            java.util.logging.Logger.getLogger(masterinfohome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(masterinfohome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(masterinfohome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(masterinfohome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new masterinfohome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnewrecord;
    private javax.swing.JLabel employeeinfopanel;
    private javax.swing.JButton updaterecord;
    private javax.swing.JButton viewrecord;
    // End of variables declaration//GEN-END:variables
}
