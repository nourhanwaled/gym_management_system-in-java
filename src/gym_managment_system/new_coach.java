/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gym_managment_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.*;
import database.user;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import database.Admin;
public class new_coach extends javax.swing.JFrame {
    /** Creates new form new_coach */
    //function data
    public new_coach() {
        initComponents();
        date();
        //this.setLocation(250,150);
        try{
           int id=100; 
           String str1=String.valueOf(id);
           jLabel47.setText(str1);
        Connection con=user.connect(); 
        PreparedStatement p=con.prepareStatement("select max(Id) from coach");
        ResultSet rs=p.executeQuery();
        while(rs.next()){
            id=rs.getInt(1);
            id=id+1;
            String str=String.valueOf(id);
            jLabel47.setText(str);
        }
        }catch(Exception ee){
            JOptionPane.showMessageDialog(null,ee);
        }
    }
//..........................
   public void date(){
   SimpleDateFormat dFormat=new SimpleDateFormat();
   Date date = new Date();  
   //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
   String strDate= dFormat.format(date); 
   jLabel62.setText(strDate);
 }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 51, 153));

        jButton10.setBackground(new java.awt.Color(0, 118, 221));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 51, 153));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new member.png"))); // NOI18N
        jLabel45.setText("New Coach");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 51, 153));
        jLabel46.setText("Coach ID:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 51, 153));
        jLabel47.setText("100");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 51, 153));
        jLabel48.setText("Name :");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 51, 153));
        jLabel49.setText("Father Name :");

        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(255, 51, 153));

        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 51, 153));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 51, 153));
        jLabel50.setText("Email :");

        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 51, 153));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 51, 153));
        jLabel51.setText("Gender :");

        jComboBox10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox10.setForeground(new java.awt.Color(255, 51, 153));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "female" }));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 51, 153));
        jLabel52.setText("Mobil Number :");

        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(255, 51, 153));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 51, 153));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton11.setText("Save");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 51, 153));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        jButton12.setText("Reset");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 51, 153));
        jLabel53.setText("Member Name :");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 51, 153));
        jLabel54.setText("Gym Time :");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 51, 153));
        jLabel55.setText("Date of subscription :");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 51, 153));
        jLabel56.setText("Age :");

        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(255, 51, 153));
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 51, 153));
        jLabel57.setText("Amout to pay/month :");

        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(255, 51, 153));

        jComboBox11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox11.setForeground(new java.awt.Color(255, 51, 153));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nour", "menna" }));

        jComboBox12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox12.setForeground(new java.awt.Color(255, 51, 153));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8-10 AM", "10-12 AM", "12-2 PM", "2-4 PM" }));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 118, 221));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 51, 153));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 51, 153));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 51, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 153));

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .add(26, 26, 26)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(jLabel52)
                                .add(jLabel51)
                                .add(jLabel48)
                                .add(jPanel7Layout.createSequentialGroup()
                                    .add(jLabel46)
                                    .add(18, 18, 18)
                                    .add(jLabel47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jTextField19)
                                .add(jLabel49)
                                .add(jTextField20)
                                .add(jTextField21)
                                .add(jComboBox10, 0, 400, Short.MAX_VALUE)
                                .add(jTextField22))
                            .add(jLabel50))
                        .add(85, 85, 85)
                        .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel53)
                            .add(jLabel56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField23)
                            .add(jPanel7Layout.createSequentialGroup()
                                .add(jLabel55)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(216, 216, 216))
                            .add(jTextField24)
                            .add(jLabel57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jComboBox11, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jComboBox12, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel58, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel59, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel60, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel62, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(jButton11)
                        .add(66, 66, 66)
                        .add(jButton12)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(jButton10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 912, Short.MAX_VALUE)
                        .add(jLabel45)
                        .add(62, 62, 62))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton10)
                    .add(jLabel45))
                .add(8, 8, 8)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel46)
                    .add(jLabel47))
                .add(18, 18, 18)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel48)
                    .add(jLabel53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBox11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel49)
                    .add(jLabel54))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBox12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel61)
                    .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel50)
                        .add(jLabel55)))
                .add(17, 17, 17)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel58)
                            .add(jLabel59)
                            .add(jLabel60)
                            .add(jLabel1)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel51)
                    .add(jLabel56))
                .add(18, 18, 18)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel52)
                    .add(jLabel57))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(38, 38, 38)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton11)
                    .add(jButton12))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(62, 62, 62))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new new_coach().setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Admin a=new Admin();
        String id=jLabel47.getText();
        String name=jTextField19.getText();
        String father_name=jTextField20.getText();
        String email=jTextField21.getText();
        String gender=(String)jComboBox10.getSelectedItem();
        String mobil=jTextField22.getText();
        String coach_name=(String)jComboBox11.getSelectedItem();
        String gymtime=(String)jComboBox12.getSelectedItem();
        String date_substraction=jLabel62.getText();
        String age=jTextField23.getText();
        String amount=jTextField24.getText();
        a.add_coach( id, name, father_name,  email, gender, mobil, coach_name, gymtime, date_substraction, age, amount);
        setVisible(false);
        new new_coach().setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(new_coach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_coach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_coach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_coach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_coach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    // End of variables declaration//GEN-END:variables

}
