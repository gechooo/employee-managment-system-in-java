package newpackage;


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nauman
 */
public class addmasterinfo extends javax.swing.JFrame {

    /**
     * Creates new form addmasterinfo
     */
    
    static String filepath=null;
    
    
    public addmasterinfo() {
        initComponents();
    /*    this.setAlwaysOnTop(true); */
        
   /*     Toolkit kt = Toolkit.getDefaultToolkit();
        
        int width = (int) kt.getScreenSize().getWidth();
        int height = (int) kt.getScreenSize().getHeight();
        
        this.setSize(width*2/3,height*2/3);
     */
   
         this.setBounds(250,150,1300,560);
    //    idlable.setText("Id Proof photo's size must be under width "+idlable.getWidth()+" and height "+idlable.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerlabel = new javax.swing.JLabel();
        namelable = new javax.swing.JLabel();
        statelable = new javax.swing.JLabel();
        citylable = new javax.swing.JLabel();
        dateofjoininglable = new javax.swing.JLabel();
        salarylable = new javax.swing.JLabel();
        departmentlable = new javax.swing.JLabel();
        contactnumberlable = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        statetf = new javax.swing.JTextField();
        citytf = new javax.swing.JTextField();
        dateofjoiningtf = new javax.swing.JTextField();
        salarytf = new javax.swing.JTextField();
        departmenttf = new javax.swing.JTextField();
        contactnumbertf = new javax.swing.JTextField();
        resetbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        idlable = new javax.swing.JLabel();
        attachidproofbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        headerlabel.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        headerlabel.setText("     Add New Employee's Information");
        headerlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        namelable.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        namelable.setText("Enter Name :");

        statelable.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        statelable.setText("Enter State :");

        citylable.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        citylable.setText("Enter City  :");

        dateofjoininglable.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dateofjoininglable.setText("Date Of Joining (dd/mm/yy) :");

        salarylable.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        salarylable.setText("Enter Salary (Per Month) :");

        departmentlable.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        departmentlable.setText("Enter Department :");

        contactnumberlable.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        contactnumberlable.setText("Enter Contact Number  :");

        nametf.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        statetf.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        citytf.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        dateofjoiningtf.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dateofjoiningtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateofjoiningtfActionPerformed(evt);
            }
        });

        salarytf.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        departmenttf.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        contactnumbertf.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        resetbtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        resetbtn.setText("Reset Inforamation");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        savebtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        savebtn.setText("Save Inforamation");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        idlable.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        idlable.setText("                 Id Proof Will Appear Here");
        idlable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        attachidproofbtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        attachidproofbtn.setText("Attach Id Proof");
        attachidproofbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachidproofbtnActionPerformed(evt);
            }
        });

        homebtn.setBackground(new java.awt.Color(255, 255, 255));
        homebtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/home icon - Copy.png"))); // NOI18N
        homebtn.setText("Go To Home");
        homebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(statelable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(namelable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addComponent(dateofjoininglable, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(citylable, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salarylable, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departmentlable, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactnumberlable, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(contactnumbertf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                .addComponent(departmenttf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salarytf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateofjoiningtf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(citytf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(statetf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nametf, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idlable, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(attachidproofbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homebtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(namelable))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statelable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(citytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(citylable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateofjoiningtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateofjoininglable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salarytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salarylable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departmenttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departmentlable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactnumbertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactnumberlable))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetbtn)
                            .addComponent(savebtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(idlable, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attachidproofbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(612, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        
         try
        {
        
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fms","root","");
            
            PreparedStatement stmt = con.prepareStatement("insert into masterinfo(name,state,city,dateofjoining,salary,department,contactnumber,image) values(?,?,?,?,?,?,?,?)");
            
            FileInputStream fin=new FileInputStream(filepath);  
            
            stmt.setString(1,nametf.getText());
            stmt.setString(2,statetf.getText());
            stmt.setString(3,citytf.getText());
            stmt.setString(4,dateofjoiningtf.getText());
            stmt.setString(5,salarytf.getText());
            stmt.setString(6,departmenttf.getText());
            stmt.setString(7,contactnumbertf.getText());
            stmt.setBinaryStream(8,fin,fin.available()); 
            
            int i = stmt.executeUpdate();
            
            
            
           if(i!=0)
            {
                JOptionPane.showMessageDialog(this,"** Record Is Saved Succesfully **"); 
                    nametf.setText("");
                    statetf.setText("");
                    citytf.setText("");
                    dateofjoiningtf.setText("");
                    salarytf.setText("");
                    departmenttf.setText("");
                    contactnumbertf.setText("");
                    idlable.setIcon(null);
                 
        
            }
            
           
           else
           {
               JOptionPane.showMessageDialog(this,"! Record Is Not Saved !");
           }
            con.close();
            
        }
        
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void attachidproofbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachidproofbtnActionPerformed
        // TODO add your handling code here:
        
        JFileChooser filechooser = new JFileChooser();
        filechooser.showOpenDialog(null);
        File file =  filechooser.getSelectedFile();
        filepath = file.getAbsolutePath();
        ImageIcon icon = new ImageIcon(new ImageIcon(filepath).getImage().getScaledInstance(idlable.getWidth(), idlable.getHeight(),Image.SCALE_DEFAULT));
        idlable.setText("");
        idlable.setIcon(icon);
      
    }//GEN-LAST:event_attachidproofbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        
        nametf.setText("");
        statetf.setText("");
        citytf.setText("");
        dateofjoiningtf.setText("");
        salarytf.setText("");
        departmenttf.setText("");
        contactnumbertf.setText("");
        idlable.setIcon(null);
   
    }//GEN-LAST:event_resetbtnActionPerformed

    private void dateofjoiningtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateofjoiningtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateofjoiningtfActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        masterinfohome homeobj = new masterinfohome();
        homeobj.setVisible(true);
    }//GEN-LAST:event_homebtnActionPerformed

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
            java.util.logging.Logger.getLogger(addmasterinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addmasterinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addmasterinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addmasterinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addmasterinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attachidproofbtn;
    private javax.swing.JLabel citylable;
    private javax.swing.JTextField citytf;
    private javax.swing.JLabel contactnumberlable;
    private javax.swing.JTextField contactnumbertf;
    private javax.swing.JLabel dateofjoininglable;
    private javax.swing.JTextField dateofjoiningtf;
    private javax.swing.JLabel departmentlable;
    private javax.swing.JTextField departmenttf;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel idlable;
    private javax.swing.JLabel namelable;
    private javax.swing.JTextField nametf;
    private javax.swing.JButton resetbtn;
    private javax.swing.JLabel salarylable;
    private javax.swing.JTextField salarytf;
    private javax.swing.JButton savebtn;
    private javax.swing.JLabel statelable;
    private javax.swing.JTextField statetf;
    // End of variables declaration//GEN-END:variables
}
