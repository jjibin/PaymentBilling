/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.HomePanels;

import Frames.ClientInfo;
import Frames.ShowBillPrint;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JIBIN JOSE
 */
public class ShowBill extends javax.swing.JPanel {
DefaultTableModel mod;
    /**
     * Creates new form ShowBill
     */
    public ShowBill() {
        initComponents();
        U_Tableshow();
    }
    String g1,g2,g3,g4,g5,g6,g7,g8,sgq;
public void U_Tableshow()
{
        try {
            mod=(DefaultTableModel)jTable1.getModel();
            sgq="select * from Showprintbil";
                         Class.forName("com.mysql.jdbc.Driver");
                          Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbs","root","koha123");
                            PreparedStatement pst=conn.prepareStatement(sgq);
                           ResultSet rs=pst.executeQuery();
                             while(rs.next())
                           {
                                g1=rs.getString("Title");
                                g2=rs.getString("Status");
                                g3=rs.getString("Location");
                                g4=rs.getString("Date");
                                g5=rs.getString("Username");
                                g6=rs.getString("BillNo");
                                g7=rs.getString("Total");
                                Object raw[]={g1,g2,g3,g4,g5,g6,g7};
                               mod.addRow(raw);
                          }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ShowBill.class.getName()).log(Level.SEVERE, null, ex);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(923, 589));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(923, 589));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SPBL.png"))); // NOI18N

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop Name", "Content", "Location", "Date", "Username", "Bill No.", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(120);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(140);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(160);
        jTable1.getColumnModel().getColumn(2).setMinWidth(120);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(140);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(160);
        jTable1.getColumnModel().getColumn(3).setMinWidth(70);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents
String rr1,rr2,rr3,rr4,rr5,rr6,rr7,rr8;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2)
        {
            mod=(DefaultTableModel) jTable1.getModel();
        rr1=(String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        rr2=(String) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
        rr3=(String) jTable1.getValueAt(jTable1.getSelectedRow(), 2);
        rr4=(String) jTable1.getValueAt(jTable1.getSelectedRow(), 3);
        rr5=(String) jTable1.getValueAt(jTable1.getSelectedRow(), 4);
        rr6=(String) jTable1.getValueAt(jTable1.getSelectedRow(), 5);
        rr7=(String) jTable1.getValueAt(jTable1.getSelectedRow(), 6);
           try{
               ShowBillPrint shblprt=new ShowBillPrint();
           shblprt.setVisible(true);
               ShowBillPrint.jlb1.setText(rr1);
               ShowBillPrint.jlb8.setText(rr2);
               ShowBillPrint.jlb2.setText(rr3);
               ShowBillPrint.jlb4.setText(rr4);
               ShowBillPrint.jlb5.setText(rr5);
               ShowBillPrint.jlb3.setText(rr6);
               ShowBillPrint.jlb6.setText(rr7);
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Can't Open!");
           }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
