/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.HomePanels;

import Frames.Edit;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author JIBIN JOSE
 */
public class Reorder extends javax.swing.JPanel {

    /**
     * Creates new form Reorder
     */
    public Reorder() {
        initComponents();
        U_tabl();
  }
String pp1,pp2,pp3,pp4,pp5,pp6,cnit,itc8;
public void U_tabl(){
        try {
           String sql="select * from additem";
                 Class.forName("com.mysql.jdbc.Driver");
                  Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbs","root","koha123");
                    PreparedStatement pst=conn.prepareStatement(sql);
                   ResultSet rs=pst.executeQuery();
                     while(rs.next())
                   {
                        pp1=rs.getString(1);
                        pp2=rs.getString(2);
                        pp3=rs.getString(3);
                        pp4=rs.getString(4);
                        pp5=rs.getString(5);
                        pp6=rs.getString(6);
                       int lo=Integer.parseInt(pp5);
                       if(lo<50)
                       {
                           String itc7=rs.getString(2);
                           Reorder.rcombo.addItem(itc7);
                           itc8=rs.getString("Stock");
                           Reorder.rit2.setText(itc8);
                       }
                  }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Reorder.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel3 = new javax.swing.JLabel();
        rit2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        todayd = new javax.swing.JLabel();
        rcombo = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 229, 66));
        setMinimumSize(new java.awt.Dimension(828, 630));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(828, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reorderimg.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Item Name");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Current Stock ");

        rit2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rit2.setForeground(new java.awt.Color(0, 51, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reorder.PNG"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Date ");

        todayd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        todayd.setForeground(new java.awt.Color(0, 51, 255));
        todayd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                todaydMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                todaydMouseExited(evt);
            }
        });

        rcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rcomboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rit2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(todayd, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rit2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todayd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void todaydMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todaydMouseEntered
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
        todayd.setText(dateFormat.format(cal.getTime()));
        
    }//GEN-LAST:event_todaydMouseEntered

    private void todaydMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todaydMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_todaydMouseExited
String kjh,sq,kjh1;
int i;
    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        // TODO add your handling code here:
        try{
       kjh=rcombo.getSelectedItem().toString();
       kjh1=rit2.getText();
       int b=Integer.parseInt(kjh1);
         sq="Update additem set Stock='"+b+"'+50 where Itemname='"+kjh+"'";
             Class.forName("com.mysql.jdbc.Driver");
              Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbs","root","koha123");
                     PreparedStatement pst=con.prepareStatement(sq);
                      i=pst.executeUpdate();
                      if(!rcombo.getSelectedItem().toString().isEmpty()) {
                    if(i>0){
                    JOptionPane.showMessageDialog(this, "Requested for Reorder!");
                }
                 }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Reorder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MouseReleased
String sds,sjt1;
    private void rcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rcomboItemStateChanged
        try {
            // TODO add your handling code here:
             try{
                    cnit=rcombo.getSelectedItem().toString();
                }catch(Exception e){
                    
                }
            sds="select * from additem where Itemname=? and Stock<50";
                Class.forName("com.mysql.jdbc.Driver");
                Connection connjk=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbs","root","koha123");
                PreparedStatement pstjk=connjk.prepareStatement(sds);
                pstjk.setString(1, cnit);
                ResultSet rsjk=pstjk.executeQuery();
                       while(rsjk.next())
                         {
                             sjt1=rsjk.getString("Stock");
                             rit2.setText(sjt1);
                         }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Reorder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rcomboItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JComboBox rcombo;
    public static javax.swing.JLabel rit2;
    private javax.swing.JLabel todayd;
    // End of variables declaration//GEN-END:variables
}
