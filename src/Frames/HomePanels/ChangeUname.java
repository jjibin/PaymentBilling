/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.HomePanels;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JIBIN JOSE
 */
public class ChangeUname extends javax.swing.JPanel {

    /**
     * Creates new form ChangeUname
     */
    public ChangeUname() {
        initComponents();
        setSize(697, 369);
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
        oldu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        newu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 66));
        setMinimumSize(new java.awt.Dimension(697, 369));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(697, 369));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Current UserName");
        add(jLabel1);
        jLabel1.setBounds(109, 140, 130, 31);
        add(oldu);
        oldu.setBounds(240, 140, 253, 31);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("New UserName");
        add(jLabel2);
        jLabel2.setBounds(111, 190, 130, 50);
        add(newu);
        newu.setBounds(240, 200, 253, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/HomePanels/changebtn.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        add(jLabel3);
        jLabel3.setBounds(240, 270, 138, 46);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CHBG.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(150, 30, 344, 74);
    }// </editor-fold>//GEN-END:initComponents
String urn1,urn2,squsr;
int t;
    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        try {
            // TODO add your handling code here:
          urn1=oldu.getText();
          urn2=newu.getText();
          squsr="Update Admin set Username='"+urn2+"'where Username='"+urn1+"'";
                 Class.forName("com.mysql.jdbc.Driver");
                      Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbs","root","koha123");
                             PreparedStatement pst=con.prepareStatement(squsr);
                             t=pst.executeUpdate();
                              if(!newu.getText().isEmpty()) {
                            if(t>0){
                            JOptionPane.showMessageDialog(this, "Username Changed!");
                        }
                         }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ChangeUname.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField newu;
    private javax.swing.JTextField oldu;
    // End of variables declaration//GEN-END:variables
}